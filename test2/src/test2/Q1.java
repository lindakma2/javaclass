package test2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.event.MouseInputListener;

public class Q1 extends Frame implements MouseListener,MouseInputListener,ActionListener{
	static Frame frm=new Q1();
	static MenuBar mu=new MenuBar();
	static Menu mu1=new Menu("draw");
	static Menu mu2=new Menu("¾Þ§@");
	static MenuItem mi1=new MenuItem("circle");
	static MenuItem mi2=new MenuItem("rectangle");
	static MenuItem mi3=new MenuItem("line");
	static MenuItem mi4=new MenuItem("Â÷¶}");
	static int dx=100,dy=100,state=0;
	
	public static void main(String args[])
	{
		frm.setMenuBar(mu);
		frm.setSize(500,500);
		frm.setResizable(true);
		frm.setLayout(null);
		frm.addMouseMotionListener((MouseMotionListener) frm);
		frm.addMouseListener((MouseListener) frm);
		mi1.addActionListener((ActionListener) frm);
		mi2.addActionListener((ActionListener) frm);
		mi3.addActionListener((ActionListener) frm);
		mi4.addActionListener((ActionListener) frm);
		
		mu.add(mu1);
		mu.add(mu2);
		
		mu1.add(mi1);
		mu1.add(mi2);
		mu1.add(mi3);
		mu2.add(mi4);
		
		frm.setVisible(true);	
	}
	
	public void paintcircle(Graphics g)
	{
		g.fillOval(100, 100, dx, dy);
	}
	public void paintrec(Graphics g)
	{
		g.fillRect(100, 100, dx, dy);
	}
	public void paintline(Graphics g)
	{
		g.drawLine(50, 50, dx, dy);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		MenuItem mi=(MenuItem)e.getSource();
		if(mi==mi1)
		{
			state=1;
			paintcircle(g);
		}
		if(mi==mi2)
		{
			state=2;
			paintrec(g);
		}
		if(mi==mi3)
		{
			state=3;
			paintline(g);
		}
		if(mi==mi4)
		{
			frm.dispose();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		int x=e.getX();
		int y=e.getY();	
		
		g.drawLine(dx, dy, x, y);
		
		dx=x;
		dy=y;
		
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

	
			
}
