package Week5day2Ass;

public class Students {
	public void  getStudentInfo(int ID) {
		System.out.println(ID);
	}
	public void  getStudentInfo(int ID, String name) {
		System.out.println(ID +" "+name);
	}
	public void  getStudentInfo(String email, int phonenumber) {
		System.out.println(email +" "+phonenumber);
	}
	public static void main(String[] args) {
		Students student=new Students();
		student.getStudentInfo(11084041);
		student.getStudentInfo(11084041, "Meenakshi");
		student.getStudentInfo("meenakshikannan@gmail.com", 984653686);
	}

}
