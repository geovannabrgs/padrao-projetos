package padrao.decorator;

public class Flocos extends Ingredientes{

    public Flocos(ISorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double valor() {
        return sorvete.valor() + 1;
    }

    @Override
    public String descricao() {
        return sorvete.descricao() + ", " + "Flocos";
    }

    @Override
    public String toString() {
        return valor() + ": " + descricao();
    }
}
