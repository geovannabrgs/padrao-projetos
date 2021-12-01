package Veiculos;

public class Volkswagen implements IVeiculo{
    String modeloVeiculo;
    String potencia;
    String combustivel;
    String corVeiculo;

    public Volkswagen() {
        this.modeloVeiculo = "Polo";
        this.potencia = "86cv";
        this.combustivel = "Flex";
        this.corVeiculo = "Branco";
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "modeloVeiculo='" + modeloVeiculo + '\'' +
                ", potencia='" + potencia + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", corVeiculo='" + corVeiculo + '\'' +
                '}';
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }
}
