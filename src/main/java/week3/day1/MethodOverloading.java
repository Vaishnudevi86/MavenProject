package week3.day1;

public class MethodOverloading {

	public void getStudentsDetails() {
		int studId = 1000;
		String stuName = "Vaishnu";
		System.out.println("Student Id of method1 " + studId);
		System.out.println("Student name of method1" + stuName);

	}

	public void getStudentsDetails(String name) {
		System.out.println("Student name of method2" + name);
	}

	public void getStudentsDetails(int Id) {
		System.out.println("Student Id of method3 " + Id);

	}

	public void getStudentsDetails(int Id, String name) {
		System.out.println("Student Id of method4 " + Id);
		System.out.println("Student name of method4" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading Obj = new MethodOverloading();
		Obj.getStudentsDetails();
		Obj.getStudentsDetails(101);
		Obj.getStudentsDetails("DEVI");
		Obj.getStudentsDetails(201, "Jiya");
	}

}
