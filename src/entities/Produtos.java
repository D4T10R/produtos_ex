package entities;

import java.text.SimpleDateFormat;

public abstract class Produtos {

    // ATRIBUTOS
    private String nome;
    private Double preco;
    private Integer quantidade;
    private TempoProduto tempoProduto;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // ATRIBUTOS

    // CONSTRUTORES
    public Produtos() {
    }

    public Produtos(String nome, Double preco, Integer quantidade, String tempoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        if (tempoProduto == "VELHO") {
            this.tempoProduto = TempoProduto.VELHO;
        }
        else {
            this.tempoProduto = TempoProduto.NOVO;
        }
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public TempoProduto getTempoProduto() {
        return tempoProduto;
    }
    // ENCAPSULAMENTO

    // METODOS
    public Double totalProduto() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
            "Preco: R$" + preco +
            "Quantidade: " + quantidade +
            "Idade: " + tempoProduto;
    }
    // METODOS
    


    


}