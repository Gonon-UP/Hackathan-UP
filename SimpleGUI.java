import javax.swing.*;
import java.awt.*;
 
// SOURCE COMES FROM
// https://www.javaspring.net/blog/how-to-make-a-graphical-user-interface-in-java/


public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
 
        // Create a JPanel to hold components
        JPanel panel = new JPanel();
 
        // Create a JLabel
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);
 
        // Create a JButton
        JButton button = new JButton("Click me");
        panel.add(button);
 
        // Add the panel to the frame
        frame.add(panel);
 
        // Make the frame visible
        frame.setVisible(true);
    }
}
