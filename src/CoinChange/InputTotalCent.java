package CoinChange;

import java.util.*;

public class InputTotalCent {
    public static void main(String[] args) {
        //declare variables
        Scanner console = new Scanner(System.in);

        // final indicates that a variable's value cannot be changed
        final int DOLLAR = 100;
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;

        int cent;

        System.out.print("Enter the change in cents: ");
        System.out.flush();

        cent = console.nextInt();                        //Step 2

        System.out.println();
        System.out.println("The change you entered is "
                + cent);                       //Step 3

        System.out.println("The number of half dollars "
                + "to be returned is "
                + cent / DOLLAR);           //Step 4

        cent = cent % DOLLAR;                      //Step 5

        System.out.println("The number of quarters to be "
                + "returned is "
                + cent / QUARTER);              //Step 6

        cent = cent % QUARTER;                         //Step 7

        System.out.println("The number of dimes to be "
                + "returned is "
                + cent / DIME);                 //Step 8

        cent = cent % DIME;                            //Step 9

        System.out.println("The number of nickels to be "
                + "returned is "
                + cent / NICKEL);               //Step 10

        cent = cent % NICKEL;                          //Step 11

        System.out.println("The number of pennies to be "
                + "returned is " + cent);       //Step 12
    }
}
















