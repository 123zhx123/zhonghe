package test1;

public class Student extends Person {
	Course myCourse;

	String Selectedcourses;

	public void Student() {
		
		//System.out.println("\n所选课程："+Selectedcourses);
		
	}
	public void setCourse(Course C) {
		myCourse = C;
	}
	public String toString() {
		return "\n姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n编号："+id+ "\n所选课程："+myCourse;
		
	}
	
}