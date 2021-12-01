package padrao.decorator;

public class Main {
    public static void main(String[] args) {

        ISorvete s = new Sorvete();

        System.out.println(s);

        Ingredientes f = new Chocolate(s);

        System.out.println(f);

        Ingredientes c = new Flocos(f);

        System.out.println(c);
    }
}
