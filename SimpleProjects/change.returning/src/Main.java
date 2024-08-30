import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // changing amount
        int change;

        // denominations
        int c100, c50, c20, c10, c5, c1;
        System.out.println("Hello, I am machine for changing money!");
        System.out.println("How many dollars you want to change?");

        Scanner userInput = new Scanner(System.in);
        change = userInput.nextInt();
        userInput.close();

        c100 = change / 100;
        change = change % 100;

        c50 = change / 50;
        change = change % 50;

        c20 = change / 20;
        change = change % 20;

        c10 = change / 10;
        change = change % 10;

        c5 = change / 5;

        c1 = change % 5;

        System.out.println("Your changing amount is: " + change + "$");
        System.out.println("I will return to you:");
        System.out.println(c100 + " per 100$");
        System.out.println(c50 + " per 50$");
        System.out.println(c20 + " per 20$");
        System.out.println(c10 + " per 10$");
        System.out.println(c5 + " per 5$");
        System.out.println(c1 + " per 1$");
        System.out.println("Have a nice day, sir!");
    }
}
