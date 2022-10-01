package homeworkgui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends Frame implements ActionListener{
	static Frame frm=new Q1();
	static Panel pnl=new Panel(new GridLayout(4,3));
	static Panel pnl2=new Panel(new GridLayout(4,1));
	static Label lab=new Label("0.",Label.RIGHT);
	static Button B[]=new Button[17];
	static int num1,num2,check=1;
	static double total;
	static char pat;
	public static void main(String args[])
	{
		
		
		frm.setLayout(null);
		frm.setSize(300,300);
		frm.setResizable(false);
		lab.setBounds(20, 30, 180, 20);
		lab.setBackground(Color.BLUE);
		pnl.setBounds(20,60,120,80);
		pnl2.setBounds(160,60, 40, 80);
		for(int i=1;i<=9;i++)
		{
			pnl.add(B[i]=new Button(Integer.toString(i)));
		}
		pnl.add(B[10]=new Button("c"));
		pnl.add(B[11]=new Button("0"));
		pnl.add(B[12]=new Button("="));
		
		pnl2.add(B[13]=new Button("+"));
		pnl2.add(B[14]=new Button("-"));
		pnl2.add(B[15]=new Button("*"));
		pnl2.add(B[16]=new Button("/"));
		for(int i=1;i<17;i++)
		{
			B[i].addActionListener((ActionListener) frm);
		}
		
		frm.add(lab);
		frm.add(pnl);
		frm.add(pnl2);
		frm.setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		Button btn=(Button)e.getSource();
		if(check==1)
		{
			System.out.println("ok");
			if(btn==B[1])
			{
				
				num1=1;
			}
			else if(btn==B[2])
			{
				num1=2;
			}
			else if(btn==B[3])
			{
				num1=3;
			}
			else if(btn==B[4])
			{
				num1=4;
			}
			else if(btn==B[5])
			{
				num1=5;
			}
			else if(btn==B[6])
			{
				num1=6;
			}
			else if(btn==B[7])
			{
				num1=7;
			}
			else if(btn==B[8])
			{
				num1=8;
			}
			else if(btn==B[9])
			{
				num1=9;
			}
			check++;
		}
		else if(check==2)
		{
			if(btn==B[1])
			{
				System.out.println("ok1");
				num2=1;
			}
			else if(btn==B[2])
			{
				num2=2;
			}
			else if(btn==B[3])
			{
				num2=3;
			}
			else if(btn==B[4])
			{
				num2=4;
			}
			else if(btn==B[5])
			{
				num2=5;
			}
			else if(btn==B[6])
			{
				num2=6;
			}
			else if(btn==B[7])
			{
				num2=7;
			}
			else if(btn==B[8])
			{
				num2=8;
			}
			else if(btn==B[9])
			{
				num2=9;
			}
		}
		
		if(btn==B[13])
		{
			System.out.println("ok3");
			pat='+';
		}
		if(btn==B[14])
		{
			pat='-';
		}
		if(btn==B[15])
		{
			pat='*';
		}
		if(btn==B[16])
		{
			pat='/';
		}
		if(btn==B[12])
		{
			if(pat=='+')
			{
				total=num1+num2;
				lab.setText(Double.toString(total));
			}
			else if(pat=='-')
			{
				total=num1-num2;
				lab.setText(Double.toString(total));
			}
			else if(pat=='*')
			{
				total=num1*num2;
				lab.setText(Double.toString(total));
			}
			else if(pat=='/')
			{
				total=num1/num2;
				lab.setText(Double.toString(total));
			}
		}
		else if(btn==B[10])
		{
			lab.setText("0.");
			check=1;
		}
	}
	
}
