package ThreeQuestions;

import java.util.Scanner;

public class ThreeQuestion {
    public static void main(String[] args) {
        final int A = 1;
        final int B = 2;
        final int C = 3;
        final int D = 4;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");
        char questionOne = scanner.next().charAt(0);
        if (questionOne == 'A' || questionOne == 'a') {
            score += A;

        } else if (questionOne == 'B' || questionOne == 'b') {
            score += B;
        } else if (questionOne == 'C' || questionOne == 'c') {
            score += C;
        } else if (questionOne == 'D' || questionOne == 'd') {
            score += D;
        }

        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");
        char questionTwo = scanner.next().charAt(0);
        if (questionTwo == 'A' || questionTwo == 'a') {
            score += A;

        } else if (questionTwo == 'B' || questionTwo == 'b') {
            score += B;
        } else if (questionTwo == 'C' || questionTwo == 'c') {
            score += C;
        } else if (questionTwo == 'D' || questionTwo == 'd') {
            score += D;
        }

        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");
        char questionThree = scanner.next().charAt(0);
        if (questionThree == 'A' || questionThree == 'a') {
            score += A;

        } else if (questionThree == 'B' || questionThree == 'b') {
            score += B;
        } else if (questionThree == 'C' || questionThree == 'c') {
            score += C;
        } else if (questionThree == 'D' || questionThree == 'd') {
            score += D;
        }

        String character = "";
        if (score < 5) {
            character = "Slytherin!!!";
        } else if (score < 8) {
            character = "Gryffindor!!!";
        } else if (score < 11) {
            character = "Ravenclaw!!!";
        } else if (score < 13) {
            character = "Gryffindor!!!";
        }

        System.out.println("You scored " + score +
                " on the quiz, that means you are..." +
                character);


    }
}
