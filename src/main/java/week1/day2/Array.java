package week1.day2;

import java.util.Arrays;
import java.util.Collections;

//finding largest element
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = { 34, 203, 5, 78, 19, 100, 900, 1 };
		Arrays.sort(arrNum);
		System.out.println("Largest no of this array is " + arrNum[arrNum.length - 2]);
		Collections.reverse(Arrays.asList(arrNum));
	}

}
