package BlackJack;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Card;

public class CardManager {

	/**
	 * Ŀ��:��ʼ����,����,�ͷ���
	 * @author QianXu 
	 */
    public Card[] cards=new Card[52]; //����������ֽ��
    /*��ʼ��ֽ��*/
    public void initCards(){
    	for(int i=1;i<=4;i++){ //ֽ������
    		for(int j=1;j<=13;j++){ //ֽ����ֵ
    			cards[(i-1)*13+j-1]=new Card(i,j);
    		}
    	}
    }
    /*��������ƺ�*/
    public void randomCards(){
    	Card temp=null; //���¶���ֽ�Ƶ�����

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
    /*���巽��,����*/
    public void gameStart(JLabel game[],Container c){
    	//��������ɾ����ǩ���
    	if(game[0]!=null){
    		for(int i=0;i<52;i++){
    			c.remove(game[i]); 
    		}
    		c.repaint();
    	}
    	/*�������з���52�����,����ʢ��ͼƬ*/
    	for(int i=0;i<52;i++){
    		game[i]=new JLabel();
    		c.add(game[i]);
    		game[i].setBorder(javax.swing.BorderFactory.createEtchedBorder(
    				javax.swing.border.EtchedBorder.RAISED));
    	}
    	//���ñ�ǩ�����ͼƬ,���Ƶı���
    	for(int i=0;i<52;i++){
    		game[i].setIcon(new ImageIcon("images/puke.jpg"));
    	}
    }
}

