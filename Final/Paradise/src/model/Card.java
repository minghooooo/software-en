package model;

public class Card {
	/**
	 * Ŀ��:��ȡ�������Ƶ����ͺ���ֵ
	 * @param type : ��ɫ: 1,2,3,4-->���ң����ң�÷������Ƭ
	 * @param value  �� ��ֵ
	 * @author QianXu
	 */
	private int value=0; //����ֽ�Ƶ���ֵ
	private int type; //����ֽ�ƵĻ�ɫ
	public Card(int type,int value){
		//���췽��,����ֵ�ͻ�ɫ��ֵ
		this.value=value;
		this.type=type;
	}
	//���巽����ȡ����
	public int getType(){
		return type;
	}
	//���巽����ȡ��ֵ
	public int getValue(){
		return value;
	}
	//���巽������ֽ�Ƶ�����
	public void setType(int type){
		this.type=type;
	}
	//���巽������ֽ�Ƶ���ֵ
	public void setValue(int value){
		this.value=value;
	}
	public void showCard()
	{
		System.out.println("�ƣ� " + this.getType() + " "+ this.getValue());
	}
		}
	
	

