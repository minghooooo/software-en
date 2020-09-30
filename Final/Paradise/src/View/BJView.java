/*
 * BJView.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import View.login.ImagePanel;

import model.Card;
import model.User;

import BlackJack.CardManager;
import BlackJack.Regulation;
import BlackJack.State;

/**
 *
 * @author  __USER__
 */
public class BJView extends javax.swing.JFrame {
	private User u;
	User Comp = new User();//庄家 电脑

	JLabel game[] = new JLabel[52]; //放置52张牌的标签框
	CardManager cm = new CardManager(); //定义指派管理类的对象
	int i = 0; //记录抓牌数
	int computer_dot = 0; //记录电脑点数
	int game_dot = 0; //记录玩家点数

	int point = 0; //下注金额

	/** Creates new form BJView */
	public BJView(User u) {
		this.u = u;
		//		jPanel1 =new ImagePanel(new ImageIcon("src/img/background.jpg").getImage());
		System.out.println(u.getUname());
		System.out.println(u.getUpoint());
		System.out.println(u.getUid());

		initComponents();
			}

	public String GetResult() {
		//new Regulation(Comp,Gamer);//创建re对象 找出获胜者
		new Regulation(Comp, u);

		//结果设置：
		//int gp = Gamer.calculator();//玩家点数
		int gp = u.calculator();
		int cp = Comp.calculator();//庄家点数
		String result = "庄家点数：" + cp + "\n玩家点数: " + gp + "\n"; //结果

		//		if(Gamer.getState() == State.WIN){
		//			if(Gamer.hasBJ()) //拥有黑杰克 双倍赌注
		//				point = point*2; 
		//			result = result + "恭喜你！你赢啦！赢得了： "+ point + " 赌注。";
		//			Gamer.gamewin(point);
		//		}
		//		else if (Gamer.getState() == State.DRAW)
		//			result = result + "平局哦！您的余额没有变化";
		//		
		//		else if(Gamer.getState() == State.LOST){
		//			result = result + "对不起！你输啦！输了： "+ point + " 赌注。";
		//			Gamer.gamelose(point);
		//		}
		//		
		if (u.getState() == State.WIN) {
			if (u.hasBJ()) //拥有黑杰克 双倍赌注
				point = point * 2;
			result = result + "恭喜你！你赢啦！赢得了： " + point + " 赌注。";
			try {
				u.gamewin(point, u);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (u.getState() == State.DRAW) {
			result = result + "平局哦！您的余额没有变化";
			try {
				u.gamedraw(u);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (u.getState() == State.LOST) {
			result = result + "对不起！你输啦！输了： " + point + " 赌注。";
			try {
				u.gamelose(u);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		
		this.setBounds(350, 180, 1000, 750);
		jPanel1 =new ImagePanel(new ImageIcon("src/img/background.jpg").getImage());
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
//		int windowWidth = this.getWidth(); 
//        int windowHeight = this.getHeight();   
//		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
//		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
//		int screenWidth = screenSize.width;  
//		int screenHeight = screenSize.height; 
//        this.setLocation(screenWidth / 4 - windowWidth / 2, screenHeight / 
//              4 - windowHeight / 2);// 设置窗口居中显示


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setFont(new java.awt.Font("宋体", 1, 18));
		jButton1.setText("\u6d17\u724c");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("宋体", 1, 18));
		jButton2.setText("\u5f00\u59cb\u6e38\u620f");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("宋体", 1, 18));
		jButton3.setText("\u73a9\u5bb6\u4e0b\u6ce8");
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

		jLabel1.setFont(new java.awt.Font("宋体", 1, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u5e84\u5bb6\u663e\u793a\u533a");

		jLabel2.setFont(new java.awt.Font("宋体", 1, 18));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u73a9\u5bb6\u533a");

		jButton4.setFont(new java.awt.Font("宋体", 1, 18));
		jButton4.setText("\u6293\u724c");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("宋体", 1, 18));
		jButton5.setText("\u7ed3\u679c");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("宋体", 1, 18));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u4e0b\u6ce8\u91d1\u989d\uff1a");

		jButton6.setFont(new java.awt.Font("宋体", 1, 18));
		jButton6.setText("\u8fd4\u56de");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
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
																				196,
																				196,
																				196)
																		.addComponent(
																				jLabel1))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				22,
																				22,
																				22)
																		.addComponent(
																				jButton3)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												68,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton1)
																										.addGap(
																												63,
																												63,
																												63))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												32,
																												32,
																												32)
																										.addComponent(
																												jButton2)))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												237, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(
																				381,
																				381,
																				381))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton6)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jButton4)
																														.addGap(
																																66,
																																66,
																																66)
																														.addComponent(
																																jButton5))))
																		.addGap(
																				199,
																				199,
																				199)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(271, 271, 271)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel2))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton4)
														.addComponent(jButton5))
										.addGap(62, 62, 62)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												109, Short.MAX_VALUE)
										.addComponent(jButton6).addGap(54, 54,
												54)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
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

	private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
		//		this.jButton3.setEnabled(false);
		//		this.jButton2.setEnabled(true);
		//		this.jButton1.setEnabled(false);
		//		this.jButton4.setEnabled(false);
		//		this.jButton5.setEnabled(false);

	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		//		this.jButton3.setEnabled(true);
		//		this.jButton2.setEnabled(false);
		//		this.jButton1.setEnabled(true);
		//		this.jButton4.setEnabled(false);
		//		this.jButton5.setEnabled(false);

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		//显示电脑的纸牌
		for (int i = 0; i < Comp.getCards().size(); i++) {
			Card card = (Card) Comp.getCards().get(i);
			getContentPane().add(game[i]);
			game[i].setIcon(new ImageIcon("src/images/" + card.getType() + "-"
					+ card.getValue() + ".jpg"));
			game[i].setBounds(new Rectangle(50 + i * 20, 100, 105, 150));
			this.getContentPane().setComponentZOrder(game[i],
					Comp.getCards().size() - i);
		}

		JOptionPane.showMessageDialog(null, GetResult(), "本轮游戏的结果",
				JOptionPane.INFORMATION_MESSAGE);
		//更新赌金：
		//this.jLabel3.setText("账户余额： " + Gamer.getUpoint());
		this.jLabel3.setText("账户余额： " + u.getUpoint());
		//设置按钮可操作
		this.jButton1.setEnabled(true);
		this.jButton5.setEnabled(false);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		//提示玩家
		//		if (Gamer.getNum() >= 2) {
		//			int a = JOptionPane
		//					.showConfirmDialog(null, "现在点数为:" + Gamer.calculator()
		//							+ "是否再抓牌", "提示", JOptionPane.NO_OPTION);
		//			if (a == JOptionPane.NO_OPTION) {
		//				this.jButton4.setEnabled(false);
		//				this.jButton5.setEnabled(true);
		//				return;
		//			}
		//		}
		//		//设置标签,显示抓到的纸牌
		//		getContentPane().add(game[i]);
		//		game[i].setIcon(new ImageIcon("images/" + cm.cards[i].getType() + "-"
		//				+ cm.cards[i].getValue() + ".jpg"));
		//		game[i].setBounds(new Rectangle(450 + i * 20, 100, 105, 150));
		//		this.getContentPane().setComponentZOrder(game[i], 1);
		//		//给玩家发牌：
		//		Gamer.addCard(cm.cards[i]);
		//		i = i + 1; //记录已发的牌数
		//		//面值大于21或已超过5张牌时停止抓牌,关闭和开启相应的按钮
		//		if (Gamer.calculator() > 21 || Gamer.getCards().size() >= 5) {
		//			this.jButton4.setEnabled(false);
		//			this.jButton5.setEnabled(true);
		//			Gamer.showCard();
		//			return;
		if (u.getNum() >= 2) {
			int a = JOptionPane.showConfirmDialog(null, "现在点数为:"
					+ u.calculator() + "是否再抓牌", "提示", JOptionPane.NO_OPTION);
			if (a == JOptionPane.NO_OPTION) {
				this.jButton4.setEnabled(false);
				this.jButton5.setEnabled(true);
				return;
			}
		}
		//设置标签,显示抓到的纸牌
		getContentPane().add(game[i]);
		game[i].setIcon(new ImageIcon("src/images/" + cm.cards[i].getType()
				+ "-" + cm.cards[i].getValue() + ".jpg"));
		game[i].setBounds(new Rectangle(450 + i * 20, 100, 105, 150));
		this.getContentPane().setComponentZOrder(game[i], 1);
		//给玩家发牌：
		u.addCard(cm.cards[i]);
		i = i + 1; //记录已发的牌数
		//面值大于21或已超过5张牌时停止抓牌,关闭和开启相应的按钮
		if (u.calculator() > 21 || u.getCards().size() >= 5) {
			this.jButton4.setEnabled(false);
			this.jButton5.setEnabled(true);
			u.showCard();
			return;
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException {
		//		String temp = JOptionPane.showInputDialog("请输入下注金额："); //提示输入员工姓名
		//
		//		if (temp.equals(""))
		//			point = 0; //空值 赌注为0
		//		else
		//			point = Integer.parseInt(temp);
		//
		//		while (point > Gamer.getUpoint() || point < 0)
		//			point = Integer.valueOf(JOptionPane
		//					.showInputDialog("下注金额不能大于本金且，请重新输入："));
		//
		//		this.jButton3.setText("下注金额： " + point);
		//		System.out.println("下注金额：" + point);
		this.jButton2.setEnabled(true);
		this.jButton3.setEnabled(false);
		String temp = JOptionPane.showInputDialog("请输入下注金额："); //提示输入员工姓名

		if (temp.equals(""))
			point = 0; //空值 赌注为0
		else
			point = Integer.parseInt(temp);

		while (point > u.getUpoint() || point < 0)
			point = Integer.valueOf(JOptionPane
					.showInputDialog("下注金额不能大于本金且，请重新输入："));

		this.jButton3.setText("下注金额： " + point);
		u.bet(point, u);
		System.out.println("下注金额：" + point);
		this.jButton2.setEnabled(true);
		this.jButton3.setEnabled(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jButton2.setEnabled(false);
		this.jButton4.setEnabled(true);
		this.jButton5.setEnabled(true);
		//电脑抓牌//最多抓5张，大于15点就不再抓牌
		for (int k = 0; k < 5; k++) {
			//绘制牌面（仅有背面）
			getContentPane().add(game[i]);
			game[i].setIcon(new ImageIcon("src/images/puke.jpg"));
			game[i].setBounds(new Rectangle(50 + i * 20, 100, 105, 150));
			getContentPane().setComponentZOrder(game[i], 0);
			getContentPane().repaint();
			Comp.addCard(cm.cards[i]); //电脑抓牌
			i = i + 1; //记录已发牌数
			//如果面值大于15 或 已经拥有5张牌 则停止抓牌
			if (Comp.calculator() > 15 || Comp.getCards().size() >= 5) {
				Comp.showCard(); //展现电脑牌面 （仅供测试）
				return;
			}
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		//关闭和开启相应的按钮
		this.jButton2.setEnabled(false);
		this.jButton1.setEnabled(false);
		this.jButton3.setEnabled(true);
		this.jButton4.setEnabled(false);
		this.jButton5.setEnabled(false);

		getContentPane().repaint();

		//		if (Gamer.getUpoint() <= 0)
		//			JOptionPane.showMessageDialog(null, "对不起！您已身无分文了哦 ！请退出游戏重新开局吧！",
		//					"本轮游戏的结果", JOptionPane.INFORMATION_MESSAGE);
		//		//对记牌器,电脑点数和玩家点数进行初始化
		//		i = 0;
		//		point = 0; //下注清零
		//		Comp.ReStart();
		//		Gamer.ReStart(); //玩家牌清空
		//		jButton3.setText("下注金额： 0.0");
		//
		//		//把标签控件数组放入窗体的窗格中
		//		cm.gameStart(game, this.getContentPane());
		//		cm.initCards(); //初始化一副纸牌
		//		cm.randomCards(); //随机打乱
		//		cm.ShowCard(); //查看打乱的牌序 仅为测试
		if (u.getUpoint() <= 0)
			JOptionPane.showMessageDialog(null, "对不起！您已身无分文了哦 ！请退出游戏重新开局吧！",
					"本轮游戏的结果", JOptionPane.INFORMATION_MESSAGE);
		//对记牌器,电脑点数和玩家点数进行初始化
		i = 0;
		point = 0; //下注清零
		Comp.ReStart();
		u.ReStart(); //玩家牌清空
		jButton3.setText("下注金额： 0");

		//把标签控件数组放入窗体的窗格中
		cm.gameStart(game, this.getContentPane());
		cm.initCards(); //初始化一副纸牌
		cm.randomCards(); //随机打乱
		cm.ShowCard(); //查看打乱的牌序 仅为测试
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}