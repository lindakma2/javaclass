package test5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Q2 extends Frame{
	static Frame frm=new Frame();
	static Label lab=new Label("0.",Label.RIGHT);
	static Panel pnl=new Panel(new GridLayout(4,3));
	
	
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.setLayout(null);
		for(int i=1;i<12;i++)
		{
			pnl.add(new Button(Integer.toString(i)));
		}
		
		lab.setBackground(Color.green);
		lab.setBounds(20, 20, 30, 120);
		pnl.setBounds(20, 100, 100, 100);
		
		frm.add(lab);
		frm.add(pnl);
		frm.setVisible(true);
	}
}
