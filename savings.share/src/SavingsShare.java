import java.util.Scanner;

public class SavingsShare {
    public static void main(String[] args) {
        double amount;

        double interestRate;
        int period;

        Scanner userInput = new Scanner(System.in);

        System.out.println("How much money do you want to stipulate?");
        amount = userInput.nextDouble();

        // Saving amount at the beginning
        double amount1 = amount;

        System.out.println("On how many years?");
        period = userInput.nextInt();

        System.out.println("What do you think, what is the fair interest rate in % per year?");
        interestRate = userInput.nextDouble();

        for(int i=1; i<=period; i++){
            amount = amount + amount*interestRate/100;
            System.out.print("Amount after " + i + " years would be: " );
            System.out.printf("%10.2f\n", amount);
        }
        double earning = amount-amount1;

        System.out.printf("You will earn: %10.2f\n", earning);
    }
}


