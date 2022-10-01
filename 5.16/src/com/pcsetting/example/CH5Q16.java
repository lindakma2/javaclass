package com.pcsetting.example;
import java.util.Scanner;

public class CH5Q16 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int enternum;
		for(int i=0;i<5;i++)
		{
			System.out.println("please enter number between 1-30");
			enternum=input.nextInt();
			while(enternum<1||enternum>30)
			{
				System.out.println("please enter number between 1-30");
				enternum=input.nextInt();
			}
			for(int j=0;j<enternum;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
