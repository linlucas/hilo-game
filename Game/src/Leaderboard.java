import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leaderboard extends JFrame implements ActionListener {
    private JButton playAgainButton;
    private JButton exitButton;

    Leaderboard() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setSize(480, 640);
        this.setResizable(false);
        this.setTitle("Leaderboard");
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        JLabel leaderLabel = new JLabel("Leaderboard");
        leaderLabel.setFont(new Font("Leader font", Font.ITALIC, 21));
        contentPane.add(leaderLabel);
        leaderLabel.setBounds(175, 10, 200, 50);

        JTextArea leadersArea = new JTextArea();
        leadersArea.setEditable(false);
        contentPane.add(leadersArea);
        leadersArea.setBounds(40, 70, 400, 400);
        leadersArea.setFont(new Font("Leader font", Font.PLAIN, 20));
        leadersArea.setText("------Name--------------------------Scores--------\n" +
                "      Lucas                                      30");

        playAgainButton = new JButton("Play Again");
        playAgainButton.setFont(new Font("Button font", Font.PLAIN, 25));
        contentPane.add(playAgainButton);
        playAgainButton.setBounds(70, 510, 200, 50);

        exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Button font", Font.PLAIN, 25));
        contentPane.add(exitButton);
        exitButton.setBounds(300, 510, 100, 50);

    }

    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();
        leaderboard.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
