/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ramsr
 */
public class Paint extends JFrame {
	
    public static void main(String[] a) {
	   
        JFrame frame = new JFrame();
        UserInput in = new UserInput();
	  
	JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
	menuBar.add(file);
        JMenuItem ne = new JMenuItem("New");
        JMenuItem exit = new JMenuItem("Exit");
        
        JMenu edit = new JMenu("Edit");
        menuBar.add(edit);
        JMenuItem ova = new JMenuItem("Oval");
        JMenuItem rec = new JMenuItem("Rectangle");
        JMenuItem tra = new JMenuItem("Trace");
        file.add(ne);
        file.add(exit);
        edit.add(ova);
        edit.add(rec);
        edit.add(tra);
        rec.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            in.displayRect();
            }
        });
        ova.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            in.displayOva();
            }
        });
        tra.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            in.displayTrac();
            }
        });
        
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Paint");
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(menuBar);
	frame.setVisible(true);
    }
}
	  
	
