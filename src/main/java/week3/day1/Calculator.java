package week3.day1;

public class Calculator {

	public void addition(int n1, int n2) {
		System.out.println("Addition of method1 = " + (n1 + n2));
	}

	public void addition(int n1, int n2, int n3) {
		System.out.println("Addition of method2 = " + (n1 + n2 + n3));
	}

	public void multiplication(int n1, int n2) {
		System.out.println("Multiplication of method1 = " + (n1 * n2));
	}

	public void multiplication(int n1, double n2) {
		System.out.println("Multiplication of method2 = " + (n1 * n2));
	}

	public void subtraction(int n1, int n2) {
		System.out.println("Subtraction of method1 = " + (n1 - n2));
	}

	public void subtraction(double n1, double n2) {
		System.out.println("Subtraction of method2  = " + (n1 - n2));
	}
	
	public void division(int n1, int n2) {
		System.out.println("Division of method1  = " + (n1 / n2));
	}

	public void division(double n1, double n2) {
		System.out.println("Division of method2 = " + (n1 / n2));
	}

	public static void main(String[] args) {
		Calculator Obj = new Calculator();
		Obj.addition(20, 30);
		Obj.addition(23, 31, 50);
		Obj.multiplication(23, 10.677);
		Obj.multiplication(20, 40);
		Obj.subtraction(10.67, 5.45);
		Obj.subtraction(43, 26);
		Obj.division(20.10, 10.1);
		Obj.division(40, 2);
	}

}
