package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The size of desktop is 20 inch");
	}

	public static void main(String[] args) {
		Desktop deskObj = new Desktop();
		Computer compObj = new Computer();
		deskObj.computermodel();
		deskObj.desktopSize();
		compObj.computermodel();

	}

}
