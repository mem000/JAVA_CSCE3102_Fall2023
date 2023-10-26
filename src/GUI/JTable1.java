package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable1 extends JFrame {

    private JPanel contentPane;
    private JTable jt1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        JTable1 frame = new JTable1();
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

    /**
     * Create the frame.
     */
    public JTable1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 286);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(26, 46, 352, 131);
        contentPane.add(scrollPane);

        String[][] data = {{"Alex", "Five", "55", "Male"}, {"Ron", "Six", "65", "Femal"}};
        String[] column = {"Name", "Class", "Mark", "Sex"};

        jt1 = new JTable(data, column);
        scrollPane.setViewportView(jt1);
    }
}
