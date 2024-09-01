import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // User inputs guessing combination of numbers
        int[] usersCombination = new int[7];

        System.out.println("You can input your combination of 7 numbers form 1 to 39.");
        System.out.println("After each number press enter");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Write your " + (i+1) + ". number [1-39]");
            usersCombination[i] = input.nextInt();
        }
        bubbleSort(usersCombination);
        System.out.println("Your combination is:");
        System.out.println(Arrays.toString(usersCombination));

        // Creating new array - size:7
        int[] lottery = new int[7];

        // Loop for random numbers from 1 to 39
        for (int i = 0; i < 7; i++) {
            lottery[i] = (int) ((39*Math.random())+1);

            // Checking is it unique
            for (int j = 0; j < i; j++) {
                if (lottery[j] == lottery[i]) {
                    lottery[j] = (int) ((39*Math.random())+1);
                }
            }
        }

        // Bubble sort of elements in array lottery[]
        bubbleSort(lottery);
        System.out.println("Winning combination is: ");
        System.out.println(Arrays.toString(lottery));

        // Matching counter
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (usersCombination[i] == lottery[j]) counter++;
            }
        }
        if (counter == 7){
            System.out.println("YOU HAVE WINNING COMBINATION!!!");
        } else {
        System.out.println("You have " + counter + " matching numbers!");}
    }

    //bubbleSort() method definition
    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

}

