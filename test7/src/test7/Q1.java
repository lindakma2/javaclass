package test7;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Q1 extends Frame implements MouseListener,MouseMotionListener{
	static Frame frm=new Q1();
	static int dx,dy,x1,x2;
	
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.addMouseListener((MouseListener) frm);
		frm.addMouseMotionListener((MouseMotionListener) frm);
		
		frm.setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.fillOval(50, 50, dx, dy);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		dx=e.getX();
		dy=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		x1=e.getX();
		x2=e.getY();
		g.drawLine(dx, dy, x1, x2);
		dx=x1;
		dy=x2;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
