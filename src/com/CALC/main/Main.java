package com.CALC.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    private JFrame window;

    public Main(){
        window =  new JFrame("Calculator");
        window.setContentPane(new Panel());
        window.pack();
        window.setMinimumSize(window.getSize());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}