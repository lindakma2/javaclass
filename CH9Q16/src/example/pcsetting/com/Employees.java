package example.pcsetting.com;

public class Employees {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Compensationmodel nowmodel;
	
	public Employees(String firstName,String lastName,String socialSecurityNumber,Compensationmodel Entermodel)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.nowmodel=Entermodel;
	}
	
	public void changeModel(Compensationmodel ChangeModel)
	{
		this.nowmodel=ChangeModel;
	}
	
	public double Compensationearnings()
	{
		return nowmodel.earnings();
	}
}
