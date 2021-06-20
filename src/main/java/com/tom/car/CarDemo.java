package com.tom.car;

import javax.swing.*;
import java.awt.*;

public class CarDemo {
    private JPanel mainPanel = new JPanel();
    String name;
    private JButton button1 = new JButton("Clink me");
    private JButton button2 = new JButton("WoW");

    private JPanel panel1;

    public static void main(String[] args) {

        CarDemo carDemo = new CarDemo();


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.add(carDemo.button1);
        panel.add(carDemo.button2);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setVisible(true);
    }
}
