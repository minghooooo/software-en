package shuiguoji;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class panduan extends JTextField implements Runnable{    //���߳�
	private static boolean flag = false;      //�ж�ֵ
	private int temp;    //����ֵ
    

	public boolean getFlag() {   
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public int getTemp() {
		
		if(flag == false) {
			int i = 0;
			try{
				i= Integer.valueOf(this.getText());
			}catch(NumberFormatException e){
				
			}
			
			return i;
		} else {
			return new Random().nextInt(9);
		}
	}
	
	public void run() {
		while(true) {
			temp = this.getTemp();
			this.setText("" + temp);	
			try {
				Thread.sleep(10);	
			} catch(InterruptedException e) {
				e.printStackTrace();	
			} 		
		}
	}  
	public panduan(){
		
	}
}