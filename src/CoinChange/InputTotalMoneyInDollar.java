package CoinChange;

import java.io.*; // For user input.
public class InputTotalMoneyInDollar
{ // Open main program body.
    public static void main (String[] args) throws IOException
    { // take note.. throws IOException.. for user's input.

        // Let's begin with the declaration of variables that we are going to use..

        BufferedReader userInput = new BufferedReader (new InputStreamReader (System.in)); //User's input variable.
        String name; //your program had something about a name..

        /* Because you're dealing with money... you'll have to go through decimals, though your output are all whole numbers,
        so we begin by declaring doubles for all of dollars, quarters, dimes, etc... */

        double amount; // stores the amount the user will input.
        double dollars; // stores the amount of calculated dollars.
        double quarters; // ' '     ' '     ' ' quarters.
        double dimes; // ' '     ' '     ' ' dimes.
        double nickels; // ' '     ' '     ' ' nickels.
        double pennies; // ' '     ' '     ' ' pennies.

        // the program will have to pass down the remainder after dividing out each value, so let's declare variables for those..

        double dollarRem; // stores the amount of remainder from dollars.
        double quarterRem; // ' '     ' '     ' ' quarters.
        double dimeRem; // ' '     ' '     ' ' dimes.
        double nickelRem; // ' '     ' '     ' ' nickels.

        //Now that we have all the variables declared, let's collect data from the user and get to the calculations..

        System.out.println ("What is your name?"); //Request information from the user.
        name = userInput.readLine (); // store information in earlier declared "name" variable.

        System.out.println ("Hello " + name + ".\n" // refer to the user by their name that you just collected.
                + "This program calculates the number of coins necessary to make change for any amount you enter."); //explain program.

        System.out.println ("Please enter the amount you like to make change for in dollars. e.g - '3.41' "); //Request of data.
        amount = Double.parseDouble (userInput.readLine ()); // parse the users input into a double as it is accepted as a string by default.

        /*That's all the data your program needs to collect, now let's calculate...
         *firstly we want to make the amount you just collected a whole number so it is WAY easier to deal with.. */
        amount = amount * 100; // multiply the two decimal place number by 100 to make it a whole number.. N.B - this assumes the user's input is not more than two decimal places.

        // dollars calculation..
        dollars = Math.floor (amount / 100);
        // note dividing by 100 not 1 because the amount was multiplied by 100, so the dollar is too. the "Math.floor()" ROUNDS the answer DOWN to the nearest whole number.

        // now the remainder after we take out dollars..
        dollarRem = amount % 100; // the "%" means it divides two numbers and returns the remainder.

        // quarters calculation..

        quarters = Math.floor (dollarRem / 25);

        // now the remainder after we take out quarters..

        quarterRem = dollarRem % 25;

        //See the pattern? we'll just run through the rest..

        dimes = Math.floor (quarterRem / 10);
        dimeRem = quarterRem % 10;
        nickels = Math.floor (dimeRem / 5);
        nickelRem = dimeRem % 5;
        pennies = nickelRem; //anything divided by 1 is the same number, so nickelRem is the amount of pennies.

        //Now that all calculations are done.. time for output to the user...

        System.out.println ("Here is the amount to each type of coin necesssary to make change for $" + (amount / 100) + " is:\n"
                + "Dollars: " + (int) dollars + "\n"
                + "Quarters: " + (int) quarters + "\n"
                + "Dimes: " + (int) dimes + "\n"
                + "Nickels: " + (int) nickels + "\n"
                + "Pennies: " + (int) pennies); // output to user.
    }
} // close main program.
