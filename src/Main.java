import banco.Agencia;
import banco.Banco;

public class Main {
    public static void main(String[] args){
        Banco b1 = new Banco("itau");
        System.out.println(b1.get_nome());
        Agencia ag1 = b1.set_agencias();
        Agencia ag2 = b1.set_agencias();

        b1.show_agencias();
    }
}