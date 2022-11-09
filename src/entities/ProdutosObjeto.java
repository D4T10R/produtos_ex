package entities;

public class ProdutosObjeto extends Produtos {

    // ATRIBUTOS
    private Double largura;
    private Double altura;
    private Double profundidade; 
    // ATRIBUTOS
   
    // CONSTRUTORES
    public ProdutosObjeto() {
        super();
    }

    public ProdutosObjeto(String nome, Double preco, Integer quantidade, String tempoProduto, Double largura, Double altura, Double profundidade) {
        super(nome, preco, quantidade, tempoProduto);
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getLargura() {
        return largura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
    // ENCAPSULAMENTO
    
    // METODOS
    public Double area(){
        return getAltura() * getLargura() * getProfundidade();
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
            " Preco: R$" + getPreco() +
            " Quantidade: " + getQuantidade() +
            " Idade: " + getTempoProduto() +
            " Largura: " + largura +
            " Altura: " + altura + 
            " Profundidade: " + profundidade;
    
    }
    // METODOS

    
}
