import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class displays a login screen and captures the user input which is
 * their username.
 *
 * @author Lucas Lin
 * @version Dec 1, 2019
 */
public class LoginScreen extends JFrame implements ActionListener {

    private JTextField nameField;

    public static void main(String[] args) {
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }

    LoginScreen() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setSize(480, 640);
        this.setResizable(false);
        this.setTitle("Welcome to HiLo!");
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        JLabel image = new JLabel(new ImageIcon("HiLoIcon.jpg"));
        contentPane.add(image);
        image.setBounds(65, 30, 350, 350);

        JLabel welcomeLabel = new JLabel("Welcome to HiLo!");
        welcomeLabel.setFont(new Font("Custom font", Font.ITALIC, 23));
        contentPane.add(welcomeLabel);
        welcomeLabel.setBounds(130, 385, 370, 50);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBorder(BorderFactory.createTitledBorder("Please enter your name:"));
        buttonsPanel.setLayout(null);
        contentPane.add(buttonsPanel);
        buttonsPanel.setBounds(65, 440, 350, 130);

        nameField = new JTextField(20);
        nameField.setFont(new Font("Name font", Font.BOLD, 21));
        buttonsPanel.add(nameField);
        nameField.setBounds(70, 45, 150, 40);

        JButton OKButton = new JButton("OK");
        OKButton.addActionListener(this);
        OKButton.setFont(new Font("OK font", Font.BOLD, 22));
        buttonsPanel.add(OKButton);
        OKButton.setBounds(230, 45, 70, 40);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "I'm thinking of a number between 0 " +
                "and 100, guess what it is...", "Let's play a game", JOptionPane.INFORMATION_MESSAGE);
        GameScreen gameScreen = new GameScreen(nameField.getText());
        gameScreen.setVisible(true);
    }
}
