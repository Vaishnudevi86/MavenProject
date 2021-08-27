package assignments;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitText = text.split(" ");

		for (String string : splitText) {
			int count = 0;
			for (String string2 : splitText) {
				if (string.equals(string2)) {
					count = count + 1;

				}

			}
			if (count > 1) {
				text = text.replace(string, "");
			}

		}
		System.out.println(text);
	}
}