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
	    

			Namelabel=new JLabel("��������ѡ�γ�");
			Namelabel.setSize(150,50);
			Namelabel.setLocation(100, 280);
			this.add(Namelabel);
			
			Nametext=new JTextField();
			Nametext.setSize(160,40);
			Nametext.setLocation(200, 280);
			this.add(Nametext);
			
			Delbt=new JButton("ȷ����ѡ");
			Delbt.setSize(90,38);
			Delbt.setLocation(420, 280);
			this.add(Delbt); 
			Delbt.addActionListener(this);
			

	        Object[] columnTitle= {"�γ�����","�ڿν�ʦ","�γ�����","�γ�ѧ��"};
	    	 //����ж�������
	    	Object[][] tableData= {
	    	new Object[] {"�������Java","���޿�","����ʦ","3��"},
	        new Object[] {"�������C++","ѡ�޿�","����ʦ","2��"},
	    	new Object[] {"΢��ԭ����ӿڼ���","���޿�","����ʦ","3��"},  
	    	  };
	    	  
	    	  //�������
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

