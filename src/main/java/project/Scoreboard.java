package project;

import java.util.Map;

public class Scoreboard {

    private int[] scores;

    public Scoreboard(int num_players){
        scores = new int[num_players];

    }

    public int calculateDiceScore(Map<Roll,Integer> diceRolls){
        int turn_score = 0;
        turn_score += diceRolls.get(Roll.COIN) * 100;
        turn_score += diceRolls.get(Roll.DIAMOND)* 100;
        for (Roll roll : diceRolls.keySet() ){
            if (roll == Roll.SKULL){
                if (diceRolls.get(roll) >=3){
                    turn_score = 0;
                    return turn_score;
                }
            }else{
                if (diceRolls.get(roll) == 3){
                    turn_score += 100;
                }else if (diceRolls.get(roll) == 4){
                    turn_score += 200;
                }else if (diceRolls.get(roll) == 5){
                    turn_score += 500;
                }else if (diceRolls.get(roll) == 6){
                    turn_score += 1000;
                }else if (diceRolls.get(roll) == 7){
                    turn_score += 2000;
                }else if (diceRolls.get(roll) == 8){
                    turn_score += 8000;
                }
            }
        }
        return turn_score;
    }


}
