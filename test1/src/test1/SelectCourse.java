package test1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectCourse extends  JFrame{
	JLabel L1=new JLabel();
	JLabel L2=new JLabel();
	JLabel L3=new JLabel();
	JLabel L4=new JLabel();
	JLabel L5=new JLabel();
	JLabel L6=new JLabel();
	JTextField T1=new JTextField();
	JTextField T2=new JTextField();
	JTextField T3=new JTextField();
	JTextField T4=new JTextField();
	JTextField T5=new JTextField();
	JTextField T6=new JTextField();
	JToolBar JT1=new JToolBar();
	JTable JTA1 =new JTable();
	JTable JTA2 =new JTable();
	BorderLayout B1=new BorderLayout();
	BorderLayout B2=new BorderLayout();
	BorderLayout B3=new BorderLayout();
	JButton JB1=new JButton();
	JButton JB2=new JButton();
	JPanel JP1=new JPanel();
	JPanel JP2=new JPanel();
	JPanel JP3=new JPanel();
	JPanel JP4=new JPanel();
	JPanel JP5=new JPanel();
	JScrollPane JS1= new JScrollPane();
	JScrollPane JS2= new JScrollPane();
	private void SelectCourse(){
		L1.setText("学校设置可选课程信息");
		L2.setText("学号");
		T1.setEnabled(true);
		T1.setPreferredSize(new Dimension(50,22));
		T1.setEditable(false);
		T1.setText("T1");
		T1.setColumns(0);
		T2.setEnabled(true);
		T2.setPreferredSize(new Dimension(70,22));
		T2.setEditable(false);
		T2.setText("T2");
		T2.setColumns(0);
		T3.setEnabled(true);
		T3.setPreferredSize(new Dimension(70,22));
		T3.setEditable(false);
		T3.setText("T3");
		T3.setColumns(0);
		L3.setText("个人已选信息");
		JP1.setMinimumSize(new Dimension(300,10));
		JP1.setPreferredSize(new Dimension(300,10));
		JP1.setLayout(B2);
		JP2.setFont(new java.awt.Font("SansSerif",0,12));
		JP2.setLayout(B1);
		JB1.setText("选课");
		JB1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				 
				
			}
		});
		JP3.setMinimumSize(new Dimension(200,10));
		JP3.setPreferredSize(new Dimension(200,10));
		JP3.setLayout(B3);
		JTA1.setEnabled(false);
		L4.setText("姓名");
		L5.setText("性别");
		JB2.setText("退课");
JB2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				 
				
			}
		});
         


           L6.setText("班级");
           JP2.add(JT1,BorderLayout.SOUTH);
           JP2.add(JP1,BorderLayout.WEST);
           JP2.add(JP3,BorderLayout.NORTH);
           JP1.add(L1,BorderLayout.NORTH);
           JP1.add(JS1,BorderLayout.CENTER);
           JS1.add(JTA1,null);
           JP3.add(L2,null);
           JP3.add(L4,null);
           JP3.add(T3,null);
           JP3.add(L5,null);
           JP3.add(T4,null);
           JP3.add(L6,null);
           JP3.add(T5,null);
           JP2.add(JP4,BorderLayout.EAST);
           JP4.add(L3,BorderLayout.NORTH);
           JP4.add(JS2,BorderLayout.CENTER);
           JP2.add(JP5,BorderLayout.CENTER);
           JS2.add(JTA2,null);
           JP5.add(JB1);
           JP5.add(JB2);
           this.getContentPane().add(JP2, BorderLayout.WEST);
           
           
           
           
		
		 
		
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SelectCourse S1=new SelectCourse();
		S1.setTitle("选课");
		S1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		S1.pack();

	}

}
