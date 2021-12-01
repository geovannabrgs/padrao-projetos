package Upis.projeto;

import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {

        IConstrucaoFigurasBiDimensionais cf;

        cf = new ConstrutorFigurasBiDimensionais();

        IFiguraBidimensional f;

        f = cf.criar("quadrado");

        System.out.println(f);
    }

}
