import javax.swing.*;
import java.awt.*;

class HelloWorldFrame extends JFrame {

    public HelloWorldFrame() {
        // Sets the window title and behavior
        setTitle("Hello World Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Centers the window on your screen
        setLocationRelativeTo(null);

        // Using BorderLayout for clean component placement
        setLayout(new BorderLayout());

        // Creating and styling the label
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Adding the label to the center of the frame
        add(label, BorderLayout.CENTER);
    }

    static void main() {
        // Launching the GUI on the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new HelloWorldFrame().setVisible(true));
    }
}