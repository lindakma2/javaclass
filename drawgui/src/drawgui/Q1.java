package drawgui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Q1 extends Frame implements ActionListener,MouseMotionListener{
	static Frame frm=new Q1();
	static MenuBar mb=new MenuBar();
	static Menu mu1=new Menu("繪圖");
	static Menu mu2=new Menu("其他操作");
	static MenuItem mi1=new MenuItem("直線");
	static MenuItem mi2=new MenuItem("橢圓");
	static MenuItem mi3=new MenuItem("方形");
	static int dy=200,dx=200,state;
	
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.setMenuBar(mb);
		frm.setResizable(true);
		frm.addMouseMotionListener((MouseMotionListener) frm);
		
		mi1.addActionListener((ActionListener)frm);
		mi2.addActionListener((ActionListener)frm);
		mi3.addActionListener((ActionListener)frm);
		
		mb.add(mu1);
		mb.add(mu2);
		mu1.add(mi1);
		mu1.add(mi2);
		mu1.add(mi3);
		frm.setVisible(true);
	}
	public void paintcircle(Graphics g)
	{
		//System.out.println("ok");
		g.setColor(Color.red);
		g.fillOval(50, 50, dx,dy);
	}
	public void paintline(Graphics g)
	{
		//System.out.println("ok");
		g.setColor(Color.red);
		g.drawLine(100, 100, dx,dy);
	}
	public void paintrac(Graphics g)
	{
		//System.out.println("ok");
		g.setColor(Color.red);
		g.fillRect(100, 100, dx,dy);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		MenuItem mi=(MenuItem)e.getSource();
		if(mi==mi1)
		{
			state=1;
			paintline(g);
		}
		if(mi==mi2)
		{
			state=2;
			paintcircle(g);
		}
		if(mi==mi3)
		{
			state=3;
			paintrac(g);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		dx=e.getX();
		dy=e.getY();
		
		if(state==1)
		{
			update(g);
			paintline(g);
		}
		if(state==2)
		{
			update(g);
			paintcircle(g);
		}
		if(state==3)
		{
			update(g);
			paintrac(g);
		}
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
