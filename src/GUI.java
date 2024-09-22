import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0; // Initialize count to 0
    JPanel panel;
    JLabel label;
    JFrame frame;
    JButton button;
    JButton button1;

    public GUI() {
        frame = new JFrame();

        button = new JButton("Click for lemons");
        button.addActionListener(this);
        label = new JLabel("Number of Lemons: " + count);

        button1 = new JButton("Click to reduce lemons");
        button1.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button1);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI NA PANG LEMON");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            count++; // Increment count
            label.setText("Number of Lemons: " + count);
        } else if (e.getSource() == button1) {
            if (count > 0) { // Prevent count from going below 0
                count--; // Decrement count
            }
            label.setText("Number of Lemons: " + count);
        }
    }
}
