package shuiguoji;
import java.io.*;

import javax.swing.JOptionPane;

public class Machine1 {
	Thread t1 = null;
	int coin=100,bet;
	//public int coin,bet,bonus,pei;
		public static void main(String[] args){
			
			
		    machine ma=new machine();
		    ma.toWork();
		      }
		 
		
		   }
		    class machine {
		    	
		    	//public void Player(){
		    	//	this.coin = 1000; //��ʼ�����1000��ע
		    	//}
		    	
		    	//public void addMoney(double point){    //��Ǯ
		    	//	this.coin += bet;
		    	//}public void minusMoney(double point){   //��ǰ
		    	//	this.coin -= bet;
		    //	}
		    	//private int getbet() {
				//	return bet;
			//	}
			public int coin=5000,bet,bonus,pei; //coin��ʾ���룬bet��ʾ��ע��bonus��ʾ����
			boolean flag = true;
			private int getcoin() {
				return coin;
			}
			private int getbet(){
				return bet;
			}
			
			
			//���췽��
			

		//��ʼѺע
	    public boolean toWork() {
	    	int a = 0;
	    	while(flag == true){
			//if(coin<=0){
				//   try{
					//   JOptionPane.showMessageDialog(null,"��ĳ���Ϊ0�����ܼ�����Ϸ��");
					 
					//   flag = true;
					//	return flag;
						
				  // System.out.println("��ĳ���Ϊ0�����ܼ�����Ϸ��");
					//flag=false;
				//return flag;
						
					//}catch(Exception e) {}
				//}
			  
				String temp = JOptionPane.showInputDialog("��ǰ����Ϊ��"+
						+getcoin()+"��������ĳ���"+JOptionPane.PLAIN_MESSAGE);
				//System.out.println(temp);
				try{
	                 a = Integer.parseInt(temp);
					    }catch(Exception e){
						e.printStackTrace();
					    }
					    bet = a;
			if(temp==null||temp.equals("")){
				JOptionPane.showMessageDialog(null,"������������������");
				flag = true;
				return flag;
			}//else{
				//try{
					//System.out.println(a);
				//	}
				 //   bet = a;
			
				  //  flag=false;
					
				    //System.out.println(bet);
				  //  }   
		       
				//��Ѻע�����ж�
			else if(bet > coin){
					
					JOptionPane.showMessageDialog(null,"��Ļ��ֲ��㣬��������ע");
					flag = true;
					return flag;
					}
				
				
					//flag=false;
					//return flag;
					//System.out.println(bet);
				//}

			//}catch(Exception e) {}
			//return flag;	 
			
			 // int a1=3,b=4;
			//	if(a1>b){
				//	pei = 3;
				//	bonus = bet*pei;
				//	JOptionPane.showMessageDialog(null,"��ϲ���н��ˣ�����Ϊ��"+bonus);
				//coin = coin-bet+bonus;
				//  JOptionPane.showMessageDialog(null,"��ǰ����ʣ��"+coin);
				 // flag = true;
				  //return flag;
				//}
			//	else{
				//	JOptionPane.showMessageDialog(null,"���ź���û�н����۳���Ӧ����"+bet);
			//		coin =  coin-bet;
			//		  JOptionPane.showMessageDialog(null,"��ǰ����ʣ��"+coin);
			//		 // flag = true;
					 // return flag;
			//	}
	    	//}
			else if(coin<=0){
				
					  JOptionPane.showMessageDialog(null,"��ĳ���Ϊ0�����ܼ�����Ϸ��");
					   flag = true;
						return flag;		
				   //System.out.println("��ĳ���Ϊ0�����ܼ�����Ϸ��");	
						
				}
				else{
					flag = false;
					//System.out.println(bet);	
				}  }
			return flag;
			}
	   
	    public int Work(){
	    	
			boolean j = this.toWork();
	    	String temp = null;
			int a = 0;
			if( j == false){
				
			}
			else{
				try{
			
				//return;
				
				
					a = Integer.parseInt(temp);
				    }catch(Exception e){
					e.printStackTrace();
					System.out.println(a);
					}
				    bet = a;
		    }//System.out.println(+bet);	
			return bet;
			}
		




		public int stopWork() {
			  int a1=3,b=4;
			  int j;
	          // int bet = this.Work();
	          // j.getbet();
	         //System.out.println(bet);
	           
	   if(a1>b){
				pei = 3;
				bonus = bet*pei;
				JOptionPane.showMessageDialog(null,"��ϲ���н��ˣ�����Ϊ��"+bonus);
			  coin = coin-bet+bonus;
			  JOptionPane.showMessageDialog(null,"��ǰ����ʣ��"+coin);
			  flag = false;
		 return coin;
			  }
		else{
				JOptionPane.showMessageDialog(null,"���ź���û�н����۳���Ӧ����100");
				coin =  coin-bet;
				  JOptionPane.showMessageDialog(null,"��ǰ����ʣ��4900");
				  flag = false;
				  return coin;
			}
			
		  
		    //if(){
						//System.out.println("���ź���û�н����۳���Ӧ����"+bet);
						//coin = coin-bet;
						//System.out.println("��ǰ����Ϊ��"+coin);
					//}
					//if(coin<=0){
					  //  System.out.println("��ĳ���Ϊ�㣬���ܼ�����Ϸ")��
					    //return flag;
					//}
					
				    //}catch(Exception e){}
				    //}return flag;
				//  }
			// return flag;
			// }
		  
		  }}
			  
			  
			


