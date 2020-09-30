package model;

public class Card {
	/**
	 * 目标:获取和设置牌得类型和面值
	 * @param type : 花色: 1,2,3,4-->黑桃，红桃，梅花，方片
	 * @param value  ： 面值
	 * @author QianXu
	 */
	private int value=0; //代表纸牌的面值
	private int type; //代表纸牌的花色
	public Card(int type,int value){
		//构造方法,给面值和花色赋值
		this.value=value;
		this.type=type;
	}
	//定义方法获取类型
	public int getType(){
		return type;
	}
	//定义方法获取面值
	public int getValue(){
		return value;
	}
	//定义方法设置纸牌的类型
	public void setType(int type){
		this.type=type;
	}
	//定义方法设置纸牌的面值
	public void setValue(int value){
		this.value=value;
	}
	public void showCard()
	{
		System.out.println("牌： " + this.getType() + " "+ this.getValue());
	}
		}
	
	

