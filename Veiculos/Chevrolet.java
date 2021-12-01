package Veiculos;

public class Chevrolet implements IVeiculo{
    String modeloVeiculo;
    String potencia;
    String combustivel;
    String corVeiculo;

    public Chevrolet() {
        this.modeloVeiculo = "Onix";
        this.potencia = "116cv";
        this.combustivel = "Flex";
        this.corVeiculo = "Vermelho";
    }

    @Override
    public String toString() {
        return "Chevrolet{" +
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
