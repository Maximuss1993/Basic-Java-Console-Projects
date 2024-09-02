public class Dice {

    public int number;

    public Dice(){
        roll();
    }

    public void roll(){
        number = (int) ( 1 + 6 * Math.random());
    }
}
