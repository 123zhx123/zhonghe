package test1;

import java.awt.Color;


import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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

	
    public AddCourse() {
	   this.setSize(650,350);
	   this.setLocation(100, 20);
	   this.setLayout(null);
       this.setBackground(Color.lightGray);
    
       
		Namelabel=new JLabel("请输入课程名称");
		Namelabel.setSize(100,30);
		Namelabel.setLocation(60, 20);
		
		this.add(Namelabel);
		
		Nametext=new JTextField();
		Nametext.setSize(120,30);
		Nametext.setLocation(180, 20);
		this.add(Nametext);
		
		Teacherlabel=new JLabel("请输入授课教师");
		Teacherlabel.setSize(100,30);
		Teacherlabel.setLocation(60, 60);
		this.add(Teacherlabel);
		
		Teachertext=new JTextField();
		Teachertext.setSize(120,30);
		Teachertext.setLocation(180, 60);
		this.add(Teachertext);
		
		Typelabel=new JLabel("请选择课程类型");
		Typelabel.setSize(100,30);
		Typelabel.setLocation(60, 100);
		this.add(Typelabel);
		
		Typecom=new JComboBox<String>();
		Typecom.setSize(120,30);
		Typecom.setLocation(180, 100);
		Typecom.addItem("必修课");
		Typecom.addItem("选修课");
		this.add(Typecom);
		
		Addbt=new JButton("添加");
		Addbt.setSize(80,30);
		Addbt.setLocation(350, 80);
		this.add(Addbt);  
		Addbt.addActionListener(this);
		
		
		Creditlabel=new JLabel("请输入课程学分");
		Creditlabel.setSize(100,30);
		Creditlabel.setLocation(60, 140);
		this.add(Creditlabel);
		
		Credittext=new JTextField();
		Credittext.setSize(120,30);
		Credittext.setLocation(180, 140);
		this.add(Credittext);
		this.setVisible(true);
    }	
	

		@Override
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
				}
				catch(IOException ee) {}
			}


		
			
			
}


		
		




