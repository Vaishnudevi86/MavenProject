package assignments;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		for (int n = 2; n <= 13; n++) {
			
			boolean isItPrime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isItPrime = false;
				}
			}
			
			System.out.println("The number " + n + " is prime? " + isItPrime);
		}
		
	}
}
