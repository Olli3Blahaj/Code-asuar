/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.asaurs;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Ocb19f
 */
public class Round {
    public static class RoundedPanel extends JPanel {
    private int cornerRadius = 20; // Set your desired radius

    public RoundedPanel() {
        super();
        setOpaque(false); // Make the panel transparent for custom painting
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Get the current width and height of the panel
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D graphics = (Graphics2D) g;
        
        // Enable anti-aliasing for smooth corners
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                                  RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Set the color for the rounded background (use getBackground() for the panel's color)
        graphics.setColor(getBackground());
        
        // Fill the rounded rectangle
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        
        
    }
}
    
}

