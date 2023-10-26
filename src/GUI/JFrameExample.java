package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class JFrameExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main JFrame
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout());

        // Create a button
        JButton openButton = new JButton("Open New Frame");

        // Add an action listener to the button
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewFrame();
            }
        });

        // Add the button to the main frame
        mainFrame.add(openButton);

        mainFrame.setSize(400, 100);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private static void createNewFrame() {
        // Create a new JFrame
        JFrame newFrame = new JFrame("New Frame");
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLayout(new BorderLayout());

        // Create dummy data as a 2D array
        String[][] data = {
                {"Name", "Age", "Country", "Gender"},
                {"John", "30", "USA", "Male"},
                {"Alice", "25", "Canada", "Female"},
                {"Bob", "35", "UK", "Male"},
                {"Eve", "28", "Australia", "Male"},
                {"Sarah", "30", "USA", "Female"},
                {"Alice", "25", "Canada", "Female"},
                {"Bob", "35", "UK", "Male"},
                {"Eve", "28", "Australia", "Male"},
                {"John", "30", "USA", "Male"},
                {"Alice", "25", "Canada", "Male"},
                {"Bob", "35", "UK", "Male"},
                {"Eve", "28", "Australia", "Male"},
                {"John", "30", "USA", "Male"},
                {"Aya", "25", "Canada", "Female"},
                {"Bob", "35", "UK", "Male"},
                {"Mona", "28", "Australia", "Female"},
                // Add more data as needed
        };

        // Create column names
        String[] columnNames = data[0];

        // to prevent Editing Table data, Create a DefaultTableModel with non-editable cells
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // Create a JTable with the dummy data
        JTable table = new JTable(model);

        // Create a JTable with the dummy data
        //JTable table = new JTable(data, columnNames);

        // Create a JScrollPane to display the table with a vertical scrollbar
        JScrollPane scrollPane = new JScrollPane(table);

        // Create a panel for adding a new row
        JPanel addPanel = new JPanel(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(10);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageTextField = new JTextField(5);

        JLabel countryLabel = new JLabel("Country:");
        String[] countries = {"Select Country", "USA", "Canada", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set font for the label
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        //to ensure that radio buttons within the group behave as radio buttons should,
        // which means that only one radio button within the group can be selected at a time.
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JButton addButton = new JButton("Add Row");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String age = ageTextField.getText();
                String country = (String) countryComboBox.getSelectedItem();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";

                if (!name.isEmpty() && !age.isEmpty() && !country.equals("Select Country") &&
                        (!maleRadioButton.isSelected() || !femaleRadioButton.isSelected())) {
                    model.addRow(new Object[]{name, age, country, gender});
                    nameTextField.setText("");
                    ageTextField.setText("");
                }
                else {
                    // Display an error message using JOptionPane
                    JOptionPane.showMessageDialog(null, "Please Enter All the required info", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addPanel.add(nameLabel);
        addPanel.add(nameTextField);
        addPanel.add(ageLabel);
        addPanel.add(ageTextField);
        addPanel.add(countryLabel);
        addPanel.add(countryComboBox);
        addPanel.add(maleRadioButton);
        addPanel.add(femaleRadioButton);
        addPanel.add(addButton);

        // Set the preferred height for panel1 (adjust the value as needed)
        Dimension panel1Size = new Dimension(300, 100);
        addPanel.setPreferredSize(panel1Size);

        // Add the JScrollPane to the new frame
        //newFrame.add(scrollPane, BorderLayout.CENTER);

        // Create a description label
        JLabel descriptionLabel = new JLabel("Table Content: add caption for table here");

        JLabel endLabel = new JLabel("ممكن تضيف هنا أي تحابيش");
        endLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the label text

        // Create a panel to hold the description label and table
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(addPanel, BorderLayout.NORTH);

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(descriptionLabel, BorderLayout.NORTH);
        panel2.add(scrollPane, BorderLayout.CENTER);

        panel.add(panel2, BorderLayout.CENTER);
        panel.add(endLabel, BorderLayout.SOUTH);

        newFrame.add(panel);

        newFrame.setSize(400, 400);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
    }
}

