package project;

import java.util.HashMap;

public class Scoreboard {

    private int[] scores;

    public Scoreboard(int num_players){
        scores = new int[num_players];

    }

    public int calculateDiceScore(HashMap<Roll,Integer> diceRolls, FortuneCard fc){
        int turn_score = 0;
        if (checkFullChest(diceRolls)){
            turn_score += 500;
        }
        if (fc == FortuneCard.GOLD_COIN){
            int rolled_coins = diceRolls.get(Roll.COIN);
            diceRolls.put(Roll.COIN, rolled_coins + 1);
        }else if (fc == FortuneCard.DIAMOND){
            int rolled_diamonds = diceRolls.get(Roll.DIAMOND);
            diceRolls.put(Roll.DIAMOND, rolled_diamonds + 1);
        }else if (fc == FortuneCard.MONKEY_BUSINESS){
            turn_score += diceRolls.get(Roll.COIN) * 100;
            turn_score += diceRolls.get(Roll.DIAMOND)* 100;
            turn_score += calculateMonkeyBusinessScore(diceRolls);
            return turn_score;
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
                turn_score += getIdenticalRollScore(diceRolls.get(roll));
            }
        }
        if (fc == FortuneCard.CAPTAIN){
            turn_score = turn_score * 2;
        }
        return turn_score;
    }

    private int getIdenticalRollScore(int num_rolls){
        int roll_score = 0;
        if (num_rolls == 3){
            roll_score = 100;
            return roll_score;
        }else if (num_rolls == 4){
            roll_score = 200;
            return roll_score;
        }else if (num_rolls == 5){
            roll_score = 500;
            return roll_score;
        }else if (num_rolls == 6){
            roll_score = 1000;
            return roll_score;
        }else if (num_rolls == 7){
            roll_score = 2000;
            return roll_score;
        }else if (num_rolls >= 8){
            roll_score = 4000;
            return roll_score;
        }else{
            return 0;
        }
    }


    public boolean checkFullChest(HashMap<Roll,Integer> diceRolls){

        for (Roll roll : diceRolls.keySet() ){
            int num_roll = diceRolls.get(roll);
            if(num_roll >=1){
                boolean is_scoring = checkRollScoring(roll, num_roll);
                if(is_scoring == false){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRollScoring(Roll roll, int num){
        if(roll == Roll.COIN){
            return true;
        } else if (roll == Roll.DIAMOND) {
            return true;
        }else if (roll == Roll.SKULL){
            return false;
        }else{
            if (num >= 3){
                return true;
            }else{
                return false;
            }
        }
    }

    private int calculateMonkeyBusinessScore(HashMap<Roll,Integer> diceRolls){
        int turn_score = 0;
        for (Roll roll : diceRolls.keySet() ){
            if (roll == Roll.SKULL){
                if (diceRolls.get(roll) >=3){
                    turn_score = 0;
                    return turn_score;
                }
            }else{
                if (roll != Roll.MONKEY && roll != Roll.PARROT){
                    turn_score += getIdenticalRollScore(diceRolls.get(roll));
                }else if(roll == Roll.MONKEY){

                    int combined_roll = diceRolls.get(Roll.MONKEY) + diceRolls.get(Roll.PARROT);
                    turn_score += getIdenticalRollScore(combined_roll);
                }
            }
        }
        return turn_score;
    }






}
