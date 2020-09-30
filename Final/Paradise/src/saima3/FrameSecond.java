package saima3;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;

import DataBase.DataConnect;

import model.User;



public class FrameSecond extends Thread {
	private User u;
	double money;
	double tmoney;
	String userName;
	JFrame JF;
	Connection con=null;
	java.sql.Statement st=null;
	int sum;                                   //用户选马的标记变量
	double count2[]=new double[4];
	
	FrameSecond(double money,double tmoney,String userName,JFrame JF,int sum,double count2[]){
		this.money=money;
		this.tmoney=tmoney;
		this.userName=userName;
		this.JF=JF;
		this.sum=sum;
		this.count2=count2;
	
	}
	public void run(){
		
	
		int a=0;
		for(int i=0;i<3;i++){
			if(count2[i]>count2[i+1])
				a=i+1;
		}
		if(a==sum){
			money+=(tmoney*2);
//			try {
//				u.countwin(u);               //计算赢的场数
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}else{
			money-=(tmoney*2);
//			try {
//				u.countlose(u);             //计算输的场数
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		

		try {
			String sql="UPDATE user SET upoint="+money+"where uname='"+userName+"'";
			DataConnect.getStat().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			u.pointChange((int)money, u);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		try {
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paradise","root","123123");
//			st=con.createStatement();
//			st.executeUpdate("UPDATE user SET upoint="+money+"where uname='"+userName+"'");
//		} catch (SQLException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
		JFrameFirst cpt=new JFrameFirst(userName);  
		cpt.create();
		JF.dispose();
		if(a==sum){
			JFrame frm2=new JFrame();
			frm2.setDefaultCloseOperation(1);      
	        frm2.setBounds(515,260,368,282);
	        frm2.setVisible(true);
	        frm2.setLayout(new BorderLayout());
	        
	        ImageClass im=new ImageClass("bin/saima3/hrwin.png",368,282);
	        im.setBounds(0, 0, 368, 282);
	        frm2.getContentPane().add(im);
//	        JLabel jl=new JLabel(new ImageIcon("bin/saima3/hrwin.png"));
//	        jl.setBounds(0, 0, 368, 282);
//	        frm2.getContentPane().add(jl);
		}
		else{
			JFrame frm2=new JFrame();
			frm2.setDefaultCloseOperation(1);      
	        //frm2.setBounds(515,260,368,282);
	        frm2.setBounds(515,260,368,282);
	        frm2.setVisible(true);
	        frm2.setLayout(new BorderLayout());
	        
	        ImageClass im=new ImageClass("bin/saima3/hrlose.png",368,282);
	        im.setBounds(0, 0, 368, 282);
	        frm2.getContentPane().add(im);
//	        JButton jb=new JButton(new ImageIcon("bin/saima3/hrlose.png"));
//	        jb.setBounds(0, 0, 368, 282);
//	        frm2.getContentPane().add(jb);
	        
	        
		}
	}

}
