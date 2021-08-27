package assignments;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1[] = { 3, 2, 11, 4, 6, 7 };
		int value2[] = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i < value1.length; i++) {

			for (int j = 0; j < value2.length; j++) {

				if (value1[i] == value2[j]) {
					System.out.println(value1[i]);

				}

			}

		}
	}
}