public class Main {
    public static void main(String[] args) {

        System.out.println("This is a game of rolling two dice.");
        System.out.println("Let's see how many attempts it will take to roll two matching numbers on the dice.");

        int counter = 0;
        while(true) {
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            counter++;

            System.out.println("Attempt No" + counter + ": Dice #1: " + dice1.number + " Dice #2: " + dice2.number);
            if (dice1.number==dice2.number){
                System.out.println("I rolled dices with two matching numbers in attempt No" + counter + ".");
                break;
            }
        }
    }
}