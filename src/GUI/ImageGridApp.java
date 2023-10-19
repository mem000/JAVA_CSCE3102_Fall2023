package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ImageGridApp extends JFrame {
    public ImageGridApp() {
        setTitle("Image Grid Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        // Create a panel for the grid of images
        JPanel gridPanel = new JPanel(new GridLayout(2, 3)); // You can adjust the number of rows and columns.
        add(gridPanel, BorderLayout.CENTER);
        Icon image = new ImageIcon(getClass().getResource("1.png"));
        // Create image labels or panels for each item with tooltips
        for (int i = 1; i <= 6; i++) {
            //ImageIcon image = new ImageIcon(i + ".png"); // Replace with your image paths
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(image);
            imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            imageLabel.setToolTipText("Item " + i); // Set the tooltip text
            imageLabel.addMouseListener(new ImageClickListener(i)); // Handle mouse click events
            gridPanel.add(imageLabel);
        }

        // Create a panel for displaying details
        DetailsPanel detailsPanel = new DetailsPanel();
        add(detailsPanel, BorderLayout.SOUTH);

        //pack();
        setLocationRelativeTo(null); // Center the JFrame on the screen
    }

    private class ImageClickListener implements MouseListener {
        private int itemIndex;

        public ImageClickListener(int itemIndex) {
            this.itemIndex = itemIndex;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // Handle image click event
            // You can show details of the selected item in the details panel
            DetailsPanel.showDetails(itemIndex);
        }

        // Implement the other methods of the MouseListener interface
        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageGridApp app = new ImageGridApp();
            app.setVisible(true);
        });
    }
}
