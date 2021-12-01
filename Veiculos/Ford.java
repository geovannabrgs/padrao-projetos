package Veiculos;

public class Ford implements IVeiculo{
    String modeloVeiculo;
    String potencia;
    String combustivel;
    String corVeiculo;

    public Ford() {
        this.modeloVeiculo = "Ka";
        this.potencia = "85cv";
        this.combustivel = "Flex";
        this.corVeiculo = "Preto";
    }

    @Override
    public String toString() {
        return "Ford{" +
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
