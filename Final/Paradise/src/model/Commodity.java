package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBase.DataConnect;

public class Commodity {
	public String cname;
	public Commodity c;
	public String cid;
	public int  inven;//¿â´æ
	public int cp;
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getInven() {
		return inven;
	}

	public void setInven(int inven) {
		this.inven = inven;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	public Commodity(){
		
	}
	public Commodity(String cid,String cname,int inven,int cp){
		super();
		this.cid=cid;
		this.cname=cname;
		this.inven=inven;
		this.cp=cp;
	}
	
	
	public static Commodity beenselect(String cid) throws SQLException, ClassNotFoundException{
		Commodity c=null;
		String sql ="select * from Commodity where cid='"+cid+"'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if(rs.next()){
			c = new Commodity(cid,rs.getString(1),rs.getInt(2),rs.getInt(3));
		}
		return c;
	}
	
	public void beenbought(int number,Commodity c) throws SQLException, ClassNotFoundException{
		this.c=c;
		String sql ="update commodity set inven= inven-"+number+" where cid ='"+c.getCid()+"'";
		DataConnect.getStat().executeUpdate(sql);
		
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
}