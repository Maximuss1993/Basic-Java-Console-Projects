import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a lottery game.");
        System.out.println("You have to input 7 numbers from 1 to 39.");
        System.out.println("And I will show you winning combination of numbers");
        System.out.println("and how many winning numbers do you have.");
        System.out.println("Lets play....");
        System.out.println("");

        // two ArrayList<Integer> for lottery numbers and for user's combination of numbers
        ArrayList<Integer> lottery = new ArrayList<Integer>(7);
        ArrayList<Integer> combination = new ArrayList<Integer>(7);

        Scanner input = new Scanner(System.in);

        // loop for user's combination of numbers
        int counter1 = 0;
        while( counter1 < 7 ){
            System.out.println("Input your #" + (counter1+1) + " number of your combination." );
            int number = input.nextInt();
            if ( number < 1 || number > 39){
                System.out.println("You have to input number from 1 to 39.");
                continue;
            }

            // duplicates control
            if( !combination.contains(number) ){
                combination.add(number);
                counter1++;
            } else {
                System.out.println("Your number is duplicate, try again please.");
                continue;
            }
        }
        combination.sort(Comparator.naturalOrder());
        System.out.println("Your combination is:");
        System.out.println(combination);

        // loop for lottery numbers
        int counter2 = 0;
        while( counter2 < 7 ){
            Integer number = numberDraw();

            // duplicates control
            if( !lottery.contains(number) ){
                lottery.add(number);
                counter2++;
            } else {
                // if it is a duplicate continue loop without increasing counter.
                continue;
            }
        }

        lottery.sort(Comparator.naturalOrder());
        System.out.println("Winning combination is:");
        System.out.println(lottery);

        // Invoking method for calculating winning numbers in user's combination
        result( lottery, combination);
        System.out.println("You have "+ result( lottery, combination) + " winning numbers!");
    }

    // numberDrawing method for generating random number form 1 to 39
    public static int numberDraw(){
        int number = (int) (39*Math.random()+1);
        return number;
    }

    public static int result( ArrayList<Integer> first, ArrayList<Integer> second){
        int winningNumbers = 0;
        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                if (first.get(i).equals(second.get(j))) {
                    winningNumbers++;
                }
            }
        }
        return  winningNumbers;
    }
}
