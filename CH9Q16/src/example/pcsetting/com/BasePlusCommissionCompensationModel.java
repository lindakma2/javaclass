package example.pcsetting.com;

public class BasePlusCommissionCompensationModel extends Compensationmodel{

	public BasePlusCommissionCompensationModel(int grossSales, double commissionRate,int baseSalary) {
		super(grossSales, commissionRate);
		// TODO Auto-generated constructor stub
		this.baseSalary=baseSalary;
	}

	private int baseSalary;
	
	public void setbaseSalary(int baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	public int getbaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings() 
	{
		return (getgrossSales()+baseSalary)*getcommissionRate();
	}
}
