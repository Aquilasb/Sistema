package model.bean;
public class Cd {

 
    private int id_cd;
    private String nome;
    private String preco;
    private String descricao;
    private int quantidade;
    private int vendas;
    private int numero_vendas;
    private int contador;

    public int getId_cd() {
        return id_cd;
    }

    public void setId_cd(int id_cd) {
        this.id_cd = id_cd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

   public int getNumero_vendas() {
        return numero_vendas;
    }

    public void setNumero_vendas(int numero_vendas) {
        this.numero_vendas = numero_vendas+1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador-1;
    }

   
}

   