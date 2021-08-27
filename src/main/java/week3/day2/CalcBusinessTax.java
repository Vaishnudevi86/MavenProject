package week3.day2;

public class CalcBusinessTax implements TaxCalculation, IncomeCalculation {

	public static void main(String[] args) {

	}

	@Override
	public void calcDeductions(String name, double HRA, double LTA) {
		double deductions = HRA + LTA;
		System.out.println("Deductions of business is  " + deductions);

	}

	@Override
	public void calcGrossIncome(String name, double netIncome, double deductions) {
		double Gross = netIncome + deductions;
		System.out.println("Deductions of business is  " + Gross);

	}

	@Override
	public int taxSlab() {
		System.out.println("Taxpayer is a business");
		return 0;
	}

	@Override
	public double CalcTaxandPublishValue() {
		System.out.println("Published the tax payer details");
		return 0;
	}

	@Override
	public double calcNetIncome(String name, double income1, double income2) {
		double netIncome = income1 + income2;
		System.out.println("The net income of the business is" + netIncome);
		return 0;
	}

	public void additionalIncome() {
		System.out.println(" Additional income of business");
	}
}
