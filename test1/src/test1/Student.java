package test1;

public class Student extends Person {
	Course myCourse;

	String Selectedcourses;

	public void Student() {
		
		//System.out.println("\n��ѡ�γ̣�"+Selectedcourses);
		
	}
	public void setCourse(Course C) {
		myCourse = C;
	}
	public String toString() {
		return "\n������"+name+"\n���䣺"+age+"\n�Ա�"+sex+"\n��ţ�"+id+ "\n��ѡ�γ̣�"+myCourse;
		
	}
	
}