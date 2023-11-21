package banco;

import banco.produto.Produto;

import java.util.List;

class Agencia {
    protected String nome;
    protected String endereco;
    protected Integer numero_ag;
    protected Banco banco;
    protected List<Cliente> clientes;
    protected List<Produto> produtos;

    protected Agencia(String nome, String endereco,Banco banco ,Integer numero_ag) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero_ag = numero_ag;
        this.banco = banco;
        this.clientes = new java.util.ArrayList<>();
        this.produtos = new java.util.ArrayList<>();
    }

    protected String get_nome(){
        return this.nome;
    }

    protected void set_cliente(Cliente cliente) {
        clientes.add(cliente);
    }

    protected void show_clientes() {
        for (Cliente obj : clientes) {
            System.out.println(obj.get_nome());
        }
    }

    protected void set_produto(Produto produto) {
        produtos.add(produto);
    }

    protected void show_produtos() {
        for (Produto obj : produtos) {
            System.out.println(obj.get_tipo());

        }
    }
}
