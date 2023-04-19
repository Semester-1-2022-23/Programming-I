import javax.swing.*;

public class hw9 extends JFrame {
    public hw9() {
        super("Hello World Frame");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args) {
        hw9 frame = new hw9();
        frame.setVisible(true);
    }
}
