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

    public void testGameStateRow64(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,8);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(5400, score);
    }

    public void testGameStateRow65(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.DIAMOND);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,8);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(5400, score);
    }
    public void testGameStateRow66(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.CAPTAIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD, 8);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(9000, score);
    }

    public void testGameStateRow67(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,6);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(1100, score);
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.MONKEY,8);
        score = g.reRollFixed(diceRolls);
        assertEquals(4600, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow68(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.DIAMOND);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(100, score);
        diceRolls.put(Roll.DIAMOND,2);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.PARROT,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(400, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow69(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,1);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,1);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(200, score);
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,3);
        diceRolls.put(Roll.PARROT,0);
        score = g.reRollFixed(diceRolls);
        assertEquals(500, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow70(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,1);
        diceRolls.put(Roll.MONKEY,1);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(500, score);
        diceRolls.put(Roll.COIN,3);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.MONKEY,2);
        diceRolls.put(Roll.PARROT,2);
        score = g.reRollFixed(diceRolls);
        assertEquals(600, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow71(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.DIAMOND);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,3);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,1);
        diceRolls.put(Roll.MONKEY,1);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(400, score);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.COIN,3);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.MONKEY,2);
        diceRolls.put(Roll.PARROT,2);
        score = g.reRollFixed(diceRolls);
        assertEquals(500, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow72(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.GOLD_COIN);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,2);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,4);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(600, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow82(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.MONKEY_BUSINESS);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,1);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,1);
        diceRolls.put(Roll.PARROT,3);
        diceRolls.put(Roll.MONKEY,3);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(1100, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow83(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.MONKEY_BUSINESS);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,2);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,2);
        int score = g.firstRollFixed(diceRolls);
        diceRolls.put(Roll.COIN,2);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,0);
        diceRolls.put(Roll.PARROT,3);
        diceRolls.put(Roll.MONKEY,3);
        score = g.reRollFixed(diceRolls);
        assertEquals(1700, score);
        assertEquals(GameState.STANDARD, g.getGameState());
    }

    public void testGameStateRow84(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.MONKEY_BUSINESS);
        assertEquals(GameState.STANDARD, g.getGameState());
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,0);
        diceRolls.put(Roll.SKULL,3);
        diceRolls.put(Roll.PARROT,2);
        diceRolls.put(Roll.MONKEY,3);
        int score = g.firstRollFixed(diceRolls);
        assertEquals(0, score);
    }

    public void testSorceressRow77(){
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.SORCERESS);
        Die d1 = new Die(Roll.DIAMOND);
        Die d2 = new Die(Roll.DIAMOND);
        Die d3 = new Die(Roll.SWORD);
        Die d4 = new Die(Roll.MONKEY);
        Die d5 = new Die(Roll.COIN);
        Die d6 = new Die(Roll.PARROT);
        Die d7 = new Die(Roll.PARROT);
        Die d8 = new Die(Roll.PARROT);
        Die[] dice = {d1,d2,d3,d4,d5,d6,d7,d8};
        g.firstRollFixed(dice);
        d6.setRoll(Roll.MONKEY);
        d7.setRoll(Roll.MONKEY);
        d8.setRoll(Roll.SKULL);
        g.fixedSorceressReroll(d8, Roll.MONKEY);
        int score = g.reRollFixed(dice);
        assertEquals(500, score);
    }

    public void testSorceressRow78(){
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.SORCERESS);
        Die d1 = new Die(Roll.SKULL);
        Die d2 = new Die(Roll.SKULL);
        Die d3 = new Die(Roll.SKULL);
        Die d4 = new Die(Roll.SWORD);
        Die d5 = new Die(Roll.SWORD);
        Die d6 = new Die(Roll.PARROT);
        Die d7 = new Die(Roll.PARROT);
        Die d8 = new Die(Roll.PARROT);
        Die[] dice = {d1,d2,d3,d4,d5,d6,d7,d8};
        g.firstRollFixed(dice);
        d4.setRoll(Roll.PARROT);
        d5.setRoll(Roll.PARROT);
        g.fixedSorceressReroll(d3, Roll.PARROT);
        int score = g.reRollFixed(dice);
        assertEquals(1000, score);
    }

    public void testSorceressRow79(){
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.SORCERESS);
        Die d1 = new Die(Roll.SKULL);
        Die d2 = new Die(Roll.MONKEY);
        Die d3 = new Die(Roll.MONKEY);
        Die d4 = new Die(Roll.MONKEY);
        Die d5 = new Die(Roll.PARROT);
        Die d6 = new Die(Roll.PARROT);
        Die d7 = new Die(Roll.PARROT);
        Die d8 = new Die(Roll.PARROT);
        Die[] dice = {d1,d2,d3,d4,d5,d6,d7,d8};
        g.firstRollFixed(dice);
        d2.setRoll(Roll.SKULL);
        d3.setRoll(Roll.PARROT);
        d4.setRoll(Roll.PARROT);
        g.reRollFixed(dice);
        g.fixedSorceressReroll(d2, Roll.PARROT);
        int score = g.reRollFixed(dice);
        assertEquals(2000, score);
    }

    public void testTreasureChestRow90(){
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.SORCERESS);
        Die d1 = new Die(Roll.DIAMOND);
        Die d2 = new Die(Roll.DIAMOND);
        Die d3 = new Die(Roll.SWORD);
        Die d4 = new Die(Roll.SWORD);
        Die d5 = new Die(Roll.COIN);
        Die d6 = new Die(Roll.PARROT);
        Die d7 = new Die(Roll.PARROT);
        Die d8 = new Die(Roll.PARROT);
        Die[] dice = {d1,d2,d3,d4,d5,d6,d7,d8};
        g.firstRollFixed(dice);
        g.placeInChest(d1);
        g.placeInChest(d2);
        g.placeInChest(d5);
        d3.setRoll(Roll.PARROT);
        d4.setRoll(Roll.PARROT);
        g.reRollFixed(dice);
        g.removeFromChest(d1);
        g.removeFromChest(d2);
        g.removeFromChest(d5);
        d1.setRoll(Roll.PARROT);
        d2.setRoll(Roll.SKULL);
        d5.setRoll(Roll.COIN);
        int score = g.reRollFixed(dice);
        assertEquals(1100, score);
    }

    public void testTreasureChestRow94(){
        Game g = new Game(1);
        g.applyFixedFortuneCard(FortuneCard.TREASURE_CHEST);
        Die d1 = new Die(Roll.SKULL);
        Die d2 = new Die(Roll.SKULL);
        Die d3 = new Die(Roll.COIN);
        Die d4 = new Die(Roll.COIN);
        Die d5 = new Die(Roll.COIN);
        Die d6 = new Die(Roll.PARROT);
        Die d7 = new Die(Roll.PARROT);
        Die d8 = new Die(Roll.PARROT);
        Die[] dice = {d1,d2,d3,d4,d5,d6,d7,d8};
        g.firstRollFixed(dice);
        g.placeInChest(d3);
        g.placeInChest(d4);
        g.placeInChest(d5);
        d6.setRoll(Roll.DIAMOND);
        d7.setRoll(Roll.DIAMOND);
        d8.setRoll(Roll.COIN);
        g.placeInChest(d8);
        d6.setRoll(Roll.SKULL);
        d7.setRoll(Roll.COIN);
        int score = g.reRollFixed(dice);
        assertEquals(600, score);
        assertEquals(GameState.PLAYER_DEAD, g.getGameState());
    }

}
