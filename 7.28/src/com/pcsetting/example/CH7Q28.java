package com.pcsetting.example;
import java.util.Scanner;

public class CH7Q28 
{
	public static void main(String args[])
	{
		int tortois=0,hare=0;
		int Tmovetype,Hmovetype;
		while(tortois<70&&hare<70)
		{
			Tmovetype=(int)(Math.random()*10)+1;
			Hmovetype=(int)(Math.random()*10)+1;
			if(Tmovetype>=1&&Tmovetype<=5)
			{
				tortois=tortois+3;
			}
			else if(Tmovetype>=6&&Tmovetype<=7)
			{
				tortois=tortois-6;
				if(tortois<0)
				{
					tortois=0;
				}
			}
			else
			{
				tortois++;
			}
			if(Hmovetype>=3&&Hmovetype<=4)
			{
				hare=hare+9;
			}
			else if(Hmovetype==5)
			{
				hare=hare-12;
				if(hare<0)
				{
					hare=0;
				}
			}
			else if(Hmovetype>=6&&Hmovetype<=8)
			{
				hare++;
			}
			else if(Hmovetype>=9&&Hmovetype<=10)
			{
				hare=hare-2;
				if(hare<0)
				{
					hare=0;
				}
			}
		}
		
	}
	
}
