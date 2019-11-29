import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame implements ActionListener {
    private String userName;
    private JButton OKButton;
    private JTextField nameField;

    LoginScreen() {
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

        OKButton = new JButton("OK");
        OKButton.addActionListener(this);
        OKButton.setFont(new Font("OK font", Font.BOLD, 22));
        buttonsPanel.add(OKButton);
        OKButton.setBounds(230, 45, 70, 40);
    }

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }
    public String getUserName() {
        return this.userName;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == OKButton) {
            userName = nameField.getText();
        }
    }
}
