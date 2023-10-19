package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame_temp extends JFrame {
    private JPanel currentSection;

    public MainFrame_temp() {
        // Set the title of the frame
        setTitle("Welcome App");

        // Set the size of the frame (width, height)
        setSize(600, 400);

        // Set the default close operation (exit when the window is closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu items
        JMenu navigationMenu = new JMenu("Navigation");
        JMenuItem welcomeMenuItem = new JMenuItem("Welcome");
        JMenuItem section1MenuItem = new JMenuItem("Section 1");
        JMenuItem section2MenuItem = new JMenuItem("Section 2");
        JMenuItem section3MenuItem = new JMenuItem("Section 3");
        JMenuItem section4MenuItem = new JMenuItem("Section 4");

        // Add menu items to the navigation menu
        navigationMenu.add(welcomeMenuItem);
        navigationMenu.add(section1MenuItem);
        navigationMenu.add(section2MenuItem);
        navigationMenu.add(section3MenuItem);
        navigationMenu.add(section4MenuItem);

        // Add the navigation menu to the menu bar
        menuBar.add(navigationMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create a panel for the Welcome section
        currentSection = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome to the Welcome section!");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.ORANGE);
        currentSection.add(welcomeLabel);

        // Set the initial content to the Welcome section
        setContentPane(currentSection);

        // Create action listeners for menu items
        welcomeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWelcomeSection();
            }
        });

        section1MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSection("Section 1");
            }
        });

        section2MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSection("Section 2");
            }
        });

        section3MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSection("Section 3");
            }
        });

        section4MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSection("Section 4");
            }
        });

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    private void showWelcomeSection() {
        currentSection.removeAll();
        JLabel welcomeLabel = new JLabel("Welcome to the Welcome section!");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.ORANGE);
        currentSection.add(welcomeLabel);
        addLogoutButton(); // Add the "Logout" button
        revalidate();
        repaint();
    }

    private void showSection(String sectionName) {
        currentSection.removeAll();
        JPanel sectionPanel = new JPanel();
        sectionPanel.setLayout(new GridLayout(2, 2));

        JLabel titleLabel = new JLabel(sectionName);
        sectionPanel.add(titleLabel);

        // Add input fields and labels specific to each section
        if (sectionName.equals("Section 1")) {
            // Add components for Section 1
            JTextField textField = new JTextField(15);
            JLabel label = new JLabel("Enter something:");
            sectionPanel.add(label);
            sectionPanel.add(textField);
            sectionPanel.add(new JButton("Submit")); // Example button
        } else if (sectionName.equals("Section 2")) {
            // Add components for Section 2
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
            sectionPanel.add(comboBox);
            sectionPanel.add(new JCheckBox("Check this box"));
        } else if (sectionName.equals("Section 3")) {
            // Add components for Section 3
            JTextArea textArea = new JTextArea(5, 20);
            JScrollPane scrollPane = new JScrollPane(textArea);
            sectionPanel.add(scrollPane);
        } else if (sectionName.equals("Section 4")) {
            // Add components for Section 4
            JRadioButton radioButton1 = new JRadioButton("Option 1");
            JRadioButton radioButton2 = new JRadioButton("Option 2");
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(radioButton1);
            buttonGroup.add(radioButton2);
            sectionPanel.add(radioButton1);
            sectionPanel.add(radioButton2);
        }

        currentSection.add(sectionPanel);
        addLogoutButton(); // Add the "Logout" button
        revalidate();
        repaint();
    }

    private void addLogoutButton() {
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Return to the login form (dispose the current frame)
                dispose();
                showLoginForm();
            }
        });
        currentSection.add(logoutButton);
    }

    private void showLoginForm() {
        // Create and display the login form
        JFrame loginFrame = new JFrame("Login Form");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400, 200);
        loginFrame.setLocationRelativeTo(null); // Center the login frame

        JPanel loginForm = new JPanel();
        loginForm.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        loginForm.add(usernameLabel);
        loginForm.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        loginForm.add(passwordLabel);
        loginForm.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check login credentials (dummy data)
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);

                if (username.equals("dummyuser") && passwordString.equals("dummypassword")) {
                    // Successful login - close the login frame and show the main frame
                    loginFrame.dispose();
                    showMainFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid credentials. Try again.");
                }
            }
        });
        loginForm.add(loginButton);

        loginFrame.add(loginForm);
        loginFrame.setVisible(true);
    }

    private void showMainFrame() {
        // Create and display the main frame with your application's content
        MainFrame_temp mainFrame = new MainFrame_temp();
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_temp().setVisible(true);
            }
        });
    }
}
