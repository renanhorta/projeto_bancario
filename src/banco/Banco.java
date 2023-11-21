package banco;

import java.util.List;

 class Banco {
    protected String nome;
    protected List<Agencia> agencias;



    protected Banco(String nome) {
        this.nome = nome;
        this.agencias = new java.util.ArrayList<>();
    }
     protected String get_nome(){
         return this.nome;
     }

    protected void set_agencias(Agencia agg) {
        agencias.add(agg);
    }

    protected void show_agencias() {
        for (Agencia obj : agencias) {
            System.out.println(obj.get_nome());
        }
    }

}
