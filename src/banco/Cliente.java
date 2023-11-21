package banco;

import banco.produto.Produto;

import java.util.List;

class Cliente {
    protected String nome;
    protected Agencia numero_ag;
    protected List<Cliente> clientes;
    protected List<Produto> produtos;

    protected Cliente(String nome, String endereco, Integer numero_ag) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero_ag = numero_ag;
        this.clientes = new java.util.ArrayList<>();
        this.produtos = new java.util.ArrayList<>();
    }

}
