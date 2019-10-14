package ThreeQuestions;

import java.util.Scanner;

public class ThreeQuiz {
    private final static int A = 1;
    private final static int B = 2;
    private final static int C = 3;
    private final static int D = 4;
    private static int totalScore = 0;
    private static String character = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestionOneDisplay();
        char questionOne = scanner.next().charAt(0);
        QuizScore(questionOne);

        QuestionTwoDisplay();
        char questionTwo = scanner.next().charAt(0);
        QuizScore(questionTwo);

        QuestionThreeDisplay();
        char questionThree = scanner.next().charAt(0);
        QuizScore(questionThree);

        YourCharacter();

        Report();

    }

    private static void QuizScore(char choice) {
        if (choice == 'A' || choice == 'a') {
            totalScore += A;
        } else if (choice == 'B' || choice == 'b') {
            totalScore += B;
        } else if (choice == 'C' || choice == 'c') {
            totalScore += C;
        } else if (choice == 'D' || choice == 'd') {
            totalScore += D;
        }


    }

    private static void QuestionOneDisplay() {
        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");

    }

    private static void QuestionTwoDisplay() {
        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");

    }

    private static void QuestionThreeDisplay() {
        System.out.println("You're in a burning building with a friend and " +
                "have 10 seconds to get out. " +
                "What do you do? \n");
        System.out.println("A - Save myself, of course! \n" +
                "B - Stay and save my friend. \n" +
                "C - If I can save my friend I'll try but if they're going to die anyway, what's the point? \n" +
                "D - Save my friend and everyone else I can find. \n");
        System.out.println("Enter your selection now \n");

    }

    private static void YourCharacter() {
        if (totalScore < 5) {
            character = "Slytherin!!!";
        } else if (totalScore < 8) {
            character = "Gryffindor!!!";
        } else if (totalScore < 11) {
            character = "Ravenclaw!!!";
        } else if (totalScore < 13) {
            character = "Hufflepuff!!!";
        }


    }

    private static void Report() {
        System.out.println("You scored " + totalScore +
                " on the quiz, that means you are..." +
                character);

    }
}
