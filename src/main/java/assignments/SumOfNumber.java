package assignments;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int sum = 0;
		int remainder = 0;
		while (n > 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println("Sum of the given number is " + sum);
	}

}
