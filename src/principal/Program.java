package principal;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.lang.model.util.ElementScanner14;

public class Program {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\n------SEJA BEM VINDO!------");
            System.out.print("Quatos produtos você deseja cria? ");
            int quantosProdutos = sc.nextInt();
            for (int i = 0; i < quantosProdutos; i++) {
                System.out.println("\n1 - Comida \n2 - Roupa \n3 - Objeto");
                int tipo = sc.nextInt();
                System.out.print("\nNome: ");
                String nome = sc.nextLine();
                System.out.print("preço: ");
                Double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                Integer quantidade = sc.nextInt();
                if (tipo == 1) {

                } else if (tipo == 2) {

                } else if (tipo == 3) {

                } else {
                    System.out.println("ERRO! no tipo de produto, repita novamente");
                    i--;
                }

            }
        }




    }

}
