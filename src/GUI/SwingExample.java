package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class SwingExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Swing Example with JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a JPanel with a FlowLayout and set its background color
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(Color.lightGray); // Set background color
        panel1.setBorder(BorderFactory.createTitledBorder("Flow Layout"));

        // Set the preferred height for panel1 (adjust the value as needed)
        Dimension panel1Size = new Dimension(400, 100);
        panel1.setPreferredSize(panel1Size);

        // Create a JPanel with a GridLayout and set its background color
        JPanel panel2 = new JPanel(new GridLayout(4, 2));
        panel2.setBackground(Color.PINK); // Set background color
        //panel2.setBorder(BorderFactory.createTitledBorder("Grid Layout")); // Add a border

        // Customize the border for panel2
        Color borderColor = Color.BLACK; // Border color
        Font titleFont = new Font("Arial", Font.BOLD, 14); // Title font
        Border titledBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor, 2), "Grid Layout", TitledBorder.LEFT, TitledBorder.TOP, titleFont, borderColor);

        panel2.setBorder(titledBorder); // Add the customized border

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font for the label
        JTextField nameField = new JTextField(20);
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font for the label
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JLabel subscriptionLabel = new JLabel("Subscription:");
        subscriptionLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font for the label
        JCheckBox subscribeCheckbox = new JCheckBox("Subscribe to Newsletter");

        // Create a JComboBox
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font for the label
        String[] countries = {"Select Country", "USA", "Canada", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        // Create a JLabel for messages
        JLabel messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 12)); // Set font for the label

        // Add components to panels
        panel1.add(nameLabel);
        panel1.add(nameField);
        panel1.add(genderLabel);
        panel1.add(maleRadioButton);
        panel1.add(femaleRadioButton);
        panel1.add(countryLabel);
        panel1.add(countryComboBox);
        panel1.add(subscriptionLabel);
        panel1.add(subscribeCheckbox);
        panel1.add(messageLabel);

        // Add panels to the main frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        // Action listener for the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String subscription = subscribeCheckbox.isSelected() ? "Subscribed" : "Not Subscribed";
                String selectedCountry = (String) countryComboBox.getSelectedItem();

                String message = "Name: " + name + "\nGender: " + gender + "\nCountry: " + selectedCountry + "\nSubscription: " + subscription;
                messageLabel.setText(message);

                JOptionPane.showMessageDialog(frame, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add tooltips
        nameLabel.setToolTipText("Enter your name");
        maleRadioButton.setToolTipText("Select if you are male");
        femaleRadioButton.setToolTipText("Select if you are female");
        subscribeCheckbox.setToolTipText("Subscribe to our newsletter");
        countryLabel.setToolTipText("Select your country");
        submitButton.setToolTipText("Click to submit your registration");

        // Set up the frame
        frame.add(submitButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

