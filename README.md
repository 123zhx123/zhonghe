# zhonghe
# String2
计181 张红霞 2018310394
实验五 综合实验
实验目的
 分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常
实验要求
一、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例：人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
学生（编号、姓名、性别、所选课程、……）
课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。
 
二、要求:
1、 设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
2、 基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
3、 针对操作过程中可能会出现的各种异常，做异常处理
4、 基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
5、 基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
6、 本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
7、 提交截止时间：12月8日。
1.	写清实验题目
(1)	定义每种角色人员的属性及其方法
public class Teacher extends Person {}
public class Student extends Person {}
public class Course{}
2使用GUI窗体及其组件设计窗体界面
登录
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public  class LoginWindow extends JFrame{
	//标签
	private JLabel lable1;
	private JLabel lable2;
	//文本框
	private JTextField text1;
	private JTextField text2;
	//按钮
	private JButton bt1;
	private JButton bt2;  
	//构造函数
  添加事件
  private void addListener()
	{
		bt1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(text1.getText().equals("123")&&text2.getText().equals("123"))
				{
					new MainWindow();
				    dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "登陆密码错误");
				}
			}
		});
		
		bt2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});

	}
	  
3 完成学生选课过程业务逻辑编程
分别有添加课程，删除课程，查询课程等功能
public  class DeleteCourse extends JPanel implements ActionListener{
	   JLabel Namelabel;
	   JTextField Nametext;
	   JButton Delbt;
	   JTable table;
     public  class FindCourse extends JPanel implements ActionListener{
	   JLabel Inputlabel;
	   JTextField Inputtext;
	   JButton Findbt;
	   JLabel Namelabel;
	   JLabel Typelabel;
	   JLabel Teacherlabel;
	   JLabel Creditlabel;
	   JTextField Nametext;
	   JTextField Teachertext;
	   JTextField Credittext;
	   JTextField Typetext;
	   File file = new File("选课");
	 
	     public FindCourse() {}
       public  class AddCourse extends JPanel implements ActionListener{
   JLabel Namelabel;
   JLabel Typelabel;
   JLabel Teacherlabel;
   JLabel Creditlabel;
   JTextField Nametext;
   JTextField Teachertext;
   JTextField Credittext;
   JComboBox<String> Typecom;
   JButton Addbt;
   JScrollPane scrollpane;
   JTable table;
   File file = new File("选课");

	
    public AddCourse() {}
		  
4基于文件保存并读取数据
public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Addbt) {
				
			addcourse();
			}
		}
			private void addcourse() {
				// TODO 自动生成的方法存根
				
				try {
					RandomAccessFile outfile = new RandomAccessFile(file,"rw");
					if(file.exists()) {
						long length = file.length();
						outfile.seek(length);
		
					}
					outfile.writeUTF(Nametext+getName());
					outfile.writeUTF(Teachertext.getText());
					outfile.writeUTF(Credittext.getText());
					outfile.close();
          public void actionPerformed(ActionEvent e) {
			
			String inputName=Inputtext.getText();
			if(e.getSource()==Findbt) {
				find();
			}
	
}


		private void find() {
			// TODO 自动生成的方法存根
			int number = 1;
			try {
				RandomAccessFile outfile = new RandomAccessFile(file,"r");
				String course =null;
				RandomAccessFile infile = null;
				while ((course=infile.readUTF())!=null) {
					Nametext.setText(course);
					Typetext.setText(null);
					Credittext.setText(null);
					number++;
				}
				}
				catch(Exception ee) {}
		}
		
5 分别对可能出现异常的地方进行异常处理
try{}
catch(Exception e){}

(3)	给出最终正确的程序完整代码，并截图程序输出

(2)	小结并分析实验结果
把每一次的实验合起来是会发现很多问题，最重要的是怎样把他们联系起来，以及使用io流去存储数据。    
IO流用来处理设备之间的数据传输
Java程序中，对于数据的输入/输出操作以”流(stream)” 的方式进行。是指从源节点到目标节点的数据流动
源节点和目标节点可以是文件、网络、内存、键盘、显示器等等。
java.io包下提供了各种“流”类和接口，用以获取不同种类的数据，并通过标准的方法输入或输出数据。
输入input：读取外部数据（磁盘、光盘等存储设备的数据）到程序（内存）中。
输出output：将程序（内存）数据输出到磁盘、光盘等存储设备中
按操作数据单位不同分为：字节流(8 bit)，字符流(16 bit)  
按数据流的流向不同分为：输入流，输出流
使用文件输入流打开指定文件：
对于文本文件，应使用字符输入流FileReader流
对于二进制文件，应使用字节输入流FileInputStream流
读取文件数据
关闭输入流
