package Racepace;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int secondPerHour = 3600;
        final int SecondPerMinute = 60;
        int hour = 0;
        int minute = 0;
        float kilometer = 0f;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        while (true) {
            // Number of kilometers they ran, a floating-point number
            while (true) {
                System.out.println("How many kilometers did you run? \n");
                String kilometers = scanner.nextLine();
                try {
                    // The distance is a float and is always greater than zero
                    kilometer = Float.parseFloat(kilometers);
                    if (kilometer > 0) {
                        break;
                    } else {
                        System.out.println("Oops, that wasn't a positive number, please try again!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Oops, that wasn't a floating-point number, please try again!");
                }

            }

            // Number of hours, a whole number
            while (true) {
                System.out.println("How many hours did it take you? \n");
                String hours = scanner.nextLine();
                if (!isWholeNumber(hours)) {
                    System.out.println("Oops, that wasn't a whole number, please try again!");

                } else {
                    hour = Integer.parseInt(hours);
                    break;
                }

            }

            // Number of minutes, a whole number
            while (true) {
                System.out.println("How many minutes? \n");
                String minutes = scanner.nextLine();
                if (!isWholeNumber(minutes)) {
                    System.out.println("Oops, that wasn't a whole number, please try again!");

                } else {
                    minute = Integer.parseInt(minutes);
                    break;
                }

            }

            // Hours and minutes are both whole numbers,and either one may be zero, but the ​total​ time is never zero
            if ((hour == 0) && (minute == 0)) {
                System.out.println("The ​total​ time can not be zero \n");
            } else {
                break;
            }


        }

        // Compute the total number of miles ran, rounded off to two decimal places
        double miles = 0.621371 * kilometer;
        // Math.round()
        miles = Math.round(miles * 100.0) / 100.0;
        System.out.println("You ran " + miles + " miles ");
        // DecimalFormat()
        System.out.println("You ran " + decimalFormat.format(miles) + " miles ");
        double seconds = hour * secondPerHour + minute * SecondPerMinute;
        double secondsPerMile = seconds / miles;
        double minutesPerMile = secondsPerMile / SecondPerMinute;
        double secondsLeftOver = secondsPerMile % SecondPerMinute;
        double totalHour = seconds / secondPerHour;
        double milesPerHour = miles / totalHour;
        System.out.println("Your pace: " + (int) (minutesPerMile) + " min " + (int) (secondsLeftOver) + " sec per mile ");
        System.out.println("Your MPH: " + decimalFormat.format(milesPerHour));


    }

    // The number is a whole number
    public static boolean isWholeNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;

            }
        }

        return true;

    }

    // The number is floating point number
    public static boolean isFloatingPointNumber(String str) {
        boolean floatingPointNumber = true;
        float number = 0f;
        try {
            number = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            floatingPointNumber = false;
        }

        return floatingPointNumber;
    }
}
