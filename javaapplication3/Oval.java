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
public  class Oval extends JFrame implements MouseListener, MouseMotionListener {
    JLabel mousePos;
    int x1, x2;
    int y1, y2;
    int x, y, w, h;
    int s,t;
    boolean cir = true;

    public Oval(int s,int t) {
    	
    	super( "Oval");
    	this.s=s;
        this.t=t;
    	this.mousePos = new JLabel();
    	this.mousePos.setHorizontalAlignment( SwingConstants.CENTER );
    	getContentPane().add( this.mousePos, BorderLayout.CENTER );


    	addMouseListener( this ); 
    	addMouseMotionListener( this ); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Oval");
        setLocationRelativeTo(null);
    	setSize( 400, 400 );
    	setVisible( true );

    }
 
    public void mouseReleased( MouseEvent event ) {
        repaint();
    }
    public void mouseDragged( MouseEvent event ) {
    	this.cir = false;
        repaint();
    }
    public void mouseClicked( MouseEvent event ) {
    	repaint();
    }
    public void mousePressed( MouseEvent event ) {
        this.cir = true;
        repaint();
    }
    public void mouseEntered( MouseEvent event ) {
        this.mousePos.addFocusListener(null);
    	repaint();
    }
    public void mouseExited( MouseEvent event ) {
        
    	repaint();
    }
    public void mouseMoved( MouseEvent event ) {
        this.mousePos.addFocusListener(null);
    	repaint();
    }
    public void paint(Graphics g ) {
    	super.paint( g );  
        if ( !this.cir ) 
        {
            g.drawOval( 100, 100, t, s );
            g.setColor(Color.RED);
            g.fillOval(100,100, t, s);
        }
    }
}


 