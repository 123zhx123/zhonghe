package test1;

public class Teacher extends Person {
		Course myCourse;

	String coursestaught;

	public void Teacher() {
		//System.out.print("\n所授课程："+coursestaught);
	}
	public void setCourse(Course C) {
		 myCourse=C;
	}
	public String toString() {
		return  "\n姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n编号："+id+"\n所授课程："+myCourse;
	
	}
}
