package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.DataConnect;
import model.Commodity;
import model.User;

public class Server implements Protocal,Runnable {
	private static ServerSocket ss;
	private static Socket s;
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;
	
	private String i1;
//	private int inumber1;
	private String i2;
//	private int inumber2;
	private String i3;
//	private int inumber3;
	private String i4;
//	private int inumber4;
	private String i5;
//	private int inumber5;
	private String i6;
//	private int inumber6;
	
	public Server() throws IOException, ClassNotFoundException, SQLException {
		ss = new ServerSocket(8889);
		System.out.println("server connect!");
		while(true){
			s = ss.accept();
			Thread t=new Thread(this);
			t.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command = ois.readInt();
			if (command == LOGIN) {
				System.out.println(LOGIN);
				Login();
			}
			if (command == BUY1) {
				System.out.println(BUY1);
				Buy1();
			}
			if (command == BUY2) {
				System.out.println(BUY2);
				Buy2();
			}
			if (command == BUY3) {
				System.out.println(BUY3);
				Buy3();
			}
			if (command == BUY4) {
				System.out.println(BUY4);
				Buy4();
			}
			if (command == BUY5) {
				System.out.println(BUY5);
				Buy5();
			}
			if (command == BUY6) {
				System.out.println(BUY6);
				Buy6();
			}
			if (command == GAMEWIN) {
				System.out.println(GAMEWIN);
				Gamewin();
			}
			if (command == GAMELOSE) {
				System.out.println(GAMELOSE);
				Gamelose();
			}
			if (command == GAMEDRAW) {
				System.out.println(GAMEDRAW);
				Gamedraw();
			}
			if (command == POINTCHANGE) {
				System.out.println(POINTCHANGE);
				Pointchange();
			}
			if (command == BET) {
				System.out.println(BET);
				Bet();
			}
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void Login() throws IOException, SQLException, ClassNotFoundException{
		String id = ois.readUTF();
		String pw = ois.readUTF();
		User a = null;
		String sql = "select * from user where uid='"+id+"' and upw ='"+pw+"'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if(rs.next()){
			a=new User(id,pw,rs.getString("uname"),rs.getInt(3),rs.getString(5),rs.getString(7),rs.getString(9),rs.getString(11),rs.getString(13),rs.getString(15),rs.getInt(6),rs.getInt(8),rs.getInt(10),rs.getInt(12),rs.getInt(14),rs.getInt(16),rs.getInt(17),rs.getInt(18),rs.getInt(19));
		}
		System.out.println(a);
		oos.writeObject(a);
		oos.flush();
	}
	
	public void Register() throws SQLException, ClassNotFoundException, IOException {
		User u = (User) ois.readObject();
		String none="none";
		String sql ="insert into user(uname,uid,upw,upoint,win,lose,draw,inumber1,inumber2,inumber3,inumber4,inumber5,inumber6,i1,i2,i3,i4,i5,i6) values ('"+
		u.getUid()+"','"+u.getUname()+"','"+u.getUpw()+"',"+1000+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+",'"+none+"','"+none+"','"+none+"','"+none+"','"+none+"','"+none+"')";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void Buy1() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		//this.u=u;
		int money =number*400;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getUname());
		System.out.println(u.getI1());
		System.out.println(u.getI2());
		System.out.println(u.getI3());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;
	}
		
}
	public void Buy2() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		int money =number*600;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getI1());
		System.out.println(u.getI2());
		System.out.println(u.getI3());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;


		}
		
	}
	
	public void Buy3() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		int money =number*800;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getUname());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;


		}
		
	}
	
	public void Buy4() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		int money =number*1000;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getUname());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;

		}
	}
	public void Buy5() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		int money =number*1200;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getUname());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;


		}
	}
	
	public void Buy6() throws SQLException, ClassNotFoundException, IOException{
		int number=ois.readInt();
		User u = (User) ois.readObject();
		Commodity c=(Commodity) ois.readObject();
		int money =number*1900;
		int i =0;
		System.out.println(2);
		System.out.println(u);
		System.out.println(u.getUname());
		if(u.getI1().equals("none")||u.getI1().equals(c.getCname())){
			System.out.println(3);
			i = 1;
		}else if(u.getI2().equals("none")||u.getI2().equals(c.getCname())){
			i = 2;
		}else if(u.getI3().equals("none")||u.getI3().equals(c.getCname())){
			i = 3;
		}else if (u.getI4().equals("none")||u.getI4().equals(c.getCname())){
			i = 4;
		}else if(u.getI5().equals("none")||u.getI5().equals(c.getCname())){
			i = 5;
		}else{
			i = 6;
		}
		switch(i){
		case 1:
			u.i1 = c.cname;
			String sql ="update user set i1='"+i1+"',inumber1=inumber1+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql);
			break;
		case 2:
			u.i2 = c.cname;
			String sql2 ="update user set i2='"+i2+"',inumber2=inumber2+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql2);
			break;
		case 3:
			u.i3 = c.cname;
			String sql3 ="update user set i3='"+i3+"',inumber3=inumber3+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql3);
			break;
		case 4:
			u.i4 = c.cname;
			String sql4 ="update user set i4='"+i4+"',inumber4=inumber4+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql4);
			break;
		case 5:
			u.i5 = c.cname;
			String sql5 ="update user set i5='"+i5+"',inumber5=inumber5+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql5);
			break;
		default:
			u.i6 = c.cname;
			String sql6 ="update user set i6='"+i6+"',inumber6=inumber6+"+number+",upoint=upoint-"+money+" where uid="+u.getUid()+"";
			DataConnect.getStat().executeUpdate(sql6);
			break;

		}
	}
	
	public void Gamewin()throws SQLException, ClassNotFoundException, IOException{
		int point=ois.readInt();
		User u = (User) ois.readObject();
		u.upoint += point;
		String sql="update user set win=win+1,upoint="+u.getUpoint()+" where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void Gamelose()throws SQLException, ClassNotFoundException, IOException{
		User u = (User) ois.readObject();
		String sql="update user set lose=lose+1,upoint="+u.getUpoint()+" where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void Gamedraw()throws SQLException, ClassNotFoundException, IOException{
		User u = (User) ois.readObject();
		String sql="update user set draw=draw+1 where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void Pointchange()throws SQLException, ClassNotFoundException, IOException{
		int point=ois.readInt();
		User u = (User) ois.readObject();
		String sql="update user set upoint="+point+" where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void Bet()throws SQLException, ClassNotFoundException, IOException{
		int point=ois.readInt();
		User u = (User) ois.readObject();
		String sql="update user set upoint="+u.getUpoint()+" where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
}
