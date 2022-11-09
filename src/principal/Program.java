package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.lang.model.util.ElementScanner14;

import entities.Produtos;
import entities.ProdutosComida;
import entities.ProdutosObjeto;
import entities.ProdutosRoupa;
import entities.TempoProduto;

public class Program {
    
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)  {
        
      
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\Leona\\Documents\\out\\desc_prod.txt");
        List<Produtos> produtos = new ArrayList<>();

        try {
            
            Boolean ok = file.createNewFile();
            

            System.out.println("\n------SEJA BEM VINDO!------");
            System.out.print("Quatos produtos você deseja cria? ");
            int quantosProdutos = sc.nextInt();
            for (int i = 0; i < quantosProdutos; i++) {

                System.out.println("\n1 - Comida \n2 - Roupa \n3 - Objeto");
                int tipo = sc.nextInt();
                sc.nextLine();
                
                System.out.print("\nNome: ");
                String nome = sc.nextLine();
                System.out.print("preço: ");
                Double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                Integer quantidade = sc.nextInt();


                System.out.print("Velho/Novo: ");
                sc.next();
                String tmpProd = sc.nextLine().toUpperCase();
                

                if (tipo == 1) {
                    
                    System.out.print("Qual a data de fabricação? (dd/mm/yyyy)");
                    Date fabricacao = sdf.parse(sc.nextLine());
                    System.out.print("Qual a data de vencimento? (dd/mm/yyyy)");
                    Date validade = sdf.parse(sc.nextLine());
                    produtos.add(new ProdutosComida(nome, preco, quantidade, tmpProd, fabricacao, validade));

                } else if (tipo == 2) {

                    System.out.print("Qual o tamanho da roupa: ");
                    int tamanho = sc.nextInt();
                    produtos.add(new ProdutosRoupa(nome, preco, quantidade, tmpProd, tamanho));

                } else if (tipo == 3) {

                    System.out.println("Tamanho objeto: ");
                    System.out.print("Largura: ");
                    Double largura = sc.nextDouble();
                    System.out.print("Altura: ");
                    Double altura = sc.nextDouble();
                    System.out.println("Profundidade: ");
                    Double profundidade = sc.nextDouble();
                    produtos.add(new ProdutosObjeto(nome, preco, quantidade, tmpProd, largura, altura, profundidade));

                } else {
                    System.out.println("ERRO! no tipo de produto, repita novamente");
                    i--;
                }

            }
        }
        catch (Exception e ) {
            e.printStackTrace();
        }



        // GRAVAR NO ARQUIVO
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(produtos.toString());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

      




    }

}
