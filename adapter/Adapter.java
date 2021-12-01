package Padros.adapter;

import javax.swing.*;

public class Adapter implements Target{

    private final Adaptee2 adaptee;

    public Adapter(){
        adaptee = new Adaptee2();
    }

    @Override
    public void exibirMensagem(String msg, int tipo) {

        switch(tipo) {
            case JOptionPane.ERROR_MESSAGE:
                msg = "ERRO! : " + msg;
                break;
            case JOptionPane.WARNING_MESSAGE:
                msg = "ALERTA! : " + msg;
                break;
            default:
                msg = "INFORMAÇÃO! :" + msg;
                break;
        }

        adaptee.mostrarMensagem(msg);
    }
}
