package banco;

import banco.produto.Produto;

import java.util.List;

public class Agencia {
    protected Integer numero;
    protected String endereco;
    protected Banco banco;
    protected List<Cliente> clientes;
    protected List<Produto> produtos;

    protected Agencia(Integer numero, String endereco,Banco banco) {
        this.numero = numero;
        this.endereco = endereco;
        this.banco = banco;
        this.clientes = new java.util.ArrayList<>();
        this.produtos = new java.util.ArrayList<>();
    }

    public Integer get_numero(){
        return this.numero;
    }

    public String show_banco(){
        String banco = this.banco.get_nome();
        System.out.println(banco);
        return banco;
    }

    public void set_cliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void show_clientes() {
        for (Cliente obj : clientes) {
            System.out.println(obj.get_nome());
        }
    }

    public void set_produto(Produto produto) {
        produtos.add(produto);
    }

    /*public void show_produtos() {
        for (Produto obj : produtos) {
            System.out.println(obj.get_tipo());

        }
    }*/
}
