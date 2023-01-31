import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2560, 1440);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name);
            }
        });
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}