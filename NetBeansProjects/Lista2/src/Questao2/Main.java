package Questao2;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Pedido p1 = new Pedido();
		int op;
		int decision, pagOption;
		String formadPagamentoAux="";
		do {
		System.out.println("----------------------------------");
		System.out.println("       MENU PRINCIPAL");
		System.out.println("----------------------------------");
		System.out.println("1 - Fazer Pedido");
		System.out.println("2 - Status do pedido");
		System.out.println("3 - Cancelar pedido");
		System.out.println("4 - SAIR");
		System.out.println("-----------------------------------");
		System.out.println("Escolha a opção desejada: ");
		op = teclado.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Digite o seu nome ");
			teclado.nextLine();
			p1.setNomeCliente(teclado.nextLine());
			
			System.out.println("Digite o endereco da entrega: ");
			p1.setEndEntrega(teclado.nextLine());
			
			System.out.println("Quantos botijoes deseja?");
			p1.setQtdButijao(teclado.nextInt());;
			
			System.out.println("Digite selecione a forma de pagamento: ");
			System.out.println("1 - Dinheiro  / 2 - Cartão Debito / 3 - Cartão Crédito");
			pagOption = teclado.nextInt();
			if (pagOption==1) {
				formadPagamentoAux = "Dinheiro";
			} else if (pagOption==2) {
				formadPagamentoAux="Cartão Débito";
			} else if (pagOption==3) {
				formadPagamentoAux="Cartão Crédito";
			}
			p1.setFormadPagamento(formadPagamentoAux);
			System.out.println("Confirme seu pedido");
			System.out.println("Endereco de entrega "+p1.getEndEntrega());
			System.out.println("Quantidade de botijao "+p1.getQtdButijao());
			System.out.println("Forma de pagamento "+p1.getFormadPagamento());;
			System.out.println("Esta correto seu pedido? 1 - PARA SIM / 0 - PARA NAO");
			decision = teclado.nextInt();
			if (decision == 1) {
				System.out.println("Pedido confirmado!");
				break;
			}else {
				System.out.println("Digite o seu nome ");
				teclado.nextLine();
				p1.setNomeCliente(teclado.nextLine());
				
				System.out.println("Digite o endereco da entrega: ");
				p1.setEndEntrega(teclado.nextLine());
				
				System.out.println("Quantos botijoes deseja?");
				p1.setQtdButijao(teclado.nextInt());;
				
				System.out.println("Digite selecione a forma de pagamento: ");
				System.out.println("1 - Dinheiro  / 2 - Cartão Debito / 3 - Cartão Crédito");
				pagOption = teclado.nextInt();
				if (pagOption==1) {
					formadPagamentoAux = "Dinheiro";
				} else if (pagOption==2) {
					formadPagamentoAux="Cartão Débito";
				} else if (pagOption==3) {
					formadPagamentoAux="Cartão Crédito";
				}
				p1.setFormadPagamento(formadPagamentoAux);
				System.out.println("Confirme seu pedido");
				System.out.println("Endereco de entrega "+p1.getEndEntrega());
				System.out.println("Quantidade de botijao "+p1.getQtdButijao());
				System.out.println("Forma de pagamento "+p1.getFormadPagamento());
				System.out.println("Confirmado, Em caso de duvidas ligue para o 7070 se nao conseguir 70 de novo");
				decision = 1;
			}
				break;
		case 2:
			System.out.println(p1.getStatusPedido());
			break;
		}
		} while(op!=7);
}
}