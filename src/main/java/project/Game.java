package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {

    private Die[] dice;
    private HashMap<Roll, Integer> diceRolls;
    private GameState gameState;
    private Scoreboard scoreboard;
    private FortuneCard activeFC;

    private Boolean sorceressActive;

    private ArrayList<Die> goldChest;

    public Game(int players){
        scoreboard = new Scoreboard(players);
        gameState = GameState.STANDARD;
        sorceressActive = false;
        dice = new Die[8];
        goldChest = new ArrayList<>();
        for(int i = 0 ; i < 8 ; i++){
            dice[i] = new Die();
        }
        diceRolls = new HashMap<Roll, Integer>();
        clearDiceRolls();
    }

    private void clearDiceRolls(){
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
    }

    private int evaluateFirstRoll(){
        if (sorceressActive == false){
            if(diceRolls.get(Roll.SKULL) == 3){
                gameState = GameState.PLAYER_DEAD;
                if(activeFC == FortuneCard.TREASURE_CHEST){
                    int turn_score = calculateTreasureChestScore();
                    return turn_score;
                }
            }
        }
        if(diceRolls.get(Roll.SKULL) >= 4){
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
            if(activeFC == FortuneCard.TREASURE_CHEST){
                int turn_score = calculateTreasureChestScore();
                return turn_score;
            }
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
        if(fc == FortuneCard.SORCERESS){
            sorceressActive = true;
        }
        activeFC = fc;
    }

    public void setDice(Die[] dice) {
        this.dice = dice;
    }

    public int firstRollFixed(Die[] dice){
        this.dice = dice;
        calculateDiceRolls();
        int score = evaluateFirstRoll();
        return score;
    }

    public int reRollFixed(Die[] dice){
        this.dice = dice;
        clearDiceRolls();
        calculateDiceRolls();
        int score = evaluateReRoll();
        return score;
    }

    public void fixedSorceressReroll(Die d, Roll r){
        if (activeFC == FortuneCard.SORCERESS && sorceressActive && d.getRoll() == Roll.SKULL ){
            d.setRoll(r);
            sorceressActive = false;
        }else{
            System.out.println("Sorceress is not active");
        }
    }

    public void placeInChest(Die d){
        if(activeFC == FortuneCard.TREASURE_CHEST){
            goldChest.add(d);
        }
    }

    public void removeFromChest(Die d){
        if(activeFC == FortuneCard.TREASURE_CHEST){
            goldChest.remove(d);
        }
    }

    private void calculateDiceRolls(){
        for(Die d: dice){
            Roll roll = d.getRoll();
            int current_rolls = diceRolls.get(roll);
            diceRolls.put(roll, current_rolls +1);
        }
    }

    private int calculateTreasureChestScore(){
        clearDiceRolls();
        for (Die d: goldChest){
            Roll roll = d.getRoll();
            int current_rolls = diceRolls.get(roll);
            diceRolls.put(roll, current_rolls +1);
        }
        return scoreboard.calculateDiceScore(diceRolls, activeFC);
    }


}
