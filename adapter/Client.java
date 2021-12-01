package Padros.adapter;

import javax.swing.*;

public class Client {

    public static void main(String[] args) {

        Target t = new Adapter();

        String msg = "Erro inesperado!";
        //String title = "ERRO!";
        int tipo = JOptionPane.ERROR_MESSAGE;

        //JOptionPane.showMessageDialog(null, msg, title, tipo);

        t.exibirMensagem(msg, tipo);

    }
}
