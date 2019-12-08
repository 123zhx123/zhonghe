package test1;

public class Course{
	int id;
	String Coursename;
	String Coursplace;
	String Courstime;
	String Coursteacher;
	
	public void Course() {
		
		//System.out.println("课程编号："+id+"\n课程名称："+Coursename+"\n上课地点："
	//+Coursplace+"\n上课时间："+Courstime+"\n上课老师："+Coursteacher);
		
	}
	public String toString() {
		return "\n课程编号："+id+"\n课程名称："+Coursename+"\n上课地点："
				+Coursplace+"\n上课时间："+Courstime+"\n上课老师："+Coursteacher;
	}
}


