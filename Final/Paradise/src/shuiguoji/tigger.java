/* tigerr.java
 *
 * Created on __DATE__, __TIME__
 */

package shuiguoji;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.StringReader;
import java.sql.SQLException;
import java.util.Random;
import shuiguoji.Machine1;
import javax.swing.*;

import model.User;

import View.menu1;
import View.shop.ImagePanel;



/**
 *
 * @author  __USER__
 */

@SuppressWarnings("serial")
public class tigger extends javax.swing.JFrame implements Runnable {
	//public static Object[] jButton;    //jifen那边的字段
	//public static final Object[] jButton = null;   //jifen那边的常量
	boolean suspended = false;
	boolean i = false;
	Thread t1 ;
	/** Creates new form tigerr */
	public tigger() {
		
		initComponents();

	}

	

	JButton b;

	public void tiggerr(JButton b) {
		this.b = b;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		this.setTitle("中南乐园老虎机");
		jPanel1 =new ImagePanel(new ImageIcon("src/img/laohu.jpg").getImage());
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		//this.setLocationRelativeTo(null);//窗口在屏幕中间显示
		int windowWidth = this.getWidth(); // 获得窗口宽   
		int windowHeight = this.getHeight(); // 获得窗口高  
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width; // 获取屏幕的宽   
		int screenHeight = screenSize.height; // 获取屏幕的高   
		this.setLocation(screenWidth / 4 - windowWidth / 2, screenHeight /
				4 - windowHeight / 2);// 设置窗口居中显示

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/moregame.jpg"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/拉杆.jpg"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
		"/img/zanting.jpg"))); // NOI18N
		jButton3.setForeground(new java.awt.Color(255, 51, 51));
		jButton3.setText("jButton3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
		"/img/zanting.jpg"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
		"/img/guize.jpg"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
		"/img/jifen.jpg"))); // NOI18N
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel1 =new ImagePanel(new ImageIcon("src/img/laohu.jpg").getImage());
		
		jLabel1.setIcon(new ImageIcon("src/img/1.png"));
		jLabel2.setIcon(new ImageIcon("src/img/1.png"));
		jLabel3.setIcon(new ImageIcon("src/img/1.png"));
		jLabel1.setText("");
		jLabel2.setText("");
		jLabel3.setText("");

		jButton4.setText("");
		jButton5.setText("");
		jButton6.setText("");
		
		 //String[] arr2 = new String[3];  // 2
	     //arr2[1] = "src/img/1.png";
	     //arr2[2] = "src/img/2.png";
	     //arr2[3] = "src/img/3.png";


		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				162,
																				162,
																				162)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				113,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				55,
																				55,
																				55)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				99,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												35, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				122,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				30,
																				30,
																				30)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				15,
																				15,
																				15)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				81,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				49,
																				49,
																				49)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				80,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				138,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				50,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				122,
																				122,
																				122)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				95,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				163,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								101,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								100,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								102,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				105,
																				105,
																				105)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																57,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				46,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				48,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				48,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}
	boolean w = true;
	
	//构造方法
	
	
	@SuppressWarnings("static-access")
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
		// TODO add your handling code here:
		machine machine1 = new machine();
        machine1.toWork();
    
		//if (t1 == null) {
        if(machine1.flag == false){
        	suspended =false;
			Thread t1 = new Thread(this);
			t1.start();
			
        }
		//} 
		else {

		//	t1.notify();
		//}
		suspended = true;
		}
		}

	

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
             
             machine machine1 = new machine();
             machine1.stopWork();
             suspended = true;
		
		//myJOptionPane();
		//if(img.equals(img1)){
		//if(jLabel1==jLabel2){
	    	// if(jLabel1.equals(jLabel2)){
	        //JOptionPane.showMessageDialog(null, "你赢了");
	  // }else {
		//	JOptionPane.showMessageDialog(null, "你输了");
		//}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		suspended = true;
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { //赔率
		new tigger_rule().setVisible(true);
		this.setVisible(false);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { //积分
		//jifen Machine1 = new jifen();
		//Machine1.jifen();
	}

	@SuppressWarnings("serial")
	public class ImagePanel extends JPanel {
		private Image img;

		public ImagePanel(String img) {
			this(new ImageIcon(img).getImage());
		}

		public ImagePanel(Image img) {
			this.img = img;
			// 定义图像尺寸
			Dimension size = new Dimension(img.getWidth(null), img
					.getHeight(null));
			setPreferredSize(size);
			setMinimumSize(size);
			setMaximumSize(size);
			setSize(size);
			// 定义布局方式为空
			setLayout(null);
			setDoubleBuffered(true);
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		//java.awt.EventQueue.invokeLater(new Runnable() {}
//		//public void run() {
//		
//		new tigger().setVisible(true);
//		boolean suspended = false;
//		Thread t1 ;
//		
//	}

	public String getlength(){
		return null;
	
	}
	static String img[] = { "src/img/1.png", "src/img/2.png", "src/img/3.png",
			"src/img/1100.png", "src/img/1122.png" };
	static String img1[] = { "src/img/1.png", "src/img/1122.png", "src/img/3.png",
			"src/img/1100.png", "src/img/2.png" };
	String img2[] = { "src/img/1.png", "src/img/2.png", "src/img/1100.png",
			"src/img/3.png", "src/img/1122.png" };
	
	String img3 =  "src/img/1.png"+ "src/img/2.png"+ "src/img/3.png"+
			"src/img/1100.png"+ "src/img/1122.png" ;
	String img4 =  "src/img/1.png"+"src/img/1122.png"+"src/img/3.png"+
			"src/img/1100.png"+ "src/img/2.png" ;
	String img5 =  "src/img/1.png"+"src/img/2.png"+ "src/img/1100.png"+
			"src/img/3.png"+ "src/img/1122.png" ;

	public void run() {
		// TODO Auto-generated method stub
		int i = 0;

		JLabel buttons[] =   { jLabel1 };
		JLabel buttons11[] = { jLabel2 };
		JLabel buttons22[] = { jLabel3 };
        

		
		while (true) {
			//synchronized (t1) {
			//System.out.println(buttons[i%3].getText());
			buttons[i % 1].setIcon(new ImageIcon(img[i % 5])); //设置图片的滚动
			buttons11[i % 1].setIcon(new ImageIcon(img1[i % 4]));   //[i % 4]
			buttons22[i % 1].setIcon(new ImageIcon(img2[i % 5]));
			i++;
			//synchronized (t1) {
			try {
				Thread.sleep(66);
				if (suspended) {
					t1.wait();
					//myJOptionPane();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}

	//}
	 // public static void myJOptionPane() {
	    // if(jLabel1 == jLabel2){
	    	// if(img.equals(img1)){
	    	// if(jLabel1.equals(jLabel2)){
	     //   JOptionPane.showMessageDialog(null, "你赢了");
	  // }else {
		//	JOptionPane.showMessageDialog(null, "你输了");
		//}
	 // }
	 	
	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	javax.swing.JButton jButton6;
	private static javax.swing.JLabel jLabel1;
	private static javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}
