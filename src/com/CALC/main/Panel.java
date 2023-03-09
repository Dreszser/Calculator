package com.CALC.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel{

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,310);
    }

    private JButton numbers[] = new JButton[10];
    private JButton backspace = new JButton("C");
    private JButton equal = new JButton("=");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiply = new JButton("*");
    private JButton divide = new JButton("/");

    private Font font = new Font("SanSerif", Font.BOLD, 20);
    private JTextField output = new JTextField();
    public Panel(){
        setLayout(null);
        setBackground(Color.GREEN);

        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                numbers[y * 3 + x + 1] = new JButton(Integer.toString(y * 3 + x + 1));
                numbers[y * 3 + x + 1].setBounds(x * 60 + 10, y * 60 + 70, 50, 50);
                numbers[y * 3 + x + 1].setFont(font);
                this.add(numbers[y * 3 + x + 1]);
            }
        }
        numbers[0] = new JButton("0");
        numbers[0].setBounds(70, 250, 50, 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        output.setBounds(10, 10, 230, 50 );
        output.setEditable(false);
        output.setFont(font);
        add(output);

        backspace.setBounds(10, 250, 50, 50 );
        backspace.setFont(font);
        add(backspace);

        equal.setBounds(130, 250, 50, 50 );
        equal.setFont(font);
        add(equal);

        plus.setBounds(190, 70, 50, 50 );
        plus.setFont(font);
        add(plus);

        minus.setBounds(190, 130, 50, 50 );
        minus.setFont(font);
        add(minus);

        multiply.setBounds(190, 190, 50, 50 );
        multiply.setFont(font);
        add(multiply);

        divide.setBounds(190, 250, 50, 50 );
        divide.setFont(font);
        add(divide);

        ActionListener l = (ActionEvent e) -> {
            JButton b = (JButton)e.getSource();
            output.setText(output.getText() + b.getText());
        };

        for(JButton b : numbers){
            b.addActionListener(l);
        }
    }
}
