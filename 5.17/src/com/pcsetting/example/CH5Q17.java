package com.pcsetting.example;
import java.util.Scanner;


public class CH5Q17 {
	public static class Student
	{
		public Student(String name,String grade)
		{
			this.name=name;
			this.grade=grade;
		}
		public Student(){}
		
		public void setname(String name)
		{
			this.name=name;
		}
		
		public void setgrade(String grade)
		{
			this.grade=grade;
		}
		
		public String getname()
		{
			return name;
		}
		
		public String getgrade()
		{
			return grade;
		}
		private String name;
		private String grade;
	}
	public static void main(String[] args)
	{
		Student[] enterdata=new Student[5];
		int[] gradeperson=new int[4];
		Scanner input=new Scanner(System.in);
		String entername;
		String entergrade;
		for(int i=0;i<5;i++)
		{
			System.out.println("please enter the name");
			entername=input.nextLine();
			System.out.println("please enter the grade");
			entergrade=input.nextLine();
			switch(entergrade)
			{
			case "A":gradeperson[0]++;
				break;
			case "B":gradeperson[1]++;
				break;
			case "C":gradeperson[2]++;
				break;
			case "D":gradeperson[3]++;
				break;
			}
			enterdata[i]=new Student(entername,entergrade);
		}
		System.out.println("get A have"+gradeperson[0]+"people");
		System.out.println("get B have"+gradeperson[1]+"people");
		System.out.println("get C have"+gradeperson[2]+"people");
		System.out.println("get D have"+gradeperson[3]+"people");
	}
}
