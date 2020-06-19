package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print ("Enter word length: ");
        int wordLength = input.nextInt();

        input.close();

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(4.0);
        numbers.add(8.0);
        numbers.add(16.0);
        numbers.add(32.0);
        numbers.add(64.0);
        numbers.add(126.0);
        numbers.add(255.0);
        numbers.add(53.0);

        System.out.println (sum(numbers));

        ArrayList<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("Mandalorian");
        words.add("Jackson");
        words.add("Woody");
        words.add("Deadpool");

        ArrayList<String> fiveLetterWords = fiveLetter(words, wordLength);

        for (String word: fiveLetterWords) {

            System.out.println(word);

        }



    }

    static double sum (ArrayList<Double> numberArray) {

        double numberSum = 0;

        for (double number: numberArray) {

            if (number%2 == 0) {

                numberSum += number;

            }

        }

        return numberSum;

    }

    static ArrayList<String> fiveLetter (ArrayList<String> stringArray, int length) {

        ArrayList<String> five = new ArrayList<>();

        for (String word: stringArray) {

            if (word.length() == length) {

                five.add(word);

            }

        }

        return five;

    }

}