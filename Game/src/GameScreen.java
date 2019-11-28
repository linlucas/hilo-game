import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame implements ActionListener {
    private JButton guessButton;
    private int guess;
    private JTextField guessField;

    GameScreen() {
        this.setSize(480, 640);
        this.setResizable(false);
        this.setTitle("HiLo Game");
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        JPanel HiLoPanel = new JPanel();
        HiLoPanel.setBorder(BorderFactory.createBevelBorder(1));
        HiLoPanel.setLayout(null);
        contentPane.add(HiLoPanel);
        HiLoPanel.setBounds(65, 40, 350, 300);

        JLabel levelNum = new JLabel("LEVEL 1");
        levelNum.setFont(new Font("Level font", Font.PLAIN, 18));
        HiLoPanel.add(levelNum);
        levelNum.setBounds(20, 10, 150, 50);

        JLabel hilo = new JLabel("Hi");
        hilo.setFont(new Font("HILO font", Font.ITALIC, 250));
        HiLoPanel.add(hilo);
        hilo.setBounds(40, 20, 300, 300);

        JPanel guessPan = new JPanel();
        guessPan.setBorder(BorderFactory.createBevelBorder(0));
        guessPan.setLayout(null);
        contentPane.add(guessPan);
        guessPan.setBounds(65, 380, 350, 100);

        guessField = new JTextField();
        guessField.setFont(new Font("Guess font", Font.BOLD, 21));
        guessPan.add(guessField);
        guessField.setBounds(50, 30, 150, 40);

        guessButton = new JButton("GUESS!");
        guessButton.setFont(new Font("Button font", Font.PLAIN, 15));
        guessButton.addActionListener(this);
        guessPan.add(guessButton);
        guessButton.setBounds(210, 30, 100, 40);

        JLabel triesLeft = new JLabel("You have 3 tries left!");
        triesLeft.setFont(new Font("Tries font", Font.PLAIN, 20));
        contentPane.add(triesLeft);
        triesLeft.setBounds(130, 480, 350, 100);

    }

    public static void main(String[] args) {
        GameScreen gameScreen = new GameScreen();
        gameScreen.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == guessButton) {
            try {
                guess = Integer.parseInt(guessField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter numbers as digits!",
                        "Number Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
