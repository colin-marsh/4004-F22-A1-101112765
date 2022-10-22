package project;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoardTest extends TestCase{

    public void testCalculateDiceScoreRow41(){
        HashMap<Roll,Integer> diceRolls = new HashMap<Roll, Integer>();
        Scoreboard sb = new Scoreboard(1);
        diceRolls.put(Roll.COIN,0);
        diceRolls.put(Roll.DIAMOND,0);
        diceRolls.put(Roll.SWORD,5);
        diceRolls.put(Roll.SKULL,3);
        diceRolls.put(Roll.PARROT,0);
        diceRolls.put(Roll.MONKEY,0);
        int score = sb.calculateDiceScore(diceRolls, FortuneCard.GOLD_COIN);
        assertEquals(0 ,score);
    }

}
