package Veiculos;

public class ConstrutorVeiculos implements IConstrutorVeiculos{

    public IVeiculo criar(String marcaVeiculo){
        if(marcaVeiculo.equals("Volkswagen")){
            return new Volkswagen();
        }
        if(marcaVeiculo.equals("Chevrolet")){
            return new Chevrolet();
        }
        if(marcaVeiculo.equals("Ford")){
            return new Ford();
        }
        if(marcaVeiculo.equals("Fiat")){
            return new Fiat();
        }
        else{
            return null;
        }
    }
}
