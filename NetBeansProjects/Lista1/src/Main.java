
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome;
        String raca;
        int idade;
        int op = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("digite o nome do cachorro");
        nome = s.next();
        System.out.println("digite a raça do cachorro");
        raca = s.next();
        System.out.println("digite a idade do cachorro");
        idade = s.nextInt();

        Cachorro c = new Cachorro(nome, raca, idade);
         
         

        do {
            System.out.println("digite 1 para o cachorro comer");
            System.out.println("digite 2 para o cachorro dormir");
            System.out.println("digite 3 para o cachorro passear");
            System.out.println("digite 4 para sair");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println(c.comer());
                    break;
                case 2:
                    System.out.println(c.dormir());
                    break;
                case 3:
                    System.out.println(c.passear());
                    break;

                case 4:
                    System.out.println("fim do programa");
                default:
                    System.out.println("operação invalida tente novamente");
            }

        } while (op != 4);

    }
}
