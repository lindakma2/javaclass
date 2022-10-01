package example.pcsetting.com;

public class BasePlusCommissionEmployee {
	private String firstName = "";
	private String lastName = "";
	private String socialSecurityNumber = "";
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
		this.baseSalary=baseSalary;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	public void setGrossSales()
	{
		this.grossSales=grossSales;
	}
	public double getCommissionRate()
	{
		return commissionRate;
	}
	public void setCommissionRate()
	{
		this.commissionRate=commissionRate;
	}
	public void setbaseSalary()
	{
		this.baseSalary=baseSalary;
	}
	public double getbaseSalary()
	{
		return baseSalary;
	}
	public double earnings()
	{
		return getCommissionRate()*getGrossSales()+getbaseSalary();
	}
	
	public String toString()
	{
		return getfirstName()+getlastName()+getSocialSecurityNumber()+getGrossSales()+getCommissionRate()+getbaseSalary();
	}
}
