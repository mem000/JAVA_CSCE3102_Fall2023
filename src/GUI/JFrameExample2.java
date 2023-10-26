package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout());

        JButton openButton = new JButton("Open New Frame");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewFrame();
            }
        });

        mainFrame.add(openButton);

        mainFrame.setSize(300, 100);
        mainFrame.setVisible(true);
    }

    private static void createNewFrame() {
        JFrame newFrame = new JFrame("New Frame");
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLayout(new BorderLayout());

        String[][] data = {
                {"Name", "Age", "Country"},
                {"John", "30", "USA"},
                {"Alice", "25", "Canada"},
                {"Bob", "35", "UK"},
                {"Eve", "28", "Australia"},
        };

        // Create a JPanel to hold the labels
        JPanel panel = new JPanel(new GridLayout(data.length, data[0].length));

        for (String[] row : data) {
            for (String cell : row) {
                JLabel label = new JLabel(cell);
                panel.add(label);
            }
        }

        newFrame.add(panel, BorderLayout.CENTER);

        newFrame.setSize(400, 300);
        newFrame.setVisible(true);
    }
}
