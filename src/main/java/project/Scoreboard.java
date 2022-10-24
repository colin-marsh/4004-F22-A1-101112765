package project;

import java.util.HashMap;

public class Scoreboard {

    private int[] scores;

    public Scoreboard(int num_players){
        scores = new int[num_players];

    }

    public int calculateDiceScore(HashMap<Roll,Integer> diceRolls, FortuneCard fc){
        int turn_score = 0;
        if (fc == FortuneCard.GOLD_COIN){
            int rolled_coins = diceRolls.get(Roll.COIN);
            diceRolls.put(Roll.COIN, rolled_coins + 1);
        }else if (fc == FortuneCard.DIAMOND){
            int rolled_diamonds = diceRolls.get(Roll.DIAMOND);
            diceRolls.put(Roll.DIAMOND, rolled_diamonds + 1);
        }

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
                    turn_score += 4000;
                }
            }
        }
        if (fc == FortuneCard.CAPTAIN){
            turn_score = turn_score * 2;
        }
        return turn_score;
    }




}
