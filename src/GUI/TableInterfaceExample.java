package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableInterfaceExample extends JFrame{
    private JPanel contentPane;
    private JTable jt1;
    public static void main(String[] args) {
        TableInterfaceExample frame = new TableInterfaceExample();
        frame.setVisible(true);
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JTable1 frame = new JTable1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
    }
//
//    private static void createAndShowGUI() {
//        // Create a JFrame
//        JFrame frame = new JFrame("Table Interface Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 400);
//
        // Create a sample data model for the table
        String[] columnNames = {"Name", "Age", "Gender"};
        Object[][] data = {
                {"Alice", 25, "Female"},
                {"Bob", 30, "Male"},
                {"Charlie", 22, "Male"},
                {"David", 28, "Male"},
                {"Eve", 27, "Female"},
                {"Frank", 35, "Male"},
                // Add more data as needed
        };
//
//        // Create a JTable with the data
//        JTable table = new JTable(data, columnNames);
//
//        // Create a JScrollPane to enable scrolling
//        JScrollPane scrollPane = new JScrollPane(table);
//
//
//        frame.getContentPane().add(scrollPane);
//
//        // Set the layout manager of the content pane
//        frame.getContentPane().setLayout(new BorderLayout());
//
//        // Center the frame on the screen
//        frame.setLocationRelativeTo(null);
//
//        // Make the frame visible
//        frame.setVisible(true);
//    }
    TableInterfaceExample() {
        super("Table Interface Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 400, 286);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        //scrollPane.setLayout(new s());
        // Add the JScrollPane to the content pane of the frame
        getContentPane().add(scrollPane);

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
                {"Bob", 30, "Male"},
                {"Charlie", 22, "Male"},
                {"David", 28, "Male"},
                {"Eve", 27, "Female"},
                {"Frank", 35, "Male"},
                // Add more data as needed
        };

        jt1 = new JTable(data,columnNames);
        scrollPane.setViewportView(jt1);
    }
}
