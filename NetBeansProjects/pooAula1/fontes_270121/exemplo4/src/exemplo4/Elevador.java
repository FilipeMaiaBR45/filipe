package exemplo4;

public class Elevador {
	private int andarAtual; //t�rreo = 0
	private int totalAndares; // desconsiderando o t�rreo
	private int capacidade; // capacidade m�xima de pessoas no elevador
	private int qtdPessoas; // quantidade atual de pessoas no elevador
	

	public Elevador(int capacidade, int totalA) { //construtor
		andarAtual = 0;
		this.capacidade = capacidade;
		this.totalAndares = totalA;
		qtdPessoas = 0;
	}
	
	public void entra() {
		if(qtdPessoas<capacidade)
			qtdPessoas++;
	}
	
	public void sai() {
		if(qtdPessoas>0)
			qtdPessoas--;
	}
	
	public void sobe() {
		if(andarAtual<totalAndares)
			andarAtual++;
	}

	public void desce() {
		if(andarAtual>0)
			andarAtual--;
	}
	
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
}
