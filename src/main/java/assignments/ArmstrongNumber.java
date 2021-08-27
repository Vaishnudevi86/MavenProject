package assignments;

public class ArmstrongNumber {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 0; n < 500; n++) {
			int calc = 0, remainder, originalNumber;
			originalNumber = n;

			while (originalNumber != 0) {
				remainder = originalNumber % 10;
				calc += Math.pow(remainder, 3);
				originalNumber /= 10;
			}
			
			System.out.println((calc == n) ? (n + " is an Armstrong number.") : (n + " is not an Armstrong number."));
		
		}
		
	}
}