package project;
import java.util.Random;

public class Die {

    private boolean active = true;
    private Roll roll;
    Random rand;

    public Die(){
        roll = Roll.UNROLLED;
        rand = new Random();
    }

    public Die(Roll r){
        roll = r;
        rand = new Random();
    }

    public void rollDie(){
        int rolled_num = rand.nextInt(5);
        if (rolled_num == 0){
            roll = Roll.COIN;
        } else if ((rolled_num == 1)) {
            roll = Roll.DIAMOND;
        } else if ((rolled_num == 2)) {
            roll = Roll.MONKEY;
        } else if ((rolled_num == 3)) {
            roll = Roll.PARROT;
        } else if ((rolled_num == 4)) {
            roll = Roll.SWORD;
        } else if ((rolled_num == 5)) {
            roll = Roll.SKULL;
            active = false;
        }

    }

    public void keep(){
        active = false;
    }

    public boolean getActive(){
        if (active == true){
            return true;
        }
        else{
            return false;
        }
    }

    public Roll getRoll(){
        return roll;
    }

    public void setRoll(Roll r){
        if (r == Roll.SKULL){
            this.active = false;
        }
        this.roll = r;
    }
}
