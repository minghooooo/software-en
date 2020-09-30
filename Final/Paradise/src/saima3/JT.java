package saima3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.User;

import View.menu1;

public class JT extends Thread implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
       
	JFrameFirst jf=null;
	
	String record;                        //插入数据库的数据进行记录
	JTextField tx1; 
	public User u;
//	JPasswordField JPF1;
//	JPasswordField JPF2;
//	char password[]=null;
	JFrame frm;
//	JButton JB4;                          //注册按钮
//	JButton JB1;                          //取消按钮、
	double tmoney=0;                       //投注数
	
    JT(JFrameFirst jf){
    	this.jf=jf;
    }
    JT(JTextField tx1,JFrame frm){
 //   	JB4=JB1;
    	this.tx1=tx1;
//    	this.JPF1=JPF1;
//   	this.JPF2=JPF2;
    	this.frm=frm;
 //   	this.JB1=JB2;
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(jf!=null){
		if(e.getSource()==jf.JB[0]){                   //第一匹马按钮的监听事件
			jf.JB[5].setLocation(317, 61);
			jf.JB[6].setLocation(1000, 1000);
			jf.JB[7].setLocation(1000, 1000);
			jf.JB[8].setLocation(1000, 1000);
			
	        jf.num=1;
		}
		if(e.getSource()==jf.JB[1]){                    //第二匹马按钮的监听事件
			jf.JB[5].setLocation(1000, 1000);
			jf.JB[6].setLocation(317, 61);
			jf.JB[7].setLocation(1000, 1000);
			jf.JB[8].setLocation(1000, 1000);

	        jf.num=2;
		}
		if(e.getSource()==jf.JB[2]){                    //第三匹马按钮的监听事件
			jf.JB[5].setLocation(1000, 1000);
			jf.JB[6].setLocation(1000, 1000);
			jf.JB[7].setLocation(317, 61);
			jf.JB[8].setLocation(1000, 1000);
			
			jf.num=3;
		}
		if(e.getSource()==jf.JB[3]){                      //第四匹马按钮的监听事件
			jf.JB[5].setLocation(1000, 1000);
			jf.JB[6].setLocation(1000, 1000);
			jf.JB[7].setLocation(1000, 1000);
			jf.JB[8].setLocation(317, 61);   
			
			jf.num=4;
			
		}

			
		if(e.getSource()==jf.JB[4]){                       //开始按钮的监听事件
			//jf.mc.stop();
			record=jf.tx2.getText();
			tmoney=Double.valueOf(record);
			if(tmoney<jf.money){
				jf.frm.dispose();
				new Competition(jf.money,tmoney,jf.userName,jf.num);
			}
			else{
				JFrame frm2=new JFrame();
				frm2.setTitle("您的积分不足");                      
				frm2.setDefaultCloseOperation(1);      
		        frm2.setBounds(800,560,300,250);
		        frm2.setVisible(true);
		        frm2.setLayout(new BorderLayout());
			}
		}
		
		if(e.getSource()==jf.JB[9]){ //返回按钮监听
			jf.frm.dispose();
//			this.u = u;
//			new menu1(u).setVisible(true);
		}
		}
		
	}
}

