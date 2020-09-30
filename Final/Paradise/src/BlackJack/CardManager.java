package BlackJack;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Card;

public class CardManager {

	/**
	 * 目的:初始化牌,生成,和发牌
	 * @author QianXu 
	 */
    public Card[] cards=new Card[52]; //定义数组存放纸牌
    /*初始化纸牌*/
    public void initCards(){
    	for(int i=1;i<=4;i++){ //纸牌类型
    		for(int j=1;j<=13;j++){ //纸牌面值
    			cards[(i-1)*13+j-1]=new Card(i,j);
    		}
    	}
    }
    /*随机生成牌号*/
    public void randomCards(){
    	Card temp=null; //从新定义纸牌的类型

    	for(int i=0;i<52;i++){
    		int a=(int)(Math.random()*52);
    		int b=(int)(Math.random()*52);
    		temp=cards[a];
    		cards[a]=cards[b];
    		cards[b]=temp;
    	}
    }
    
    public void ShowCard()
    {
    	for(int i=0;i<52;i++)
    		System.out.println(i+" "+cards[i].getType()+" "+cards[i].getValue());
    }
    /*定义方法,发牌*/
    public void gameStart(JLabel game[],Container c){
    	//在容器中删除标签组件
    	if(game[0]!=null){
    		for(int i=0;i<52;i++){
    			c.remove(game[i]); 
    		}
    		c.repaint();
    	}
    	/*在容器中放置52个组件,用于盛放图片*/
    	for(int i=0;i<52;i++){
    		game[i]=new JLabel();
    		c.add(game[i]);
    		game[i].setBorder(javax.swing.BorderFactory.createEtchedBorder(
    				javax.swing.border.EtchedBorder.RAISED));
    	}
    	//设置标签组件的图片,即牌的背面
    	for(int i=0;i<52;i++){
    		game[i].setIcon(new ImageIcon("images/puke.jpg"));
    	}
    }
}

