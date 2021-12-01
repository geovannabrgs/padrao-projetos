package Upis.projeto;

public class Retangulo implements IFiguraBidimensional {

    private int comprimento;
    private int largura;

    private boolean condicaoExistencia(int c, int l){
        return c > 0 && l > 0;
    }

    public Retangulo(){
        this.comprimento = 2;
        this.largura = 1;
    }

    public Retangulo(int comprimento, int largura) {
        if (!condicaoExistencia(comprimento, largura)) {
            throw new RuntimeException("Impossivel criar retangulo!");
        }
        this.comprimento = comprimento;
        this.largura = largura;
    }


    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLado(int comprimento) {
        if (condicaoExistencia(comprimento, this.largura)){
            this.comprimento = comprimento;
        }
    }

    public void setLado(int comprimento, int largura) {
        if (condicaoExistencia(comprimento, largura)){
            this.comprimento = comprimento;
            this.largura = largura;
        }
    }

    public void setComprimento(int comprimento) {
        if (condicaoExistencia(comprimento, this.largura)){
            this.comprimento = comprimento;
        }
    }

    public void setLargura(int largura) {
        if(condicaoExistencia(this.comprimento, largura)) {
            this.largura = largura;
        }
    }

    @Override
    public double perimetro() {
        return comprimento + comprimento + largura + largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }

    @Override
    public String toString() {
        return "(" + this.comprimento + ", " +  this.comprimento + ", " +  this.largura + ", " + this.largura + ")";
    }
}
