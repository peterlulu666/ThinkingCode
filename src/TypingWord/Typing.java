package TypingWord;

import java.util.Date;
import java.util.Scanner;

public class Typing {
    public static void main(String[] args) {
        int phraseIndex = 0;

        int wordNumber = 0;

        int mistakes = 0;

        String[] phraseArray = new String[100];

        System.out.println("Welcome to the WPM test! " +
                "Type each sentence exactly as it appears \n " +
                "Or type DONE and well end the test. \n ");

        Scanner scanner = new Scanner(System.in);
        String userEnter = scanner.nextLine();

        if (userEnter.equals("DONE")) {
            System.out.println("You typed 0 words in 0 seconds. \n" +
                    "Your overall wpm is 0 \n");
            System.exit(0);
        }

        Date startDate = new Date();

        var sentence = new Sentence();

        while (true) {
            phraseArray[phraseIndex] = sentence.selectSentence();
            System.out.println(phraseArray[phraseIndex]);
            String userPhrase = scanner.nextLine();
            if (userPhrase.equals("DONE")) {
                break;
            }

            if (userPhrase.isEmpty()) {
                wordNumber = wordNumber + 0;
            } else {
                wordNumber = wordNumber + sentence.countWords(userPhrase);
            }

            mistakes = mistakes + sentence.countMismatches(phraseArray[phraseIndex], userPhrase);
            phraseIndex = phraseIndex + 1;


        }

        Date endDate = new Date();

        float numSeconds = (float) ((endDate.getTime() - startDate.getTime()) / 1000);

        float numMinutes = numSeconds / 60;

        System.out.println("You typed " + wordNumber +
                " words in " + Math.round(numSeconds * 100.0) / 100.0 + " seconds ");

        System.out.println("Your overall wpm is " + Math.round(wordNumber / numMinutes));

        System.out.println("You made " + mistakes +
                " mistakes, so your adjusted wpm is " +
                Math.round((wordNumber - mistakes) / numMinutes));


    }


}





