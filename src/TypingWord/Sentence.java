package TypingWord;

import java.util.Random;

public class Sentence {

    public Sentence() {

    }

    public String[] phrases() {
        return new String[]{"Four Khoury faculty awarded Global Resilience Institute grants. ",
                "Tired of being manipulated by fake news? ",
                "One computer scientist’s strategies to improve data visualizations ",
                "Now more than ever, computer science is everywhere.",
                "Prof. Manferdelli has been recognized for his work on the DSB.",
                "The work of the Defense Science Board has led to effective actions.",
                "Please take your dog, Cali, out for a walk; she needs exercise!",
                "What a beautiful day it is on the beach, here in sunny Hawaii.",
                "Dr. Quinfrey, a renowned scientist, made an invisibility machine.",
                "why are all those chemicals are so hazardous to the environment?",
                "The two kids collected twigs outside in the freezing cold!",
                "How many times have I told you? NEVER look at your race photos.",
                "Didn\"t see a moose, though. Come on, Maine.",
                "Yo minneapolis is cold",
                "Amazingly few discotheques provide jukeboxes!",
                "Jovial Debra Frantz swims quickly with grace and expertise.",
                "Six crazy kings vowed to abolish my quite pitiful jousts.",
                "Rex enjoys playing with farm ducks by the quiet lazy river?",
                "The five boxing wizards jumped quickly!",
                "The 116 saved 49 size 64 items for 26 friends going May 3",
                "Send 99 people to do 8 sets of 150 shows.",
                "The new school holds 3092 students; the older one, 568 more.",
                "He has seat 459 in car 985 of train 78, which is now at gate 31.",
                "The 36 men won 663 prizes in 52 games and 57 in 129 others."};
    }


    public String selectSentence() {
//      Random string from string array
        Random random = new Random();
        return phrases()[random.nextInt(phrases().length)];

    }

    public int countWords(String phrase) {
        String[] words = phrase.split(" ");
        return words.length;

    }

    public int countMismatches(String phrasesOne, String phrasesTwo) {
        String[] listOne = phrasesOne.split(" ");
        String[] listTwo = phrasesTwo.split(" ");
        int min_length = Math.min(listOne.length, listTwo.length);

        int errors = 0;
        for (int i = 0; i < min_length; i++) {
            if (listOne[i] != listTwo[i]) {
                errors += 1;
            }
        }

        errors += Math.abs(listOne.length - listTwo.length);

        return errors;


    }

}

