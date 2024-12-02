package MyPackage;

import javax.swing.*;
import java.awt.*;

public class Second extends JFrame {

    public Second() {
        setTitle("Две надписи");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Раз");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLUE);
        panel1.add(label1);
        add(panel1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Два");
        label2.setFont(new Font("Serif", Font.ITALIC, 16));
        label2.setForeground(Color.RED);
        panel2.add(label2);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Second();
    }
}