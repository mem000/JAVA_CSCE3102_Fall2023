package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SplashScreenDemo {
    private JFrame splashFrame;
    private JFrame loginFrame;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private JLabel loadingLabel;

    public SplashScreenDemo() {
        // Create the main frame
        loginFrame = new JFrame("Splash");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400, 400);
        loginFrame.setLocationRelativeTo(null); // Center the login frame

        // Create a main panel with CardLayout for switching between splash screen and login form
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        // Create and add a splash screen with moving loading animation
        splashFrame = createSplashScreen();
        mainPanel.add(splashFrame.getContentPane(), "splash"); // Add the content pane of the splashFrame

        // Create and add the login form
        JPanel loginForm = createLoginForm();
        mainPanel.add(loginForm, "login");

        // Add the main panel to the frame
        loginFrame.add(mainPanel);

        // Set the initial view to the splash screen
        cardLayout.show(mainPanel, "splash");

        // Transition to the login form after 5 seconds
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "login");
                splashFrame.dispose(); // Close the splash screen
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();

        // Show the frame
        loginFrame.setVisible(true);
    }

    private JFrame createSplashScreen() {
        // Create a JFrame for the splash screen
        splashFrame = new JFrame("Splash Screen");
        JPanel splashPanel = new JPanel();
        loadingLabel = new JLabel("Loading...");
        loadingLabel.setFont(new Font("Serif", Font.BOLD, 20));
        splashPanel.add(loadingLabel);

        // Center the splash screen on the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        splashFrame.setLocation(dim.width / 2 - splashFrame.getSize().width / 2, dim.height / 2 - splashFrame.getSize().height / 2);

        splashFrame.add(splashPanel);
        splashFrame.setSize(200, 100); // Set the size
        splashFrame.setUndecorated(true); // Remove window decorations
        splashFrame.setVisible(true);

        // Start a timer to animate the loading dots
        Timer loadingTimer = new Timer(500, new ActionListener() {
            private int dots = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                dots = (dots + 1) % 4;
                updateLoadingLabel(dots);
            }
        });
        loadingTimer.start();

        return splashFrame;
    }

    private void updateLoadingLabel(int dots) {
        StringBuilder labelText = new StringBuilder("Loading");
        for (int i = 0; i < dots; i++) {
            labelText.append(".");
        }
        loadingLabel.setText(labelText.toString());
    }

    private JPanel createLoginForm() {
        JPanel loginForm = new JPanel();
        loginForm.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        usernameField.setFont(new Font("Serif", Font.PLAIN, 18));

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Serif", Font.PLAIN, 18));

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.BOLD, 18));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check login credentials (dummy data)
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);

                if (username.equals("") && passwordString.equals("")) {
                    // Successful login - transition to the main frame
                    loginFrame.dispose(); // Close the login frame
                    showMainFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid credentials. Try again.");
                }
            }
        });

        loginForm.add(usernameLabel);
        loginForm.add(usernameField);
        loginForm.add(passwordLabel);
        loginForm.add(passwordField);
        loginForm.add(new JPanel()); // Empty cell for spacing
        loginForm.add(loginButton);

        return loginForm;
    }

    private void showMainFrame() {
        // Create and display the main frame with your application's content
        MainFrame_temp mainFrame = new MainFrame_temp();
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SplashScreenDemo();
            }
        });
    }
}
