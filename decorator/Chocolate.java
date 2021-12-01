package padrao.decorator;

public class Chocolate extends Ingredientes{

    public Chocolate(ISorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double valor() {
        return sorvete.valor() + 1;
    }

    @Override
    public String descricao() {
        return sorvete.descricao() + ", " + "Chocolate";
    }

    @Override
    public String toString() {
        return valor() + ": " + descricao();
    }
}
