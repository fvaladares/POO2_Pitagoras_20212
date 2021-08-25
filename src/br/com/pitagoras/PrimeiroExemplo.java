package br.com.pitagoras;

import javax.swing.*;

public class PrimeiroExemplo {

    PrimeiroExemplo() {
        // Criando nosso container (organizador do layout)
        JFrame container = new JFrame("Nosso Primeiro Exemplo");

        // Define o tamanho da janela
        container.setSize(300, 100);
        // Ação padrão ao fechar
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rótulo exibido na tela.
        JLabel jLabelMsg = new JLabel("Sejam bem vindos à disciplina de POO 2.");

        // Vincula o componente ao container
        container.add(jLabelMsg);

//        Define a exibição do container.
        container.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeiroExemplo();
            }
        });
    }
}
