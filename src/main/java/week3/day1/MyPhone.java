package week3.day1;

public class MyPhone {

	public static void main(String[] args) {

		System.out.println("Calling Android ");

		AndroidPhone androidObj = new AndroidPhone();
		androidObj.saveContact();
		androidObj.makeCall();
		androidObj.saveContact();
		androidObj.takeVideo();
		

		System.out.println("Calling SmartPhone");

		SmartPhone smartObj = new SmartPhone();
		smartObj.makeCall();
		smartObj.saveContact();
		smartObj.takeVideo();
		smartObj.sendMsgs();
		smartObj.connectWhatsapp();
	}

}
