package project;

import junit.framework.TestCase;

import java.util.HashMap;

public class GameTest extends TestCase {

    public void testGameStateRow46(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,4);
        diceRolls.put(Roll.MONKEY,0);

        int score = g.firstRollFixed(diceRolls);
        assertEquals(400, score);
        diceRolls.put(Roll.SWORD,1);
        diceRolls.put(Roll.SKULL,3);
        score = g.reRollFixed(diceRolls);
        assertEquals(0, score);
        assertEquals(GameState.PLAYER_DEAD, g.getGameState());
    }

    public void testGameStateRow47(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,4);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(300, score);
        diceRolls.put(Roll.SWORD,1);
        diceRolls.put(Roll.SKULL,3);
        score = g.reRollFixed(diceRolls);
        assertEquals(0, score);
        assertEquals(GameState.PLAYER_DEAD, g.getGameState());
    }

    public void testGameStateRow48(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,4);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(300, score);
        diceRolls.put(Roll.SWORD,1);
        diceRolls.put(Roll.SKULL,3);
        score = g.reRollFixed(diceRolls);
        assertEquals(0, score);
        assertEquals(GameState.PLAYER_DEAD, g.getGameState());
    }

    public void testGameStateRow50(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(500, score);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.COIN,4);
        score = g.reRollFixed(diceRolls);
        assertEquals(1100, score);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.COIN,7);
        score = g.reRollFixed(diceRolls);
        assertEquals(4800, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow52(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.CAPTAIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,2);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(800, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow53(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(100, score);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.SWORD,1);
        diceRolls.put(Roll.MONKEY,3);
        score = g.reRollFixed(diceRolls);
        assertEquals(300, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow54(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,3);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(300, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }


    public void testGameStateRow56(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.DIAMOND);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,4);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(700, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow57(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,4);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(400, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow58(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(500, score);
        diceRolls.put(Roll.COIN,3);
        diceRolls.put(Roll.SWORD,4);
        diceRolls.put(Roll.PARROT,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(800, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }
    public void testGameStateRow59(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.CAPTAIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(600, score);
        diceRolls.put(Roll.COIN,3);
        diceRolls.put(Roll.SWORD,4);
        diceRolls.put(Roll.PARROT,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(1200, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow60(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(200, score);
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.SWORD,4);
        diceRolls.put(Roll.MONKEY,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(300, score);
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.MONKEY,1);
        diceRolls.put(Roll.SWORD,5);
        diceRolls.put(Roll.PARROT,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(600, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow62(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,6);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(1100, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow63(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,7);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(2100, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }
}
