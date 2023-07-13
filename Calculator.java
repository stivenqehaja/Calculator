package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, eqButton, delButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Arial", Font.BOLD, 25);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        frame = new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(415, 563);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setBounds(50, 30, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("C");
        negButton = new JButton("NEG");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = eqButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(clrButton);
        frame.add(textField);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == numberButtons[i]) {
                    textField.setText(textField.getText().concat(String.valueOf(i)));
                }
            }
            if (e.getSource() == decButton) {
                textField.setText(textField.getText().concat("."));
            }
            if (e.getSource() == addButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '+';
                textField.setText("");
            }
            if (e.getSource() == subButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '-';
                textField.setText("");
            }
            if (e.getSource() == mulButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '*';
                textField.setText("");
            }
            if (e.getSource() == divButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '/';
                textField.setText("");
            }
            if (e.getSource() == eqButton) {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
                num1 = result;
            }
            if (e.getSource() == clrButton) {
                textField.setText("");
            }

            if (e.getSource() == delButton) {
                String text = textField.getText();
                if (text.length() > 0) {
                    textField.setText(text.substring(0, text.length() - 1));
                }
            }
            if (e.getSource() == negButton) {
                double temp = Double.parseDouble(textField.getText());
                temp *= -1;
                textField.setText(String.valueOf(temp));
            }
        } catch (NumberFormatException ex) {
            textField.setText("Error");
        }
    }

  
}
