package padrao.decorator;

public abstract class Ingredientes implements ISorvete {

    public ISorvete sorvete;

    public Ingredientes(ISorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public double valor() {
        return sorvete.valor();
    }

    @Override
    public String descricao() {
        return null;
    }
}
