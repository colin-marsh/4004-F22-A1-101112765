package project;

import java.util.HashMap;

public class Scoreboard {

    private int[] scores;

    public Scoreboard(int num_players){
        scores = new int[num_players];

    }

    public int calculateDiceScore(HashMap<Roll,Integer> diceRolls, FortuneCard fc){
        int turn_score = 0;
        boolean seabattle = false;
        if (fc == FortuneCard.TWO_SWORDS || fc == FortuneCard.THREE_SWORDS || fc == FortuneCard.FOUR_SWORDS){
            seabattle = true;
        }
        if (checkFullChest(diceRolls, fc)){
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
            }else if(seabattle && roll == Roll.SWORD){
                turn_score += scoreSeaBattle(diceRolls.get(roll), fc);
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

    public boolean checkFullChest(HashMap<Roll,Integer> diceRolls, FortuneCard fc){
        int dice_count = 0;
        for (Roll roll : diceRolls.keySet() ){
            int num_roll = diceRolls.get(roll);
            dice_count += num_roll;
            if(num_roll >=1){
                if (roll == Roll.PARROT || roll == Roll.MONKEY){
                    boolean is_scoring;
                    if (fc == FortuneCard.MONKEY_BUSINESS){
                         is_scoring = checkMonkeyBusinessScoring(diceRolls.get(Roll.MONKEY),diceRolls.get(Roll.PARROT));
                    }else{
                        is_scoring = checkRollScoring(roll, num_roll, fc);
                    }
                    if(is_scoring == false){
                        return false;
                    }
                }else{
                    boolean is_scoring = checkRollScoring(roll, num_roll, fc);
                    if(is_scoring == false){
                        return false;
                    }
                }

            }
        }
        if(dice_count <8){
            return false;
        }
        return true;
    }

    public boolean checkRollScoring(Roll roll, int num, FortuneCard fc){
        if(roll == Roll.COIN){
            return true;
        } else if (roll == Roll.DIAMOND) {
            return true;
        }else if (roll == Roll.SKULL){
            return false;
        }else if (fc == FortuneCard.TWO_SWORDS || fc == FortuneCard.THREE_SWORDS || fc == FortuneCard.FOUR_SWORDS){
            if (roll == Roll.SWORD){
                if (scoreSeaBattle(num,fc )>0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return num >= 3;
    }

    private boolean checkMonkeyBusinessScoring(int monkey_rolls,int parrots_rolls){
        return monkey_rolls + parrots_rolls >= 3;
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

    private int scoreSeaBattle(int num_roll, FortuneCard fc){
        if (fc == FortuneCard.TWO_SWORDS){
            if (num_roll >= 2){
                return 300;
            }else{
                return -300;
            }
        }else if (fc == FortuneCard.THREE_SWORDS){
            if (num_roll >= 3){
                return 500;
            }else{
                return -500;
            }
        }else{
            if (num_roll >= 4){
                return 1000;
            }else{
                return -1000;
            }
        }

    }


}
