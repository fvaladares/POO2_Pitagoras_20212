package br.com.pitagoras.exemplobotao.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploBotao implements ActionListener {

    private JLabel jLabelResultado;

    public ExemploBotao() {
        JFrame container = new JFrame("Exemplo de uso do botão");
        container.setLayout(new FlowLayout());

        container.setSize(200, 90);

        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);

        container.add(jButtonUp);
        container.add(jButtonDown);

        jLabelResultado = new JLabel("Por favor, pressione um botão");

        container.add(jLabelResultado);

        container.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Up"))
            jLabelResultado.setText("Você pressionou o botão UP");
        else
            jLabelResultado.setText("Você pressionou o botão DOWN");
    }
}
