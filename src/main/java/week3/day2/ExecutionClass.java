package week3.day2;

public class ExecutionClass {

	public static void main(String[] args) {
		CalcIndivualsTax objTax = new CalcIndivualsTax();
		objTax.calcDeductions("Vaishnu", 4000,5000);
		objTax.calcGrossIncome("Devi",34587589.66, 457665489.00);
		objTax.CalcTaxandPublishValue();
		objTax.salary();
		objTax.taxSlab();

	}

}
