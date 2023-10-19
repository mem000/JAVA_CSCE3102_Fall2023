package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel currentSection;
    private JMenuBar menuBar;

    private JButton logoutButton;

    public MainFrame() {
        // Set the title of the frame
        setTitle("Welcome App");

        // Set the size of the frame (width, height)
        setSize(600, 400);

        // Set the default close operation (exit when the window is closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        menuBar = new JMenuBar();

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
        menuBar.add(Box.createHorizontalGlue());
        //add Logout Button the menu Bar
        addLogoutButton();


        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create a panel for the Welcome section
        currentSection = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome to the First section!");
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
        currentSection.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Our App!");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.ORANGE);

        JButton btn = new JButton("Show Data");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                go();
                System.out.println("eeee");
            }
        });

        JPanel temp = new JPanel();
        temp.add(welcomeLabel);
        temp.add(btn);
        currentSection.add(temp, BorderLayout.NORTH);
        revalidate();
        repaint();
    }
    void go() {
        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(20, 1)); // 20 rows for demonstration
//panel.setSize(50, 50);
//        panel.setLayout(null);
        JScrollPane scrollPane = new JScrollPane(panel);
        //
        // Set scroll policies if needed
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollPane.setSize(100, 50);
        //scrollPane.setLayout(new s());
        // Add the JScrollPane to the content pane of the frame
        currentSection.add(scrollPane);

        ////

        //

//        final JScrollPane scrollPanel = new JScrollPane(
//                currentSection,
//                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
//                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS
//        );
//        scrollPanel.setBounds(0, 0, 800, 900);
//        panel.setBounds(0, 0, 1920, 1080);
//        panel.setPreferredSize(new Dimension(1920, 1080));
        // Add the JScrollPane to the content pane of the frame
        //getContentPane().add(scrollPane);
        ///

        // Create a sample data model for the table
        String[] columnNames = {"Name", "Age", "Gender"};
        Object[][] data = {
                {"Alice", 25, "Female"},
                {"Bob", 30, "Male"},
                {"Charlie", 22, "Male"},
                {"David", 28, "Male"},
                {"Eve", 27, "Female"},
                {"Frank", 35, "Male"},
                {"Alice", 25, "Female"},
                {"Bob", 30, "Male"},
                {"Charlie", 22, "Male"},
                {"David", 28, "Male"},
                {"Eve", 27, "Female"},
                {"Frank", 35, "Male"},
                {"Alice", 25, "Female"},
                {"Alice", 25, "Female"},
                {"Bob", 30, "Male"},
                {"Charlie", 22, "Male"},
                {"David", 28, "Male"},
                {"Eve", 27, "Female"},
                {"Frank", 35, "Male"},
                {"Alice", 25, "Female"}
                // Add more data as needed
        };


        JTable jt1 = new JTable(data,columnNames);
        //jt1.setSize(100, 50);
        jt1.setPreferredScrollableViewportSize(jt1.getPreferredSize());
        scrollPane.setViewportView(jt1);

        revalidate();
        repaint();
    }

    private void showSection(String sectionName) {
        currentSection.removeAll();
        currentSection.setLayout(new FlowLayout());
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

        revalidate();
        repaint();
    }

    private void addLogoutButton() {
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Return to the login form (dispose the current frame)
                dispose(); //Close the current frame and release resources
                Utils.showLoginForm();
            }
        });
        menuBar.add(logoutButton);
    }

}
