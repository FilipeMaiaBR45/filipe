package q02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("--------- Menu principal ---------");
        System.out.println("----------------------------------");
        System.out.println("1: Fazer pedido:");
        System.out.println("2: Confirmar pedido");
        System.out.println("3: Cancelar pedido");
        System.out.println("4: Sair");
            
        int opcao;
        Pedido p = new Pedido();

        do {
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("digite o edereço e a hora da compra");

                }
                break;
                
                case 2: {
                    System.out.println("Deseja confirmar pedido?");
                    p.mostrarInfoPedido();
                    System.out.println("Você confirma? se sim escreva 'confirma', se nao escreva 'nao'");
                    String confirm = s.nextLine();
                    if (confirm == "confirma") {
                        p.setStatusPedido("confirmado");
                    } else if (confirm == "nao") {

                    } else {
                        System.out.println("Informações não identificada");
                    }
                }
                break;
                case 3: {
                    System.out.println("Deseja cancelar pedido?");

                }
                break;
                case 4: {
                    System.out.println("4: Sair");
                }
                break;
                default:
                    break;
            }
        } while (opcao != 4);

    }
}
