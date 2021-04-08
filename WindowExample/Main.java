import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,200);

        JLabel label = new JLabel("Hello World!", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 22));
        label.setOpaque(true);
        label.setPreferredSize(new Dimension(100, 80));

        JButton button = new JButton("Change label");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (label.getText().equals("Hello World!")) {
                    label.setText("changed!");
                } else {
                    label.setText("Hello World!");
                }
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}