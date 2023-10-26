package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

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

        //using lambda expression
        section4MenuItem.addActionListener(e -> showSection("Section 4"));

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
        //JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(20, 1)); // 20 rows for demonstration
//panel.setSize(50, 50);
//        panel.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        //
        // Set scroll policies if needed
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollPane.setSize(100, 50);
        //scrollPane.setLayout(new s());
        // Add the JScrollPane to the current selection Panel
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


        JTable jt1 = new JTable(data, columnNames);
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
        //sectionPanel.setSize(300, 300);
        //sectionPanel.setLayout(new GridLayout(3, 2));

        JLabel titleLabel = new JLabel(sectionName);
        sectionPanel.add(titleLabel);

        // Add input fields and labels specific to each section
        if (sectionName.equals("Section 1")) {
            sectionPanel.setLayout(new GridLayout(20, 1));
            // Add components for Section 1
            JTextField textField = new JTextField(15);
            JLabel label = new JLabel("Enter something:");
            sectionPanel.add(label);
            sectionPanel.add(textField);
            JButton btn_submit = new JButton("Submit");
            sectionPanel.add(btn_submit); // Example button

            sectionPanel.add(new JLabel("")); //EMPTY LABEL TO ADD SPACE
            JButton btn_newFrame1 = new JButton("Display a Separate Frame");
            //using lambda expression
            btn_newFrame1.addActionListener(e -> createFrame1());
            sectionPanel.add(btn_newFrame1);
            sectionPanel.add(new JLabel("")); //EMPTY LABEL TO ADD SPACE
            JButton btn_newFrame2 = new JButton("Display child Frame a JDialog");
            //using lambda expression
            btn_newFrame2.addActionListener(e -> createFrame2());
            sectionPanel.add(btn_newFrame2);
            sectionPanel.add(new JLabel("")); //EMPTY LABEL TO ADD SPACE
            JButton btn_input = new JButton("Take Input Using JOptionPane");
            btn_input.addActionListener(e -> takeInput());
            sectionPanel.add(btn_input);
            sectionPanel.add(new JLabel("")); //EMPTY LABEL TO ADD SPACE

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

    private void createFrame1() {
        JFrame newFrame = new JFrame("This Test Frame - MEM");
        newFrame.setSize(300, 300);
        JPanel myPanel = new JPanel();

        JLabel myLabel = new JLabel("Enter Item Number:");
        JTextField mytxtField = new JTextField(15);
        JButton btnView = new JButton("View Item");

        btnView.addActionListener(e3 -> {
            String itemNum = mytxtField.getText();

            try {
                int itemNumber = Integer.parseInt(itemNum);

                // Check if itemNumber is valid
                if (itemNumber <= 100) {
                    //JOptionPane.showMessageDialog(newFrame, "Invalid Item number.");
                    // Display an error message using JOptionPane
                    JOptionPane.showMessageDialog(null, "An error occurred: Invalid Item number!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(newFrame, "Item number is valid.");
                }
            } catch (NumberFormatException ex) {
                //JOptionPane.showMessageDialog(newFrame, "Invalid Item number.");
                // Display an error message using JOptionPane
                JOptionPane.showMessageDialog(null, "An error occurred: Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        myPanel.add(myLabel);
        myPanel.add(mytxtField);
        myPanel.add(btnView);

        newFrame.add(myPanel);
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false); //prevent resize this window
    }

    private void createFrame2() {
        JDialog newDialog = new JDialog(this, "This Test Frame - MEM", true);
        newDialog.setSize(300, 300);
        JPanel myPanel = new JPanel();

        JLabel myLabel = new JLabel("Enter Item Number:");
        JTextField mytxtField = new JTextField(15);
        mytxtField.addActionListener(e -> fun22(mytxtField.getText()));
        JButton btnView = new JButton("View Item");

        btnView.addActionListener(e3 -> fun22(mytxtField.getText()));

        myPanel.add(myLabel);
        myPanel.add(mytxtField);
        myPanel.add(btnView);

        JButton closeChildButton = new JButton("Close Child Frame");
        closeChildButton.addActionListener(e -> newDialog.dispose());
        myPanel.add(closeChildButton);

        newDialog.add(myPanel);
        newDialog.setLocationRelativeTo(null); //to center JDialog, this command must come before //.setVisible(true);
        newDialog.setResizable(false); //prevent resize this window, this command must come before //.setVisible(true);
        newDialog.setVisible(true);
        newDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void fun22(String itemNum) {
        try {
            int itemNumber = Integer.parseInt(itemNum);

            // Check if itemNumber is valid
            if (itemNumber <= 100) {
                //JOptionPane.showMessageDialog(newFrame, "Invalid Item number.");
                // Display an error message using JOptionPane
                JOptionPane.showMessageDialog(null, "An error occurred: Invalid Item number!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Item number is valid.");
            }
        } catch (NumberFormatException ex) {
            //JOptionPane.showMessageDialog(newFrame, "Invalid Item number.");
            // Display an error message using JOptionPane
            JOptionPane.showMessageDialog(null, "An error occurred: Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void takeInput() {
        // Prompt the user for input
        String userInput = JOptionPane.showInputDialog(null, "Enter something:");

        // Check if the user clicked OK or Cancel
        if (userInput != null) {
            // User clicked OK and entered something
            JOptionPane.showMessageDialog(null, "You entered: " + userInput);
        } else {
            // User clicked Cancel or closed the input dialog
            JOptionPane.showMessageDialog(null, "You canceled or closed the input dialog.");
        }
    }

}
