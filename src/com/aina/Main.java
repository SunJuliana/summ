package com.aina;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// a+b

    JFrame window = new JFrame("a+b");
    window.setBounds(5,5,500,400);
    window.setLayout(null);

    // поля для ввода
        JTextField a_Fild = new JTextField();
        JTextField b_Fild = new JTextField();
        a_Fild.setBounds(175,45,150,50);
        b_Fild.setBounds(175,105,150,50);
        window.add(a_Fild);
        window.add(b_Fild);
    //кнопка
    JButton button = new JButton("сумма");
    button.setBounds(175,165,150,50);
    Color backgroundColor = new Color(23, 90, 10);
    button.setBackground (backgroundColor);
    button.setForeground (Color.WHITE);
    window.add(button);
        // надпись
        JLabel label = new JLabel("тут будет сумма");
        label.setBounds(205,225,150,50);
        window.add(label);
        // обработчик нажатия на кнопку
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=0,b=0;
                boolean a_ok=false, b_ok=false;
                try {
                    a = Integer.parseInt(a_Fild.getText());
                    a_ok = true;
                }
                catch (Exception err){
                    JOptionPane.showMessageDialog(null, "В поле А введено некорректное значение");
                }
                try {
                    b = Integer.parseInt(b_Fild.getText());
                    b_ok = true;
                }
                 catch (Exception err){
                    JOptionPane.showMessageDialog(null, "В поле B введено некорректное значение");
                }

                if (a_ok & b_ok) label.setText (a+b+"");
                else label.setText("сложение не удалось");


            }
        };
        button.addActionListener(actionListener);

window.setVisible(true);
    }
}
