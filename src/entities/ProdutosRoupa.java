package entities;

public class ProdutosRoupa extends Produtos {

    // ATRIBUTOS
    private int tamanho;
    // ATRIBUTOS

    // CONSTRUTORES
    public ProdutosRoupa() {
        super();
    }

    public ProdutosRoupa(int tamanho) {
        this.tamanho = tamanho;
    }

    public ProdutosRoupa(String nome, Double preco, Integer quantidade, TempoProduto tempoProduto, int tamanho) {
        super(nome, preco, quantidade, tempoProduto);
        this.tamanho = tamanho;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    // ENCAPSULAMENTO

    // METODO
    public String tipoDeTamanho(){
        if (tamanho > 0 && tamanho <= 15) {
            return "infantil";
        }
        else if (tamanho > 15 && tamanho <= 30) {
            return "pequeno";
        }
        else if (tamanho > 30 && tamanho <= 60) {
            return "medio";
        }
        else if (tamanho > 60 && tamanho <= 100) {
            return "grande";
        }
        else if (tamanho > 100 & tamanho <= 200) {
            return "gigante";
        }
        else {
            return "Não existe ou é personalizado";
        }
    }
    // METODO
    
    
}
