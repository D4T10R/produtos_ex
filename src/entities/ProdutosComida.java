package entities;

import java.util.Date;

public class ProdutosComida extends Produtos {
    
    // ATRIBUTOS
    private Date fabricacao;
    private Date validade;
    // ATRIBUTOS
    
    // CONSTRUTORES
    public ProdutosComida() {
        super();
    }
    
    public ProdutosComida(String nome, Double preco, Integer quantidade, TempoProduto tempoProduto, Date fabricacao, Date validade) {
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
    public String validadeAtual(Date dataAtual) {
        if (validade.compareTo(dataAtual) < 0 || validade.compareTo(dataAtual) == 0) {
            return "VALIDO";
        }
        else {
            return "VENCIDO";
        }
    }
    // METODOS
    



    
    

}
