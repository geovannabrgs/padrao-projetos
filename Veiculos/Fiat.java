package Veiculos;

public class Fiat implements IVeiculo{
    String modeloVeiculo;
    String potencia;
    String combustivel;
    String corVeiculo;

    public Fiat() {
        this.modeloVeiculo = "Uno";
        this.potencia = "75cv";
        this.combustivel = "Flex";
        this.corVeiculo = "Azul";
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "modeloVeiculo='" + modeloVeiculo + '\'' +
                ", potencia='" + potencia + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", corVeiculo='" + corVeiculo + '\'' +
                '}';
    }

    @Override
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    @Override
    public String getPotencia() {
        return potencia;
    }

    @Override
    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public String getCorVeiculo() {
        return corVeiculo;
    }
}
