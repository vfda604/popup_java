/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author DANIEL
 */

    import javax.swing.JOptionPane;
    import javax.swing.JFrame;
    import java.awt.Dimension;
    import java.awt.Toolkit;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         double width = screenSize.getWidth();
         double height = screenSize.getHeight();
         
         int x = (int) Math.round(width);
         int y = (int) Math.round(height);
         
         JFrame frame = new JFrame("Mensaje desde ...");
         frame.setUndecorated(true);
         frame.setVisible(true);
         frame.setLocation(x - 200, y - 100);
         
         String message = JOptionPane.showInputDialog(frame,
                 "mensaje de CYES",
                 "Mensaje",
                 JOptionPane.INFORMATION_MESSAGE);
         
         System.out.println("Got " + message);
         
         frame.dispose();
    }
}
