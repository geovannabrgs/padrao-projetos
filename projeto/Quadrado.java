package Upis.projeto;

public class Quadrado implements IFiguraBidimensional {

    private int lado;

    public Quadrado() {
        this.lado = 1;
    }

    public Quadrado(int lado) {
        if (!condicaoExistencia(lado)){
            throw new RuntimeException("Impossivel criar quadrado!");
        }
        this.lado = lado;
    }

    private boolean condicaoExistencia(int l){
        return l > 0;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if(condicaoExistencia(lado))
            this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "(" + this.lado + ", " + this.lado + ", " + this.lado + ", " +  this.lado + ")";
    }
}
