package entities;

import java.util.Date;

public class ProdutosComida extends Produtos {
    
    // ATRIBUTOS
    private Date fabricacao;
    private Date validade;
    private Date dataAtual = new Date();
    // ATRIBUTOS
    
    // CONSTRUTORES
    public ProdutosComida() {
        super();
    }
    
    public ProdutosComida(String nome, Double preco, Integer quantidade, String tempoProduto, Date fabricacao, Date validade) {
        super(nome, preco, quantidade, tempoProduto);
        this.fabricacao = fabricacao;
        this.validade = validade;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Date getFabricacao() {
        return fabricacao;
    }
    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    // ENCAPSULAMENTO

    // METODOS
    public String validadeAtual() {
        if (validade.compareTo(dataAtual) < 0 || validade.compareTo(dataAtual) == 0) {
            return "VENCIDO";
        }
        else {
            return "VALIDO";
        }
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
            " Preco: R$" + getPreco() +
            " Quantidade: " + getQuantidade() +
            " Idade: " + getTempoProduto() +
            " Fabricação: " + sdf.format(fabricacao) +
            " Validade: " + sdf.format(validade) + 
            " Validade Atual: " + validadeAtual();
    }
    // METODOS
    



    
    

}
