package test10;

import java.awt.*;

public class Q1 extends Frame{
	static Frame frm=new Frame();
	static Label lab=new Label("0.",Label.RIGHT);
	static Panel pnl1=new Panel(new GridLayout(4,3));
	static Panel pnl2=new Panel(new GridLayout(4,1));
	
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.setLayout(null);
		frm.setResizable(true);
		
		for(int i=1;i<13;i++)
		{
			pnl1.add(new Button(Integer.toString(i)));
		}
		pnl2.add(new Button("+"));
		pnl2.add(new Button("-"));
		pnl2.add(new Button("*"));
		pnl2.add(new Button("/"));
		
		lab.setBackground(Color.CYAN);
		lab.setBounds(50, 50, 120, 50);
		pnl1.setBounds(30, 100, 120, 160);
		pnl2.setBounds(170, 100, 40, 160);
		
		frm.add(lab);
		frm.add(pnl1);
		frm.add(pnl2);
		frm.setVisible(true);
	}
}
