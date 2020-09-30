/*
 * shop.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Commodity;
import model.User;

import View.menu1.ImagePanel;

/**
 *
 * @author  __USER__
 */
public class shop extends javax.swing.JFrame {
	public User u;

	/** Creates new form shop */
	public shop(User u) {
		this.u = u;
		initComponents();
	}

	//	jPanel1 =new ImagePanel(new ImageIcon("src/img/shopp.jpg").getImage());
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 =new ImagePanel(new ImageIcon("src/img/shopp.jpg").getImage());
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		
		
		
		int windowWidth = this.getWidth(); 
        int windowHeight = this.getHeight();   
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width;  
		int screenHeight = screenSize.height; 
        this.setLocation(screenWidth / 4 - windowWidth / 2, screenHeight / 
              4 - windowHeight / 2);// 设置窗口居中显示
		
		

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setToolTipText("");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/背包.jpg"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/4.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/6.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/8.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/10.png"))); // NOI18N
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/12.png"))); // NOI18N
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/19.png"))); // NOI18N
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/xx.jpg"))); // NOI18N
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(568, Short.MAX_VALUE)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(52, 52, 52))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(171, 171, 171)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				14,
																				14,
																				14)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(353, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(403, Short.MAX_VALUE)
										.addComponent(
												jButton9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(317, 317, 317)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(101, 101, 101)
										.addComponent(
												jButton9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												85, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																20,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								20,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								20,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								20,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				64,
																				64,
																				64)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								20,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								20,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				84,
																				84,
																				84)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				41,
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
		new bag(u).setVisible(true);
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new menu1(u).setVisible(true);
		this.setVisible(false);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "6";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc6(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "5";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc5(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "4";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc4(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "3";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc3(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "2";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc2(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.u = u;

		String cid = "1";
		String temp = JOptionPane.showInputDialog("请输入购买数量：");
		int number = Integer.parseInt(temp);
		//		int i =u.getUpoint();
		try {
			Commodity c = Commodity.beenselect(cid);
			if (c == null) {
				System.out.println("空");
			} else {
				System.out.println(c.getInven());
				System.out.println(c.getCp());
				System.out.println(c.getCid());
				System.out.println(c.getCname());
				System.out.println(u.getUid());
				System.out.println(u.getUpoint());
			}
			//			int x =c.getCp();
			//			int z =c.getInven();

			if (u.upoint >= c.cp && c.inven != 0) {
				System.out.println(1);
				System.out.println(u);
				u.buyc1(number, u, c);
				System.out.println(4);
				c.beenbought(number, c);
				System.out.println(5);
			} else {
				System.out.print("no");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new shop().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}