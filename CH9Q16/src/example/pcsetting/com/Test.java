package example.pcsetting.com;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CommissionCompensationModel enter1=new CommissionCompensationModel(100,0.5);
		BasePlusCommissionCompensationModel enter2=new BasePlusCommissionCompensationModel(100,0.5,200);
		
		Employees person1=new Employees("A","B","1234",enter1);
		Employees person2=new Employees("c","D","5678",enter2);
		
		System.out.println("person1 earnings"+person1.Compensationearnings());
		System.out.println("person2 earnings"+person2.Compensationearnings());
	}

}
