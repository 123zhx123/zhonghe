package test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.*;
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
	 
	     public FindCourse() {
		  
	       this.setSize(650,350);
		   this.setLocation(100, 20);
		   this.setLayout(null);
	       this.setBackground(Color.lightGray);
	     
	       
	       
	        Namelabel=new JLabel("课程名称");
			Namelabel.setSize(100,30);
			Namelabel.setLocation(100, 120);
			this.add(Namelabel);
			
			Nametext=new JTextField();
			Nametext.setSize(120,30);
			Nametext.setLocation(220, 120);
			this.add(Nametext);
			
			Teacherlabel=new JLabel("授课教师");
			Teacherlabel.setSize(100,30);
			Teacherlabel.setLocation(100, 160);
			this.add(Teacherlabel);
			
			Teachertext=new JTextField();
			Teachertext.setSize(120,30);
			Teachertext.setLocation(220, 160);
			this.add(Teachertext);
			
			Typelabel=new JLabel("课程类型");
			Typelabel.setSize(100,30);
			Typelabel.setLocation(100, 200);
			this.add(Typelabel);
			
			Typetext=new JTextField();
			Typetext.setSize(120, 30);
			Typetext.setLocation(220, 200);
			this.add(Typetext);
			
			Creditlabel=new JLabel("课程学分");
			Creditlabel.setSize(100,30);
			Creditlabel.setLocation(100, 240);
			this.add(Creditlabel);
			 
			Credittext=new JTextField();
			Credittext.setSize(120, 30);
			Credittext.setLocation(220, 240);
			this.add(Credittext);
			
	       
	       Inputlabel=new JLabel("请输入课程名称");
	       Inputlabel.setSize(150,50);
	       Inputlabel.setLocation(100, 45);
			this.add(Inputlabel);
			
			Inputtext=new JTextField();
			Inputtext.setSize(160,40);
			Inputtext.setLocation(200, 45);
			this.add(Inputtext);
			
			Findbt=new JButton("查询");
			Findbt.setSize(90,38);
			Findbt.setLocation(420, 45);
			this.add(Findbt);
			Findbt.addActionListener(this);
			
			this.setVisible(true);
		  } 
	    

		@Override
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
		
			
		}

