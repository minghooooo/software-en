package model;

public class Horse {
	private String hname;
	private int hnumber;
	private int rank;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getHnumber() {
		return hnumber;
	}
	public void setHnumber(int hnumber) {
		this.hnumber = hnumber;
	}
	
	
	public void running(){
		
	}
	
	public static Horse showrank(String hname,int hnumber){
		Horse h =new Horse();
		
		return h;
		
	}

}
