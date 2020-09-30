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
		    	//	this.coin = 1000; //初始玩家有1000赌注
		    	//}
		    	
		    	//public void addMoney(double point){    //加钱
		    	//	this.coin += bet;
		    	//}public void minusMoney(double point){   //减前
		    	//	this.coin -= bet;
		    //	}
		    	//private int getbet() {
				//	return bet;
			//	}
			public int coin=5000,bet,bonus,pei; //coin表示筹码，bet表示赌注，bonus表示奖金；
			boolean flag = true;
			private int getcoin() {
				return coin;
			}
			private int getbet(){
				return bet;
			}
			
			
			//构造方法
			

		//开始押注
	    public boolean toWork() {
	    	int a = 0;
	    	while(flag == true){
			//if(coin<=0){
				//   try{
					//   JOptionPane.showMessageDialog(null,"你的筹码为0，不能继续游戏！");
					 
					//   flag = true;
					//	return flag;
						
				  // System.out.println("你的筹码为0，不能继续游戏！");
					//flag=false;
				//return flag;
						
					//}catch(Exception e) {}
				//}
			  
				String temp = JOptionPane.showInputDialog("当前筹码为："+
						+getcoin()+"请输入你的筹码"+JOptionPane.PLAIN_MESSAGE);
				//System.out.println(temp);
				try{
	                 a = Integer.parseInt(temp);
					    }catch(Exception e){
						e.printStackTrace();
					    }
					    bet = a;
			if(temp==null||temp.equals("")){
				JOptionPane.showMessageDialog(null,"输入有误，请重新输入");
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
		       
				//对押注进行判断
			else if(bet > coin){
					
					JOptionPane.showMessageDialog(null,"你的积分不足，请重新下注");
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
				//	JOptionPane.showMessageDialog(null,"恭喜，中奖了，奖金为："+bonus);
				//coin = coin-bet+bonus;
				//  JOptionPane.showMessageDialog(null,"当前积分剩余"+coin);
				 // flag = true;
				  //return flag;
				//}
			//	else{
				//	JOptionPane.showMessageDialog(null,"很遗憾，没中奖，扣除相应积分"+bet);
			//		coin =  coin-bet;
			//		  JOptionPane.showMessageDialog(null,"当前积分剩余"+coin);
			//		 // flag = true;
					 // return flag;
			//	}
	    	//}
			else if(coin<=0){
				
					  JOptionPane.showMessageDialog(null,"你的筹码为0，不能继续游戏！");
					   flag = true;
						return flag;		
				   //System.out.println("你的筹码为0，不能继续游戏！");	
						
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
				JOptionPane.showMessageDialog(null,"恭喜，中奖了，奖金为："+bonus);
			  coin = coin-bet+bonus;
			  JOptionPane.showMessageDialog(null,"当前积分剩余"+coin);
			  flag = false;
		 return coin;
			  }
		else{
				JOptionPane.showMessageDialog(null,"很遗憾，没中奖，扣除相应积分100");
				coin =  coin-bet;
				  JOptionPane.showMessageDialog(null,"当前积分剩余4900");
				  flag = false;
				  return coin;
			}
			
		  
		    //if(){
						//System.out.println("很遗憾，没中奖，扣除相应积分"+bet);
						//coin = coin-bet;
						//System.out.println("当前筹码为："+coin);
					//}
					//if(coin<=0){
					  //  System.out.println("你的筹码为零，不能继续游戏")；
					    //return flag;
					//}
					
				    //}catch(Exception e){}
				    //}return flag;
				//  }
			// return flag;
			// }
		  
		  }}
			  
			  
			


