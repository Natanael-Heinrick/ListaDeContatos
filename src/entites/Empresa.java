package entites;

public class Empresa {
    public String nome;
    public double preco;
    public int quantidade;

    public Empresa(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //
    public double valorTotalEstoque(){
        return preco * quantidade;
    }

    // ADICIONANDO NO ESTOQUE

    public void adicionandoProduto(int produto){

        this.quantidade += produto;

    }

    public String toString(){
        return "O preço do produto é " + preco  + "e a quantidade nova no estoque é: " + valorTotalEstoque();
    }
}
