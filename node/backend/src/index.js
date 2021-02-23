const express = require('express');
const { uuid, isUuid } =  require('uuidv4');

const app = express();

app.use(express.json());

/*
metodos http:

 * GET: Buscas informações do back-end
 * POST: Criar uma informação no back-end
 * PUT/PATH: Alterar uma informação no back-end(PUT é para atualizar varias informações e o PATH geralmente utilizado para alterar apenas uma)
 * DELETE: Deletar uma informação no back-end

*/

/**
 * Tipos de parametros
 * 
 * Query Params: Fistros e paginação
 * Rout Params: identificar recursos (aualizar/deletar)
 * Request Body: conteudo na hora de criar ou editar um recurso (JSON)
 */

 /**
  * Middleware
  * 
  * interceptador de requisições que pode interromper totalmete a requisição ou alterar os dados da requisição
  */

const projects = [];

//middleware
function logRequests(request, response, next){
    const {method, url} = request;

    const logLabel = `[${method.toUpperCase()}] ${url}`;

    console.time(logLabel);

    next(); //próximo middleware

    console.timeEnd(logLabel);
}

function validateProjectId(request, response, next){
    const { id } = request.params;

    if(!isUuid(id)){
        return response.status(400).json({ error: 'invalidate id'})
    }
    return next;
}

app.use(logRequests);

//colando os middlwares nas rotas /project/:id
app.use('/projects/:id', validateProjectId);

app.get('/projects', (request, response) => {
   const {title} = request.query;

   const results = title
   ? projects.filter(project => project.title.includes(title))
   : projects;

  // console.log(title);
  // console.log(owner);
    return response.json(results);
})

app.post('/projects', (request, response) => {
    const {title, owner} = request.body;

    const project = { id: uuid(),title, owner};

    projects.push(project);
   
   
    return response.json(project);
})

app.put('/projects/:id',  (request, response) => {
    const { id } = request.params;
    const {title, owner} = request.body;

    const projectIndex = projects.findIndex(project => project.id == id);
    
    if (projectIndex < 0){
        return response.status(400).json({error: 'project not found'});
    }

    const project = {
        id,
        title,
        owner,
    };

    projects[projectIndex] = project;
    
    return response.json(project);
 })

 app.delete('/projects/:id', (request, response) => {
    const { id } = request.params;
    
    const projectIndex = projects.findIndex(project => project.id == id);
    
    if (projectIndex < 0){
        return response.status(400).json({error: 'project not found'});
    }

    projects.splice(projectIndex, 1);
    
    return response.status(204).send();
 })
app.listen(3333, () => {
    console.log('👌Back-end started');
});