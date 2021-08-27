package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,2,2,1};
		int arr1[] = {6,21,8};
		
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> arrList1 = new ArrayList<Integer>();
		
		
		arrList.removeAll(arrList1);
		System.out.println(arrList1);
		
	}

}
