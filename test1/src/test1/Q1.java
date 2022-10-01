package test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends Frame implements ActionListener{
	static Frame frm=new Q1();
	static Label lab=new Label(".0",Label.RIGHT);
	static Panel pnl1=new Panel(new GridLayout(4,3));
	static Panel pnl2=new Panel(new GridLayout(4,1));
	static Button B[]=new Button[20]; 
	 
	public static void main(String args[])
	{
		frm.setSize(500, 500);
		frm.setResizable(true);
		frm.setLayout(null);
		
		for(int i=1;i<10;i++)
		{
			pnl1.add(B[i]=new Button(Integer.toString(i)));
		}
		pnl1.add(B[10]=new Button("c"));
		pnl1.add(B[11]=new Button("0"));
		pnl1.add(B[12]=new Button("="));
		pnl2.add(B[13]=new Button("+"));
		pnl2.add(B[14]=new Button("-"));
		pnl2.add(B[15]=new Button("*"));
		pnl2.add(B[16]=new Button("/"));
		
		for(int i=1;i<17;i++)
		{
			B[i].addActionListener((ActionListener) frm);
		}
		
		lab.setBackground(Color.gray);
		lab.setBounds(20, 20, 160, 40);
		pnl1.setBounds(20, 80, 120, 160);
		pnl2.setBounds(150, 80, 40, 160);
		
		frm.add(lab);
		frm.add(pnl1);
		frm.add(pnl2);
		
		frm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Button but=(Button)e.getSource();
		if(but==B[1])
		{
			lab.setText("1");
		}
		if(but==B[2])
		{
			lab.setText("2");
		}
		if(but==B[3])
		{
			lab.setText("3");
		}
		if(but==B[4])
		{
			lab.setText("4");
		}
		if(but==B[5])
		{
			lab.setText("5");
		}
		if(but==B[6])
		{
			lab.setText("6");
		}
		if(but==B[7])
		{
			lab.setText("7");
		}
		if(but==B[8])
		{
			lab.setText("8");
		}
		if(but==B[9])
		{
			lab.setText("9");
		}
	}
}
