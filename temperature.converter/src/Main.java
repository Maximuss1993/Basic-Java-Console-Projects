import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Temperature in Fahrenheit degrees
        float tempF;

        // Temperature in Celsius degrees
        float tempC;

        // Message for user:
        System.out.println("Please enter the temperature in Fahrenheit degrees and i will convert it to Celsius degrees: ");

        Scanner userInput = new Scanner(System.in);

        tempF = userInput.nextFloat();
        userInput.close();

        // Conversion formula Fahrenheit to Celsius
        tempC=(tempF-32)*5/9;

        System.out.printf("Temperature: %5.2f", tempF);
        System.out.printf(" [F] is equals to: %5.2f", tempC );
        System.out.print(" [C]");

    }
}