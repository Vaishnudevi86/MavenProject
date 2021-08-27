package week3.day2;

public class CalcIndivualsTax implements TaxCalculation {

	public static void main(String[] args) {
		

	}

	@Override
	public void calcDeductions(String name, double HRA, double LTA) {
	double deductions = HRA + LTA;
	System.out.println("Deductions of an individual is  " + deductions);
	
	}

	@Override
	public void calcGrossIncome(String name, double netIncome, double deductions) {
	
		double Gross = netIncome + deductions;
		System.out.println("Deductions of an individual is  " + Gross);
	}

	@Override
	public int taxSlab() {
	System.out.println("Taxpayer is an individual");
		return 0;
	}

	@Override
	public double CalcTaxandPublishValue() {
	System.out.println("Published the tax payer details");
		return 0;
	}

	public void salary() {
		System.out.println("Salary of this individual");
	}
}
