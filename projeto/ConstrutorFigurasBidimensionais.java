package Upis.projeto;

public class ConstrutorFigurasBiDimensionais implements IConstrucaoFigurasBiDimensionais{


    @Override
    public IFiguraBidimensional criar(String nomeFigura) {
        if(nomeFigura.equals("triangulo")) {
            return new Triangulo();
        }
        if(nomeFigura.equals("retangulo")) {
            return new Retangulo();
        }
        if(nomeFigura.equals("circulo")) {
            return new Circulo();
        }
        if(nomeFigura.equals("quadrado")) {
            return new Quadrado();
        }
        return null;
    }
}
