package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import model.Commodity;

import BlackJack.State;
import DataBase.DataConnect;

public class User {
	private Vector<Card> cards= new Vector<Card>();
	private State state;

	public  User u;
	public String uname;
	public  String uid;
	public String upw;
	public  int upoint;
	
	
	public int getUpoint() {
		return upoint;
	}
	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}

	public String i1;
	public int inumber1;
	public String i2;
	public int  inumber2;
	public String i3;
	public int  inumber3;
	public String i4;
	public int  inumber4;
	public String i5;
	public int  inumber5;
	public String i6;
	public int  inumber6;
	
	public int win;
	public int lose;
	public int draw;
	
	
	

	
	
	public String getI1() {
		return i1;
	}
	public void setI1(String i1) {
		this.i1 = i1;
	}
	public int getInumber1() {
		return inumber1;
	}
	public void setInumber1(int inumber1) {
		this.inumber1 = inumber1;
	}
	public String getI2() {
		return i2;
	}
	public void setI2(String i2) {
		this.i2 = i2;
	}
	public int getInumber2() {
		return inumber2;
	}
	public void setInumber2(int inumber2) {
		this.inumber2 = inumber2;
	}
	public String getI3() {
		return i3;
	}
	public void setI3(String i3) {
		this.i3 = i3;
	}
	public int getInumber3() {
		return inumber3;
	}
	public void setInumber3(int inumber3) {
		this.inumber3 = inumber3;
	}
	public String getI4() {
		return i4;
	}
	public void setI4(String i4) {
		this.i4 = i4;
	}
	public int getInumber4() {
		return inumber4;
	}
	public void setInumber4(int inumber4) {
		this.inumber4 = inumber4;
	}
	public String getI5() {
		return i5;
	}
	public void setI5(String i5) {
		this.i5 = i5;
	}
	public int getInumber5() {
		return inumber5;
	}
	public void setInumber5(int inumber5) {
		this.inumber5 = inumber5;
	}
	public String getI6() {
		return i6;
	}
	public void setI6(String i6) {
		this.i6 = i6;
	}
	public int getInumber6() {
		return inumber6;
	}
	public void setInumber6(int inumber6) {
		this.inumber6 = inumber6;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	
	public User(String uid, String upw, String uname) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
	}
	public User(String uid, String upw, String uname,int upoint,String i1,String i2,String i3,String i4,String i5,String i6,int inumber1,int inumber2,int inumber3,int inumber4,int inumber5,int inumber6,int win,int lose,int draw) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.upoint = upoint;
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
		this.i4 = i4;
		this.i5 = i5;
		this.i6 = i6;
		this.inumber1 = inumber1;
		this.inumber2 = inumber2;
		this.inumber3 = inumber3;
		this.inumber4 = inumber4;
		this.inumber5 = inumber5;
		this.inumber6 = inumber6;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
	public User(){
		super();
	}
	
	
	
	
	
	public static User login(String uid,String upw) throws SQLException, ClassNotFoundException{
		User u =null;
		String sql = "select * from user where uid='"+uid+"' and upw ='"+upw+"'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if(rs.next()){
			u = new User(uid,upw,rs.getString("uname"),rs.getInt(3),rs.getString(5),rs.getString(7),rs.getString(9),rs.getString(11),rs.getString(13),rs.getString(15),rs.getInt(6),rs.getInt(8),rs.getInt(10),rs.getInt(12),rs.getInt(14),rs.getInt(16),rs.getInt(17),rs.getInt(18),rs.getInt(19));
		}
		return u;
		
	}
	
	public void Register(User u) throws SQLException, ClassNotFoundException {
		String  none = "none"; 
		String sql ="insert into user(uname,uid,upw,upoint,win,lose,draw,inumber1,inumber2,inumber3,inumber4,inumber5,inumber6,i1,i2,i3,i4,i5,i6) values ('"+
		u.getUid()+"','"+u.getUname()+"','"+u.getUpw()+"',"+1000+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+",'"+none+"','"+none+"','"+none+"','"+none+"','"+none+"','"+none+"')";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	
	
	public void buyc1(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	public void buyc2(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	public void buyc3(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	public void buyc4(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	public void buyc5(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	public void buyc6(int number,User u,Commodity c) throws SQLException, ClassNotFoundException{
		this.u=u;
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
	
	public void bet(int point,User u) throws SQLException, ClassNotFoundException{
		this.u=u;
		this.upoint-=point;
		String sql="update user set upoint="+u.getUpoint()+" where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	public void gamewin(int point,User u) throws SQLException, ClassNotFoundException{
		this.u=u;
		this.upoint += point;
		String sql="update user set win=win+1,upoint="+u.getUpoint()+" where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void gamelose(User u) throws SQLException, ClassNotFoundException{
		this.u=u;
		
		String sql="update user set lose=lose+1,upoint="+u.getUpoint()+" where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	public void gamedraw(User u) throws SQLException, ClassNotFoundException{
		this.u=u;
		String sql="update user set draw=draw+1 where uid = "+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	/*赛马相关方法*/
//	public int returnPoint(User u){
//		this.u=u;
//		String sql="SELECT upoint FROM user where uid='"+u.getUid()+"'";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		if(rs.next())
//			return 
//	}
	public void pointChange(int point,User u) throws SQLException, ClassNotFoundException{
		this.u=u;
		this.upoint=point;
		String sql="update user set upoint="+point+" where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void countwin(User u) throws SQLException, ClassNotFoundException{
		String sql="update user set win=win+1 where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void countlose(User u) throws SQLException, ClassNotFoundException{
		String sql="update user set lose=lose+1 where uid="+u.getUid()+"";
		DataConnect.getStat().executeUpdate(sql);
	}
	/* 设置牌面 */
	public void addCard(Card card){
		cards.add(card);
	}
	
	/*设置胜负状态*/
	public void setState(State state){
		this.state = state;
		}
	
	/* 重新开局 */
	public void ReStart(){
		cards.clear();
	}
	
	/* 获取牌面 */
	public Vector<Card> getCards(){
		return cards;
	}
	
	/* 计算牌面 */
	public int calculator(){
		int sum = 0 ; 
		for (int i=0; i < cards.size(); i++ ){
			Card temp = (Card) cards.elementAt(i);
			if(temp.getValue()<=10)
				sum += temp.getValue();
			else if (temp.getValue()>10)
				sum += 10;
		}
		if( hasBJ() && sum<12 ){ //拥有黑桃A  
			sum = sum + 10 ;  //将黑桃A算作11
		}
		return sum;
	}
	/*获取牌数*/
	public int getNum(){
		return cards.size();
	}
	
	
	/*获取胜负状态*/
	public State getState(){
		return state;
	}
	/*展示牌面   (仅为测试)*/
	public void showCard()
	{
		for(int i=0; i<cards.size();i++){
			((Card) cards.elementAt(i)).showCard();
		}
	}
	/*是否拥有黑杰克*/
	public Boolean hasBJ()
	{
		boolean flagA = false;
		boolean flagJ = false;
		//有A
		for(int i=0; i<cards.size();i++)
		{
			Card temp = (Card) cards.get(i);
			if( temp.getValue() == 1)  
				flagA = true ;
		}
		 //有J或Q或K
		for(int i=0; i<cards.size();i++)
		{
			Card temp = (Card) cards.get(i);
			if( temp.getValue()==11 ||temp.getValue()==12 ||temp.getValue()==13 ) 
				flagJ = true ;
		}
		return (flagA && flagJ);
	}

}
