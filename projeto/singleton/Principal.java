package Upis.projeto.singleton;

public class Principal {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();

        System.out.println(s);

        s.resultado();

    }
}
