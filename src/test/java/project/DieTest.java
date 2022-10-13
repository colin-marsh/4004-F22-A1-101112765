package project;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class DieTest
    extends TestCase
{

    /**
     * @return the suite of tests being tested

    public static Test suite()
    {
        return new TestSuite( DiceTest.class );
    }

     * Rigourous Test :-)
     */
    public void testDie(){
        Die d = new Die();
        assertEquals(Roll.UNROLLED, d.getRoll());
    }

    public void testRollDie()
    {
        Die d = new Die();
        d.rollDie();
        if (d.getRoll() == Roll.SKULL){
            assertEquals(false, d.getActive());
        }else{
            assertEquals(true, d.getActive());
        }
    }

    public void testKeepDie()
    {
        Die d = new Die();
        d.rollDie();
        if (d.getRoll() == Roll.SKULL){
            assertEquals(false, d.getActive());
        }else{
            d.keep();
            assertEquals(false, d.getActive());
        }
    }

}
