package CoinChange;

import java.util.Scanner;

public class InputTotalDollar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask user to enter number
        System.out.println("Enter the change amount ");
        // The input from the user is a float number
        // store the user input in userInput variable
        float userInput = scanner.nextFloat();
        // If they enter more than two digits after the decimal place,
        // round to the closest 100th
        double amount = Math.round(userInput * 100.0) / 100.0;
        System.out.println("That breaks down to ... ");
        int dollars = (int) Math.floor(amount);
        System.out.println(dollars + " dollars ");
        int quarters = (int) ((amount - dollars) / 0.25);
        System.out.println(quarters + " quarters ");
        int dimes = (int) (((amount - dollars) - quarters * 0.25) / 0.1);
        System.out.println(dimes + " dimes ");
        int nickels = (int) (((amount - dollars) - quarters * 0.25 - dimes * 0.1) / 0.05);
        System.out.println(nickels + " nickels ");
        int pennies = (int) Math.round(((amount - dollars) - quarters * 0.25 - dimes * 0.1 - nickels * 0.05) / 0.01);
        System.out.println(pennies + " pennies ");



    }
}



























