import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        frame.setMinimumSize(new Dimension(800, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       

        JLabel myLabel = new JLabel("Hello World !!!", SwingConstants.CENTER);
        myLabel.setFont(new Font("Serif", Font.BOLD, 22));
        myLabel.setOpaque(true);
        myLabel.setPreferredSize(new Dimension(100, 80));

        frame.getContentPane().add(myLabel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}