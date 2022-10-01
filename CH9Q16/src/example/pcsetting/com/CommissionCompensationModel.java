package example.pcsetting.com;

public class CommissionCompensationModel extends Compensationmodel{

	public CommissionCompensationModel(int grossSales, double commissionRate) {
		super(grossSales, commissionRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnings() {
		return getgrossSales()*getcommissionRate();
	}
}
