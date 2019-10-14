package CoinChange;

import java.util.Scanner;

public class InputTotalDollarArray {

    /**
     * Takes a dollar amount, represented by a double value,
     * and returns the minimum number of quarters, dimes,
     * nickels, and pennies that would be required to
     * represent that dollar value.
     *
     * @param dollarValue
     * @return {Quarters, Dimes, Nickels, Pennies}
     */
    public static int[] getChange(double dollarValue) {
        final int DOLLARS = 100;             // number of cents in dollar
        final int QUARTERS = 25;             // number of cents in quarter
        final int DIMES = 10;                // number of cents in dime
        final int NICKELS = 5;               // number of cents in nickel
        // If they enter more than two digits after the decimal place,
        // round to the closest 100th
        int cents = (int) Math.round(dollarValue * 100);
        // Convert the cents into quarters, dimes, nickels, and pennies, respectively.
        int[] change = {cents / DOLLARS,
                (cents %= DOLLARS) / QUARTERS,
                (cents %= QUARTERS) / DIMES,
                (cents %= DIMES) / NICKELS,
                cents % NICKELS};
        return change;
    }

    public static void main(String[] args) {
        // Instantiate Variables \\
        double total;
        int[] change;
        Scanner keyboard;

        // Receive Input \\
        keyboard = new Scanner(System.in);
        System.out.println("This application calculates the exact change for a given dollar amount.");
        System.out.println("Please enter in the total amount of dollars and cents:");
        total = keyboard.nextDouble();
        keyboard.close();

        // Make Calculations \\
        change = getChange(total);
        System.out.printf("$%.2f = "
                + change[0] + " Dollars, "
                + change[1] + " Quarters, "
                + change[2] + " Dimes, "
                + change[3] + " Nickels, "
                + change[4] + " Pennies", total);


    }

}







































