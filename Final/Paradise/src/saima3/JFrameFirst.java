package saima3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataBase.DataConnect;

import model.User;
public class JFrameFirst extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User u;
	JButton JB[]=new JButton[10];    //  按钮数组
	JTextField tx2;
	String userName;                //对用户名进行传递
	int num=1;                     //对用户所选的马进行标记
	JFrame frm;
	ImageClass jpm;                //插入背景图片
	JPanel text;                   //此框体下的主面板
	JPanel jpb;                     //显示马匹图片的按钮
	Connection con=null;                  
	java.sql.Statement st=null;
	ResultSet rs=null;
	double money=0;                        //用户当前金钱
	

	
    public JFrameFirst(String userName) { 
    	//JFrameFirst类构造函数重载
		//mc=new music("bgm/hrpre.wav");
		this.userName=userName;
//    	System.out.println(u.getUid());
//		money=u.getUpoint();

			
			try {
				String sql="SELECT upoint FROM user where uname='"+userName+"'";
				rs =DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					money=rs.getInt("upoint");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		try {
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paradise","root","123123");
//			st=con.createStatement();
//			rs=st.executeQuery("SELECT upoint FROM user where uname='"+userName+"'");
//			if(rs.next()){
//				money=rs.getInt("upoint");
//			}
//		} catch (SQLException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
	}
	public void create(){
		frm=new JFrame();                                      //进行选马阶段的框体构建
		frm.setTitle("中南乐园赛马场");                              
		frm.setDefaultCloseOperation(1);      
        frm.setBounds(455,280,815,515);
        frm.setVisible(true);
        frm.setLayout(null);
       // mc.loop();
        
        jpm=new ImageClass("bin/saima3/choice1.jpg",800,480);
        jpm.setBounds(0, 0, 800, 480);
        jpm.setLayout(null);
        
        text=new JPanel();
        text.setBounds(0, 0, 800, 480);
        text.setLayout(null);
        
        JLabel jb=new JLabel();//积分框设置
        jb.setText(String.valueOf(money));
        jb.setBounds(696, 35, 140, 30);
        jb.setBackground(Color.WHITE);
        jb.setFont(new Font("",Font.BOLD,25));
        
        JB[0]=new JButton(new ImageIcon("bin/saima3/02.jpg"));
        JB[1]=new JButton(new ImageIcon("bin/saima3/03.jpg"));
        JB[2]=new JButton(new ImageIcon("bin/saima3/04.jpg"));
        JB[3]=new JButton(new ImageIcon("bin/saima3/05.jpg"));
        JB[4]=new JButton(new ImageIcon("bin/saima3/begin.jpg"));
        JB[5]=new JButton(new ImageIcon("bin/saima3/00002.gif"));
        JB[6]=new JButton(new ImageIcon("bin/saima3/00003.gif"));
        JB[7]=new JButton(new ImageIcon("bin/saima3/00004.gif"));
        JB[8]=new JButton(new ImageIcon("bin/saima3/00005.gif"));
        JB[9]=new JButton(new ImageIcon("src/img/hrback.jpg"));
 
        JB[0].setBounds(128, 254, 120, 54);
        JB[1].setBounds(275, 254, 120, 54);
        JB[2].setBounds(423, 254, 120, 54);
        JB[3].setBounds(571, 254, 120, 54);
        JB[4].setBounds(300, 397, 217, 52);
        JB[5].setBounds(317, 61, 185, 162);
        JB[6].setBounds(1000, 1000, 185, 162);
        JB[7].setBounds(1000, 1000, 185, 162);
        JB[8].setBounds(1000, 1000, 185, 162);
        JB[9].setBounds(570, 400, 120, 54);

        jpm.add(JB[0]);
        jpm.add(JB[1]);
        jpm.add(JB[2]);
        jpm.add(JB[3]);
        jpm.add(JB[4]);
        jpm.add(JB[5]);
        jpm.add(JB[6]);
        jpm.add(JB[7]);
        jpm.add(JB[8]);
        jpm.add(JB[9]);
  
        jpm.add(jb);
        frm.getContentPane().add(jpm);
        
//        int windowWidth = this.getWidth(); 
//        int windowHeight = this.getHeight();   
//        Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
//        Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
//        int screenWidth = screenSize.width;  
//        int screenHeight = screenSize.height; 
//        this.setLocation(screenWidth / 5- windowWidth / 2, 
//      		 screenHeight / 5 - windowHeight / 2);// 设置窗口居中显示
        
        tx2=new JTextField();//投注框
        tx2.setBounds(432,346, 90, 34);
        jpm.add(tx2);
        frm.validate();
                                                                                                                
        
        for(int i=0;i<5;i++){
        	JB[i].addActionListener(new JT(this));
        }
        JB[9].addActionListener(new JT(this));
       // JB[9].addActionListener(new JTD(this));
	}
}
