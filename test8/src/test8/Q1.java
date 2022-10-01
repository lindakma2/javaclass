package test8;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Q1 extends Frame implements MouseListener,MouseMotionListener{
	static Frame frm=new Q1();
	static int x1,y1;
	
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.addMouseListener((MouseListener) frm);
		frm.addMouseMotionListener((MouseMotionListener) frm);
		frm.setVisible(true);
	}

	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		int x2=e.getX();
		int y2=e.getY();
		
		g.drawLine(x1, y1, x2, y2);
		x1=x2;
		y1=y2;
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=e.getX();
		y1=e.getY();
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
}
