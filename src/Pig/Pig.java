package Pig;

import java.util.Random;
import java.util.Scanner;

public class Pig {
    private int number;
    private int totalNumber;
    private int totalPoints;

    public Pig(int totalNumber, int totalPoints) {
        this.totalNumber = totalNumber;
        this.totalPoints = totalPoints;

    }

    public void CalculatePoint() {
        while (true) {
            // PlayerOne enter R or H
            System.out.println("Enter your choice \n");
            Scanner scanner = new Scanner(System.in);
            String userChoose = scanner.nextLine();
            if (userChoose.equals("H") || userChoose.equals("h")) {
                break;
            }

            // Random number
            Random random = new Random();
            number = random.nextInt(6) + 1;
            System.out.println("You rolled a " + number);

            // Total points in this round
            totalNumber = totalNumber + number;
            // Total points in all rounds
            totalPoints = totalPoints + number;
            if (number == 1){
                totalPoints = 0;
                totalNumber = 0;
                System.out.println("The round is over and you have lost all the points you accumulated in the round");
                System.out.println("Points in this round: " + totalNumber);
                System.out.println("Your total is " + totalPoints);
                break;
            }
            System.out.println("Points in this round: " + totalNumber);
            System.out.println("Your total is " + totalPoints);

            if (totalNumber > 20) {
                break;
            }

            if (totalPoints > 20) {
                break;
            }

        }

    }

    public int getNumber() {
        return number;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}
