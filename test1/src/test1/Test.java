package test1;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("ѡ�γɹ�����");
	
		 Course C=new  Course();
		 C.Coursename= "����A";
		 C.Coursplace="��102";
		 C.Coursteacher= "����";
		 C.Courstime="7:50";
         C.id=11;
		
		 String C1=C.toString();
		
		 
		 Student S = new Student();
		 
		 S.setCourse(C);
		 S.age=19;
		 S.id=2018310100;
		 S.name="����";
		 S.sex='��';
         String S1=S.toString();
		 
		 System.out.println(S1);
		 
				
		 Teacher T = new Teacher();
		
		 T.age=54;
		 T.id=10011;
		 T.name="����";
		 T.sex='��';
		 T.setCourse(C);
		 String T1=T.toString();
		
		 System.out.println(T1);
		 
		
			 
		 
	}
	
}
		 
		 
		
