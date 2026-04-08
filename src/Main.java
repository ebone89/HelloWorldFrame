import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello World");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.add(new JLabel("Hello World", SwingConstants.CENTER));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
