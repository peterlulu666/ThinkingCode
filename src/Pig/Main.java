package Pig;

public class Main {
    public static void main(String[] args) {
        int totalPointOne = 0;
        int totalPointTwo = 0;
        int currentNumber;
        while (true) {
            currentNumber = 0;
            var pigOne = new Pig(currentNumber, totalPointOne);
            // PlayerOne start to play, choose R or H
            System.out.println("PlayerOne start to play, choose R or H \n" + "R - Roll \n" + "H - Hold \n");
            pigOne.CalculatePoint();
            if (pigOne.getNumber() == 1) {
                totalPointOne = 0;
                System.out.println("Round ends. \n");

            } else {
                totalPointOne += pigOne.getTotalNumber();
                System.out.println("You choose hold and your total is " + totalPointOne);

            }
            if (totalPointOne >= 20) {
                System.out.println("Player one wins");
                System.exit(0);
            } else {
                currentNumber = 0;
                var pigTwo = new Pig(currentNumber, totalPointTwo);
                System.out.println("It is your turn, PlayerTwo \n" + "R - Roll \n" + "H - Hold \n");
                pigTwo.CalculatePoint();
                if (pigTwo.getNumber() == 1) {
                    totalPointTwo = 0;
                    System.out.println("Round ends. \n");

                } else {
                    totalPointTwo += pigTwo.getTotalNumber();
                    System.out.println("You choose hold and your total is " + totalPointTwo);

                }
                if (totalPointTwo >= 20) {
                    System.out.println("Player two wins");
                    System.exit(0);
                }
            }
        }
    }
}
