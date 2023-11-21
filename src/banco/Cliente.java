package banco;

import banco.produto.Conta;
import banco.produto.Produto;

import java.util.List;
import java.util.Objects;

class Cliente {
    protected String nome;
    protected String tel;
    protected Agencia agencia;
    protected List<Produto> produtos;

    protected Cliente(String nome,String tel ,Agencia agencia) {
        this.nome = nome;
        this.tel = tel;
        this.agencia = agencia;
    }

    public void show_agencia_e_banco(){
        Integer agencia = this.agencia.get_numero();
        String banco = this.agencia.show_banco();
        System.out.println("Agência: " + agencia + " e banco: " + banco);
    }
    //public contratar_produto(){
    //
    //}

    public String get_nome() {
        //System.out.println(this.nome);
        return  this.nome;
    }
}
