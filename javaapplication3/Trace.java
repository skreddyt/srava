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
public  class Trace extends JFrame implements MouseListener, MouseMotionListener {
    JLabel mousePos;
    int x1, x2;
    int y1, y2;
    boolean trac = true;

    public Trace(int x1, int y1,int x2,int y2) {
    	
    	super( "Trace" );
    	this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    	this.mousePos = new JLabel();
    	this.mousePos.setHorizontalAlignment( SwingConstants.CENTER );
    	getContentPane().add( this.mousePos, BorderLayout.CENTER );
        addMouseListener( this ); 
    	addMouseMotionListener( this ); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Trace");
        setLocationRelativeTo(null);
    	setSize( 350, 350 );
    	setVisible( true );

    }
 
    public void mouseReleased( MouseEvent event ) {
        repaint();
    }
    public void mouseDragged( MouseEvent event ) {
    	this.trac = false;
        repaint();
    }
    public void mouseClicked( MouseEvent event ) {
    	repaint();
    }
    public void mousePressed( MouseEvent event ) {
        this.trac = true;
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
        
        if ( !this.trac ) 
        {
            g.setColor(Color.blue);
            g.drawLine(x1, y1, x2, y2);
            
        }
    }
}

