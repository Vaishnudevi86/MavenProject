package assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String revValue = "";
		char[] chararray = str.toCharArray();
		for (int i = chararray.length - 1; i >= 0; i--) {
			revValue = revValue + chararray[i];
			System.out.println(revValue);
		}
		if (str.equals(revValue))
			System.out.println("It is a palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
