public class Cachorro {
   private String nome;
   private String raca;
   private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    
   public String comer(){
   return "o cachorro de nome " + nome + " da raça " + raca + " com idade de " + idade + " anos está comendo";
   }
   
   public String dormir(){
   return "o cachorro de nome " + nome + " da raça " + raca + " com idade de " + idade + " anos está dormindo";
   }
   public String passear(){
   return "o cachorro de nome " + nome + " da raça " + raca + " com idade de " + idade + " anos está passeando";
   }
}
