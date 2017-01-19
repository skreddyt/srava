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
public  class Rectangle extends JFrame implements MouseListener, MouseMotionListener {
    JLabel mousePos;
    int x1, x2;
    int y1, y2;
    int x, y, w, h;
    int s,t;
    boolean Rect = true;

    public Rectangle(int s, int t) {
    	
    	super( "Rectangle" );
    	this.s=s;
        this.t=t;
    	this.mousePos = new JLabel();
    	this.mousePos.setHorizontalAlignment( SwingConstants.CENTER );
    	getContentPane().add( this.mousePos, BorderLayout.CENTER );


    	addMouseListener( this ); 
    	addMouseMotionListener( this ); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Rectangle");
        setLocationRelativeTo(null);
    	setSize( 400, 400 );
    	setVisible( true );

    }
 
    public void mouseReleased( MouseEvent event ) {
        repaint();
    }
    public void mouseDragged( MouseEvent event ) {
    	this.Rect = false;
        repaint();
    }
    public void mouseClicked( MouseEvent event ) {
    	repaint();
    }
    public void mousePressed( MouseEvent event ) {
        this.Rect = true;
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
        if ( !this.Rect ) 
        {
            g.drawRect( 50,150, t, s );
            g.setColor(Color.GREEN);
            g.fillRect(50, 150, t, s);
        }
    }
}
