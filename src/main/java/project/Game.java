package project;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private Die[] dice;
    private HashMap<Roll, Integer> diceRolls;
    private GameState gameState;
    private Scoreboard scoreboard;
    private FortuneCard activeFC;

    public Game(int players){
        scoreboard = new Scoreboard(players);
        gameState = GameState.STANDARD;
        dice = new Die[8];
        for(int i = 0 ; i < 8 ; i++){
            dice[i] = new Die();
        }
        diceRolls = new HashMap<Roll, Integer>();

    }

    private int evaluateFirstRoll(){
        if(diceRolls.get(Roll.SKULL) == 3){
            gameState = GameState.PLAYER_DEAD;
        }else if(diceRolls.get(Roll.SKULL) >= 4){
            gameState = GameState.SKULL_ISLAND;
        }
        for (Roll roll : diceRolls.keySet() ){
            if (diceRolls.get(roll) == 8){
                gameState = GameState.FINISHED;
            }
        }
        int turn_score = scoreboard.calculateDiceScore(diceRolls, activeFC);
        return turn_score;
    }
    private int evaluateReRoll(){
        if(diceRolls.get(Roll.SKULL)>=3){
            gameState = GameState.PLAYER_DEAD;
        }
        int turn_score = scoreboard.calculateDiceScore(diceRolls, activeFC);
        return turn_score;
    }

    public int firstRollFixed(HashMap<Roll,Integer> rolls){
        diceRolls = rolls;
        int turn_score = evaluateFirstRoll();
        return turn_score;
    }


    public int reRollFixed(HashMap<Roll,Integer> rolls){
        diceRolls = rolls;
        int turn_score = evaluateReRoll();
        return turn_score;
    }

    public GameState getGameState(){
        return gameState;
    }

    public void applyFixedFortuneCard(FortuneCard fc){
        activeFC = fc;
    }

    public void setDice(Die[] dice) {
        this.dice = dice;

    }

    private int calculateDiceRolls(){
        for(Die d: dice){
            Roll roll = d.getRoll();
            int current_rolls = diceRolls.get(roll);
            diceRolls.put(roll, current_rolls +1);
        }
        int score = scoreboard.calculateDiceScore(diceRolls,activeFC);
        return score;
    }


}
