//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonImageExample implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;

    ButtonImageExample() {
        frame = new JFrame("Button Image Example");

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

        // Set button positions
        btnClock.setBounds(50, 50, 200, 100);
        btnHourGlass.setBounds(270, 50, 200, 100);

        // Add action listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add buttons to frame
        frame.add(btnClock);
        frame.add(btnHourGlass);

        frame.setLayout(null);
        frame.setSize(550, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            JOptionPane.showMessageDialog(frame, "Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            JOptionPane.showMessageDialog(frame, "Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonImageExample();
            }
        });
    }
}
