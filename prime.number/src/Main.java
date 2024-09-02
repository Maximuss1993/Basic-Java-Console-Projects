import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Write a number and I will tell you is it a prime number!");

        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        long startTimeBasic = System.nanoTime();

        if (isPrimeBasic(number)){
            System.out.println("Your number IS a prime!");
        } else System.out.println("Your number IS NOT a prime!");

        long endTimeBasic = System.nanoTime();
        long durationBasic =  endTimeBasic - startTimeBasic;
        System.out.println("Time for executing basic method was: " + durationBasic);

        long startTimeEnhanced = System.nanoTime();
        if (isPrimeEnhanced(number)){
            System.out.println("Your number IS a prime!");
        } else System.out.println("Your number IS NOT a prime!");

        long endTimeEnhanced = System.nanoTime();
        long durationEnhanced =  endTimeEnhanced - startTimeEnhanced;
        System.out.println("Time for executing basic method was: " + durationBasic);
    }

    public static Boolean isPrimeBasic(int n){
        for (int i = 2; i <= (int) Math.sqrt(n); i++) { //This way we save the time required to execute the loop.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

     public static Boolean isPrimeEnhanced(int n){
         for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}