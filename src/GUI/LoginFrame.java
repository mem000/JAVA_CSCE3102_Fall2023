package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private JLabel welcomeLabel;

    public LoginFrame() {
        setTitle("Login Form");
        setSize(300, 350); // Slightly increased height to accommodate padding
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 60, 30)); // Add padding around the panel

        welcomeLabel = new JLabel("         WELCOME . . .");
        Font customFont = new Font("Arial", Font.BOLD, 20);
        welcomeLabel.setFont(customFont);
        // Set the text color for the JLabel
        welcomeLabel.setForeground(Color.blue);

        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(18);
        passwordField = new JPasswordField(18);

        JButton loginButton = new JButton("Login");

        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLACK);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // Replace this with your authentication logic
                if (username.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login Successful!");
                    // Successful login - close the login frame and show the main frame
                    dispose(); //Close the current frame and release resources
                    Utils.showMainFrame();
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login Failed. Please try again.");
                }

                // Clear the password field for security
                passwordField.setText("");
            }
        });

        panel.add(Box.createVerticalStrut(10)); // Add vertical spacing
        panel.add(welcomeLabel);
        panel.add(Box.createVerticalStrut(30)); // Add vertical spacing
        panel.add(usernameLabel);
        panel.add(usernameField);
        usernameField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(Box.createVerticalStrut(10)); // Add vertical spacing
        panel.add(passwordLabel);
        panel.add(passwordField);
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(Box.createVerticalStrut(10)); // Add vertical spacing
        panel.add(loginButton);
        panel.add(Box.createVerticalStrut(10)); // Add vertical spacing

        add(panel);
    }

    public static void main(String[] args) {
        Utils.showLoginForm();
    }


}
