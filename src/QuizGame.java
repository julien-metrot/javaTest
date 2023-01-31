import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Question
        String question = "What is the capital of France?";
        JLabel label = new JLabel(question);
        panel.add(label);

        // Text Field
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Submit button
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer = textField.getText();
                if (answer.equalsIgnoreCase("Paris")) {
                    JOptionPane.showMessageDialog(frame, "Correct!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Wrong, the correct answer is Paris.");
                }
            }
        });
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}