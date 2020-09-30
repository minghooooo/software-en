package BlackJack;

import model.User;



/**
 * ��Ϸ������ƶ� 
 * @author QianXu
 *
 */
public class Regulation {

	private User comp; 	//ׯ��
	private User gamer;	//���

	public	Regulation(User comp2,User gamer2){
		this.comp = comp2;
		this.gamer = gamer2;
		judgeWinner();
	}
	//�ж���ʤ�ߣ�
	private void judgeWinner(){
	//��ұ��֣�
		if(gamer.calculator()>21){
			
			if(comp.calculator()<=21)//ׯ��û����
				gamer.setState(State.LOST);
		
			else					//ׯ��Ҳ����
				gamer.setState(State.DRAW);
		}
		
	//���û���֣�
		else{
			//������ͣ� ����5���ƶ�û�б���
			if(gamer.getNum() == 5){
				gamer.setState(State.WIN);
			}
			else if(comp.getNum() == 5){
				gamer.setState(State.LOST);
			}
			//û�õ��������
			else{
				if(comp.calculator()>21)	//ׯ�ұ���
					gamer.setState(State.WIN);
				else
					setHigherWin();			//ׯ��Ҳû����
			}
		}
	}

//û���κ���������ʱ ֱ�ӱȴ�С��
	private void setHigherWin()
	{
		if(gamer.calculator() > comp.calculator())
			gamer.setState(State.WIN);
		
		else if(gamer.calculator() == comp.calculator())
			gamer.setState(State.DRAW);
		
		else 
			gamer.setState(State.LOST);
	}
}

