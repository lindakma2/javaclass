package example.pcsetting.com;

public class Compensationmodel {
	private int grossSales;
	private double commissionRate;
	
	public Compensationmodel(int grossSales,double commissionRate)
	{
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
	}
	
	public void setgrossSales(int grossSales)
	{
		this.grossSales=grossSales;
	}
	public int getgrossSales()
	{
		return grossSales;
	}
	public void setcommissionRate(double commissionRate)
	{
		this.commissionRate=commissionRate;
	}
	public double getcommissionRate()
	{
		return commissionRate;
	}
	public double earnings()
	{
		return grossSales*commissionRate;
	}
}
