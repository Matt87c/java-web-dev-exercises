package exercises;

import java.util.Scanner;

public class Alice {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word to search for in the string:");
        String search = input.nextLine();

        if (alice.contains(search)) {

            System.out.println("Index of the word: " + alice.indexOf(search));
            System.out.println("Length of the word: " + search.length());

            alice = alice.substring (0, alice.indexOf(search)) + alice.substring((alice.indexOf(search)+search.length()+1), alice.length());

            System.out.println ("New string: ");
            System.out.println (alice);

        }

        else {

            System.out.println ("The word was NOT in the string.");

        }

    }

}