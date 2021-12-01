package padrao.decorator;

public class Sorvete implements ISorvete {

    @Override
    public double valor() {
        return 1.5;
    }

    @Override
    public String descricao() {
        return "Casquinha";
    }

    @Override
    public String toString() {
        return valor() + ": " + descricao();
    }
}
