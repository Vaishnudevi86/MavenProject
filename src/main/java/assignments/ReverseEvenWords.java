package assignments;

import java.util.ArrayList;
import java.util.List;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] testarray = test.split(" ");

		for (int i = 0; i < testarray.length; i++) {
			if (i % 2 == 0) {
				StringBuilder sb = new StringBuilder(testarray[i]);
				System.out.println(sb.reverse().toString());
			} else {
				System.out.println(testarray[i]);
			}
		}
	}

}
