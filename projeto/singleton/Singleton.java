package Upis.projeto.singleton;

public class Singleton extends Dados{

    private static Singleton instance;

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
