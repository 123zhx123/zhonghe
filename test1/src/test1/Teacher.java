package test1;

public class Teacher extends Person {
		Course myCourse;

	String coursestaught;

	public void Teacher() {
		//System.out.print("\n���ڿγ̣�"+coursestaught);
	}
	public void setCourse(Course C) {
		 myCourse=C;
	}
	public String toString() {
		return  "\n������"+name+"\n���䣺"+age+"\n�Ա�"+sex+"\n��ţ�"+id+"\n���ڿγ̣�"+myCourse;
	
	}
}
