package test1;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("选课成功！！");
	
		 Course C=new  Course();
		 C.Coursename= "高数A";
		 C.Coursplace="教102";
		 C.Coursteacher= "张三";
		 C.Courstime="7:50";
         C.id=11;
		
		 String C1=C.toString();
		
		 
		 Student S = new Student();
		 
		 S.setCourse(C);
		 S.age=19;
		 S.id=2018310100;
		 S.name="李四";
		 S.sex='男';
         String S1=S.toString();
		 
		 System.out.println(S1);
		 
				
		 Teacher T = new Teacher();
		
		 T.age=54;
		 T.id=10011;
		 T.name="张三";
		 T.sex='男';
		 T.setCourse(C);
		 String T1=T.toString();
		
		 System.out.println(T1);
		 
		
			 
		 
	}
	
}
		 
		 
		
