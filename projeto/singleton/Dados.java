package Upis.projeto.singleton;

public class Dados{

    int pontos;
    int min = 2;
    int max = 12;
    boolean result;

    private boolean rolarDados(){
        pontos = (int)(Math.random()*(max-min+1)+min);

        if(pontos > 6){
            return result = true;
        } else {
            return result = false;
        }
    }

    public void resultado() {
        if (rolarDados()) {
            System.out.println("Você marcou " + pontos + " Pontos e venceu o jogo! :)) ");
        } else {
            System.out.println("Você marcou " + pontos + " Pontos e perdeu o jogo. :(");
        }
    }

}
