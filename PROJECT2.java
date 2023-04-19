import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameField {
    private int targetValue;
    private int currentSum = 0;
    private int movesToCompletion;
    private Random rand;
    private JButton[][] field = new JButton[9][9];
    private JLabel bottomLABEL;
    private JLabel mathLABEL;
    private String mathOperation;
    private String[] mathOperations = {"+", "-", "*", "/"};

    GameField() {
        JFrame frame = new JFrame();
        frame.setBounds(150, 150, 1000, 700);
        rand = new Random();

        //target label
        targetValue = rand.nextInt(100) + 1;
        JPanel topPANEL = new JPanel();
        JLabel topLABEL = new JLabel("Target: " + targetValue);
        topPANEL.add(topLABEL, BorderLayout.WEST);
        frame.add(topPANEL, BorderLayout.NORTH);

        //math operation label
        mathOperation = mathOperations[rand.nextInt(4)];
        mathLABEL = new JLabel("Operation: " + mathOperation);
        topPANEL.add(mathLABEL, BorderLayout.EAST);

        //Fill game field with random values
        JPanel panelGrid = new JPanel(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                field[i][j] = new JButton();
                int value = rand.nextInt(10);
                field[i][j].setText("" + value);
                field[i][j].addActionListener(new buttonListener());
                panelGrid.add(field[i][j]);
            }
        }
        frame.add(panelGrid);

        //sum label
        JPanel bottomPANEL = new JPanel();
        bottomLABEL = new JLabel("Sum: " + currentSum);
        bottomPANEL.add(bottomLABEL, BorderLayout.CENTER);
        frame.add(bottomPANEL, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GameField();
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            int value = Integer.parseInt(clickedButton.getText());
            switch (mathOperation) {
                case "+":
                    currentSum += value;
                    break;
                case "-":
                    currentSum -= value;
                    break;
                case "*":
                    currentSum *= value;
                    break;
                case "/":
                    currentSum /= value;
                    break;
            }
            mathOperation = mathOperations[rand.nextInt(4)];
            mathLABEL.setText("Operation: " + mathOperation);
            bottomLABEL.setText("Sum: " + currentSum);
            if (currentSum == targetValue) {
                JOptionPane.showMessageDialog(null, "You have won the game!");
                System.exit(0);
            } else if (currentSum > targetValue) {
                JOptionPane.showMessageDialog(null, "You have lost the game!");
                System.exit(0);
            }
        }
    }
}
