/*Suppose that a cashier owes a customer some change and that the cashier only has

quarters, dimes, nickels, and pennies. Write a program the computes the minimum

number of coins that the cashier can return. Your program should first ask the user for the amount of

money he/she is owed (in dollars). You may assume that the user will enter a positive

number. It should then print the minimum number of coins with which that amount can

be made. Assume that the only coins available are quarters (25 cents), dimes (10

cents), nickels (5 cents), and pennies (1 cent)*/

package CoinChange;

import javax.swing.*;
import java.util.Scanner;

public class Cashier {

    final static int QUARTERS = 25;             // number of cents in quarter
    final static int DIMES = 10;                // number of cents in dime
    final static int NICKELS = 5;               // number of cents in nickel

    public static void main (String[] args) {
        float userInput;
        double amount;
        int cents;                               // total amount of cents
        int numDollars, numQuarters,             // number of dollars, quarters
                numDimes, numNickels;                // number of dimes, nickels
        int centsLeft;                           // cents left after coins

        // ask user to enter number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the change amount: ");
        // The input from the user is a float number
        // store the user input in userInput variable
        userInput = keyboard.nextFloat();
        // If they enter more than two digits after the decimal place,
        // round to the closest 100th
        amount = Math.round(userInput * 100.0) / 100.0;
        // total number of cents
        cents = (int) (amount * 100);
        System.out.println();

        // compute total amount of dollars, quarter, dimes, nickels, and pennies
        numQuarters = cents/QUARTERS;
        centsLeft = cents % QUARTERS;
        numDimes = centsLeft/DIMES;
        centsLeft = centsLeft % DIMES;
        numNickels = centsLeft/NICKELS;
        centsLeft = centsLeft % NICKELS;

        // display resulting number of coins
        System.out.println(numQuarters + " quarters ");
        System.out.println(numDimes + " dimes ");
        System.out.println(numNickels + " nickels ");
        System.out.println(centsLeft + " pennies ");
        System.out.println();
    }
}
