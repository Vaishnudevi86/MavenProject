package week1.day2;

public class MyMobile {
	// variables
	// instance variables
	int screenSize;
	int cost;
	char logo;
	float amps = 1.5f;
	long mobileNo;
	boolean isItTouchScreen;
	String brandName;

//methods
//accessModifier returnType methodName(arguments){method body}

	public String makeCalls() {
		String callMsg = "Hello"; // local variable
		System.out.println(" Making Calls");
		return callMsg;
	}

	public void takePics() {
		System.out.println(" Taking picturs");
	}

	private void payMoney() {
		System.out.println(" Pay Money");
	}

	public void makeSMS(String sms) {
		System.out.println("sms is " + sms);
	}

	public static void main(String[] args) {
		MyMobile mobObj = new MyMobile();
		String str = mobObj.makeCalls();
		System.out.println();
		mobObj.takePics();
		mobObj.payMoney();
		// ctrl+2;l
		// ctrl+1
	}
}
