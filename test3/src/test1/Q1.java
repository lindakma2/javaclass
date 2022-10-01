package test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Q1 extends Frame implements ActionListener,ItemListener,KeyListener{
	static Frame frm=new Q1();
	static List lst=new List();
	static Label lab1=new Label("品項");
	static Label lab2=new Label("冰塊");
	static Checkbox cb1=new Checkbox("正常");
	static Checkbox cb2=new Checkbox("微冰");
	static Checkbox cb3=new Checkbox("少兵");
	static Checkbox cb4=new Checkbox("去冰");
	static Panel pnl=new Panel();
	static Button but=new Button("保存");
	static TextField txf=new TextField();
	static TextArea txa=new TextArea();
	static MenuBar mb=new MenuBar();
	static Menu mu=new Menu("操作");
	static MenuItem mui=new MenuItem("離開");
	
	static String ice,drink,num;
	
	
	public static void main(String args[])
	{
		CheckboxGroup ice=new CheckboxGroup();
		frm.setSize(500, 500);
		frm.setResizable(true);
		frm.setLayout(null);
		frm.setMenuBar(mb);
		lst.addItemListener((ItemListener) frm);
		cb1.addItemListener((ItemListener) frm);
		cb2.addItemListener((ItemListener) frm);
		cb3.addItemListener((ItemListener) frm);
		cb4.addItemListener((ItemListener) frm);
		mui.addActionListener((ActionListener) frm);
		but.addActionListener((ActionListener) frm);
		mb.add(mu);
		mu.add(mui);
		lst.add("紅茶");
		lst.add("綠茶");
		lst.add("奶茶");
		lst.add("清茶");
		lst.add("冬瓜茶");
		cb1.setCheckboxGroup(ice);
		cb2.setCheckboxGroup(ice);
		cb3.setCheckboxGroup(ice);
		cb4.setCheckboxGroup(ice);
		pnl.add(cb1);
		pnl.add(cb2);
		pnl.add(cb3);
		pnl.add(cb4);
		
		lab1.setBounds(20, 60, 50, 50);
		lab2.setBounds(120, 60, 50, 50);
		lst.setBounds(20, 120, 50, 100);
		pnl.setBounds(120, 120, 50, 100);
		
		but.setBounds(200, 60, 50, 50);
		txf.setBounds(200, 120, 50, 50);
		txa.setBounds(20, 300, 200, 100);
		
		frm.add(lab1);
		frm.add(lab2);
		frm.add(lst);
		frm.add(pnl);
		frm.add(but);
		frm.add(txf);
		frm.add(txa);
		
		frm.setVisible(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		String temp=e.toString();
		num=temp;
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		drink=lst.getSelectedItem();
		if(cb1.getState()==true)
		{
			ice="normal";
		}
		if(cb2.getState()==true)
		{
			ice="little";
		}
		if(cb3.getState()==true)
		{
			ice="few";
		}
		if(cb4.getState()==true)
		{
			ice="none";
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof MenuItem)
		{
			MenuItem mu=(MenuItem)e.getSource();
			if(mu==mui)
			{
				frm.dispose();
			}
		}
		if(e.getSource() instanceof Button)
		{
			Button but1=(Button)e.getSource();
			if(but1==but)
			{
				txa.setText(drink+"\n"+ice);
			}
		}
	}
}
