package assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstno = 0;
		int secno = 1;
		int sum = 0;
		int n = 8;
		System.out.println(firstno);
		System.out.println(secno);
		for (int i = 1; i <= n; i++) {
			sum = firstno + secno;
			System.out.println(sum);
			firstno = secno;
			secno = sum;
		}
	}
}
