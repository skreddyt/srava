/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.*;
import java.awt.*;
import javax.swing.*;
import static com.sun.javafx.fxml.expression.Expression.add;
/**
 *
 * @author ramsr
 */

class UserInput {
    public  void displayRect() {
        JSlider slid1,slid2,slid3;
        JTextField height = new JTextField("");
        JTextField width = new JTextField("");        
        JPanel panel = new JPanel(new GridLayout(6, 2,2,2));
        JPanel pane2 = new JPanel(new GridLayout(4, 0,2,2));
        panel.add(new JLabel("Enter Height"));
        panel.add(height);
        panel.add(new JLabel("Enter Width"));
        panel.add(width);
         int result = JOptionPane.showConfirmDialog(null, panel, "Rectangle",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            Rectangle app = new Rectangle(Integer.parseInt(height.getText()), Integer.parseInt(width.getText()));
        } 
        else 
        {
            System.exit(0);
        }
    }
    public  void displayOva() {
        
        JTextField height = new JTextField("");
        JTextField width = new JTextField("");
        JPanel panel = new JPanel(new GridLayout(2, 2));
         
        panel.add(new JLabel("Diameter-Height"));
        panel.add(height);
        panel.add(new JLabel("Diameter-Width"));
        panel.add(width);
         
        int result = JOptionPane.showConfirmDialog(null, panel, "Oval",
             JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            Oval app = new Oval(Integer.parseInt(height.getText()), Integer.parseInt(width.getText()));
        } 
        else 
        {
            System.exit(0);
        }
         
     }
    public  void displayTrac() {
        
        JTextField x1 = new JTextField("");
        JTextField y1 = new JTextField("");
        JTextField x2 = new JTextField("");
        JTextField y2 = new JTextField("");
        JPanel panel = new JPanel(new GridLayout(4, 4));
         
        panel.add(new JLabel("X1"));
        panel.add(x1);
        panel.add(new JLabel("Y1"));
        panel.add(y1);
        panel.add(new JLabel("X2"));
        panel.add(x2);
        panel.add(new JLabel("Y2"));
        panel.add(y2);
         
        int result = JOptionPane.showConfirmDialog(null, panel, "Trace",
             JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            Trace app = new Trace (Integer.parseInt(x1.getText()), Integer.parseInt(y1.getText()),Integer.parseInt(x2.getText()),Integer.parseInt(y2.getText()));
        } 
        else 
        {
            System.exit(0);
        }
         
     }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
}
