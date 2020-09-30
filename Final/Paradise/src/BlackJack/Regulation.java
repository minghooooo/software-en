package BlackJack;

import model.User;



/**
 * 游戏规则的制定 
 * @author QianXu
 *
 */
public class Regulation {

	private User comp; 	//庄家
	private User gamer;	//玩家

	public	Regulation(User comp2,User gamer2){
		this.comp = comp2;
		this.gamer = gamer2;
		judgeWinner();
	}
	//判定获胜者：
	private void judgeWinner(){
	//玩家爆分：
		if(gamer.calculator()>21){
			
			if(comp.calculator()<=21)//庄家没爆分
				gamer.setState(State.LOST);
		
			else					//庄家也爆分
				gamer.setState(State.DRAW);
		}
		
	//玩家没爆分：
		else{
			//最大牌型： 拿了5张牌都没有爆分
			if(gamer.getNum() == 5){
				gamer.setState(State.WIN);
			}
			else if(comp.getNum() == 5){
				gamer.setState(State.LOST);
			}
			//没拿到最大牌型
			else{
				if(comp.calculator()>21)	//庄家爆分
					gamer.setState(State.WIN);
				else
					setHigherWin();			//庄家也没爆分
			}
		}
	}

//没有任何特殊牌面时 直接比大小：
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

