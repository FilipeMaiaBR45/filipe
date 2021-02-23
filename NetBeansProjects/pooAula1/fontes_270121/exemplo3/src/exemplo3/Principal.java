package exemplo3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;

		Scanner teclado = new Scanner(System.in);
		
		Lampada l1 = new Lampada();
		
		do {
			System.out.println("\n\t   MENU PRINCIPAL   ");
			System.out.println("\t1 - Ligar");
			System.out.println("\t2 - Desligar");
			System.out.println("\t3 - Esta ligada? ");
			System.out.println("\t4 - Verificar pot�ncia");
			System.out.println("\t5 - Alterar pot�ncia");
			System.out.println("\t6 - Sair");
			System.out.print("\tDigite a op��o desejada: \n\t"); 
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1: l1.ligar();
				break;
			case 2: l1.desligar();
				break;
			case 3: //System.out.println("Status da l�mpada: "+l1.estaLigada());
				if(l1.estaLigada())
					System.out.println("A l�mpada est� ligada");
				else
					System.out.println("A l�mpada est� desligada");
				break;
			case 4: System.out.println("Pot�ncia da l�mpada: "+l1.verificarPotencia());
				break;
			case 5: System.out.println("Qual o valor da nova pot�ncia? ");
				l1.setPotencia(teclado.nextInt());
				break;
			case 6: System.out.println("Fim de Programa!");
				break;
			default: System.out.println("A op��o digitada � inv�lida, tente novamente!");
			}
			
		}while(opcao!=6);
		
		
	}
	

}
