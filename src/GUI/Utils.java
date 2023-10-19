package GUI;

public class Utils { /* auxiliary tools */
    public static void showMainFrame() {
        // Create and display the main frame with your application's content
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

    }

    public static void showLoginForm() {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
