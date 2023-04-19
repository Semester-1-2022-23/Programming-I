import javax.swing.*;
import java.awt.event.*;

public class hw10 {
    private static int count = 0;
    private static JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Counter");
        JButton button = new JButton("0");
        label = new JLabel("0");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(Integer.toString(count));
            }
        });
        frame.add(button);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
