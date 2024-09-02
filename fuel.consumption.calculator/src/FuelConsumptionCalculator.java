import java.util.Scanner;

public class FuelConsumptionCalculator {

    public static void main(String[] args) {

        /*This is a calculator for fuel consumption.
        The idea is to take some info from a user and calculate
        interesting data for fuel consumption analysis.

         When the fuel reserve warning light comes on,
         the driver will reset the trip meter.
         After refueling the tank, the trip meter will
         record the distance traveled with the added amount
         of fuel until the fuel reserve light comes on again.
         We will use this data to analyze fuel consumption.
         */

        float literPrice;   // Price of fuel per liter
        float fuelBill;     // Price on bill for fuel tanking
        float distance;     // Traveled distance
        float fuelConsumption;      //Result of calculation

        System.out.println("Hello my friend!");
        System.out.println("I am The Fuel Consumption Calculator!");
        System.out.println("I will ask you few questions and after calculation you will get basic analysis.");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Can you tell me the price of the fuel per liter?");
        literPrice = userInput.nextFloat();

        System.out.println("What was the price on bill for fuel tanking?");
        fuelBill = userInput.nextFloat();

        float tankedFuel = fuelBill / literPrice;
        System.out.printf("OK, you tanked %5.2f [lit] of fuel.\n", tankedFuel);

        System.out.println("What is the traveled distance [km] before the fuel warning light comes on again?");
        distance = userInput.nextFloat();

        userInput.close();

        fuelConsumption = 100 * tankedFuel / distance;  // Main formula.

        System.out.printf("Fuel consumption of your vehicle is %5.2f [lit] / 100 km.\n", fuelConsumption);
        System.out.printf("You can travel %5.2f [km] per liter of fuel.\n", 100/fuelConsumption);
        System.out.printf("You spent %5.2f $ for fuel per 100 km of travelling.", fuelConsumption*literPrice);

    }
}