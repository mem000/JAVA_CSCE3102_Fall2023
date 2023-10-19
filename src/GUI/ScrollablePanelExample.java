package GUI;

import javax.swing.*;
import java.awt.*;

public class ScrollablePanelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame
            JFrame frame = new JFrame("Scrollable JPanel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a JPanel with a GridLayout (or any layout you prefer)
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(20, 1)); // 20 rows for demonstration

            // Add components to the JPanel
            for (int i = 1; i <= 30; i++) {
                panel.add(new JLabel("Label " + i));
            }

            // Create a JScrollPane and add the panel to it
            JScrollPane scrollPane = new JScrollPane(panel);

            // Set scroll policies if needed
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            // Add the JScrollPane to the JFrame
            frame.add(scrollPane);

            // Make the JFrame visible
            frame.setVisible(true);
        });
    }
}
