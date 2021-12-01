package Veiculos;

import Upis.projeto.ConstrutorFigurasBiDimensionais;

public class Principal {
    public static void main(String[] args) {

        IConstrutorVeiculos build;
        build = new ConstrutorVeiculos();

        IVeiculo veiculo;

        veiculo = build.criar("Ford");
        System.out.println(veiculo);

    }
}
