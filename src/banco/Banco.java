package banco;

import java.util.List;
import java.util.Scanner;

public class Banco {
    public String nome;
    public List<Agencia> agencias;

     public Banco(String nome) {
        this.nome = nome;
        this.agencias = new java.util.ArrayList<>();
    }
     public String get_nome(){
         return this.nome;
     }

    public Agencia set_agencias() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Entre com o número de conta");
        String num_str = myObj.nextLine();
        int num = Integer.parseInt(num_str);

        System.out.println("Informe o endereço");
        String end = myObj.nextLine();

        Agencia agg = new Agencia(num, end, this);
        agencias.add(agg);
        return agg;
    }

    public void show_agencias() {
        for (Agencia obj : agencias) {
            System.out.println("AG: " + obj.get_numero());
        }
    }

}
