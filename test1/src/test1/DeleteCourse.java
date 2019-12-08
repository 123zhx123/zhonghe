package test1;

import java.awt.Color;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public  class DeleteCourse extends JPanel implements ActionListener{
	   JLabel Namelabel;
	   JTextField Nametext;
	   JButton Delbt;
	   JTable table;
	  
	   public DeleteCourse() {
		   
		   this.setSize(650,350);
		   this.setLocation(100, 20);
		   this.setLayout(null);
	       this.setBackground(Color.lightGray);
	    

			Namelabel=new JLabel("请输入退选课程");
			Namelabel.setSize(150,50);
			Namelabel.setLocation(100, 280);
			this.add(Namelabel);
			
			Nametext=new JTextField();
			Nametext.setSize(160,40);
			Nametext.setLocation(200, 280);
			this.add(Nametext);
			
			Delbt=new JButton("确认退选");
			Delbt.setSize(90,38);
			Delbt.setLocation(420, 280);
			this.add(Delbt); 
			Delbt.addActionListener(this);
			

	        Object[] columnTitle= {"课程名称","授课教师","课程类型","课程学分"};
	    	 //表格行对象数据
	    	Object[][] tableData= {
	    	new Object[] {"面向对象Java","必修课","张老师","3分"},
	        new Object[] {"面向对象C++","选修课","李老师","2分"},
	    	new Object[] {"微机原理与接口技术","必修课","王老师","3分"},  
	    	  };
	    	  
	    	  //创建表格
	    	 JTable  table=new JTable(tableData,columnTitle);
	    	 JScrollPane scrollpane=new JScrollPane(table);
	    	 scrollpane.setSize(550,150);
	    	 scrollpane.setLocation(60, 20);
	    	 this.add(scrollpane);
		
			this.setVisible(true);
	   }
       
	
	
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Delbt) {
					
				}
				
				
}
}

