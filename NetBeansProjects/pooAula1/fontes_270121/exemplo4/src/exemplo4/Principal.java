package exemplo4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a capacidade do elevador e o total de andares do prédio: ");
		
		Elevador e1 = new Elevador(teclado.nextInt(), teclado.nextInt());
		
		do {
			System.out.println("\n\t   MENU PRINCIPAL   ");
			System.out.println("\t1 - Entrar no elevador");
			System.out.println("\t2 - Sair do elevador");
			System.out.println("\t3 - Subir um andar");
			System.out.println("\t4 - Descer um andar");
			System.out.println("\t5 - Verificar quantidade atual de pessoas");
			System.out.println("\t6 - Verificar andar atual do elevador");
			System.out.println("\t7 - Sair do Sistema");
			System.out.print("\tDigite a opção desejada: \n\t"); 
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1: e1.entra();
				break;
			case 2: e1.sai();
				break;
			case 3: e1.sobe();
				break;
			case 4: e1.desce();
				break;
			case 5: System.out.println("Quantiade = "+e1.getQtdPessoas());
				break;
			case 6: System.out.println("Andar atual = "+e1.getAndarAtual());
				break;
			case 7: System.out.println("Fim de Programa!");
				break;
			default: System.out.println("A opção digitada é inválida, tente novamente!");
			}
			
		}while(opcao!=7);
		
	}
	
}
