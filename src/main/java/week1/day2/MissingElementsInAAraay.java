package week1.day2;

public class MissingElementsInAAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arrNum = {0,1,2,3,4,6,7,8};
for(int i =0; i< arrNum.length; i++) {
	if (arrNum[i] !=i) {
		System.out.println("Missing element is " + i);
		break;
	}
}
	}

}
