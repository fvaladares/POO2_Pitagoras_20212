package br.com.pitagoras.exemplobotao;

import br.com.pitagoras.exemplobotao.view.ExemploBotao;

import javax.swing.*;

public class MainExemploBotao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploBotao();
            }
        });
    }
}
