package org.launchcode.java.studios.countingcharacters;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Countingcharacters {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/input.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(input);
        } catch (FileNotFoundException error) {
            System.err.println(error);
            System.exit(1);
        }

        String text = "";

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            text += line + "\n";
        }

        HashMap<Character, Integer> occurences = new HashMap();

        for (char character: text.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                if (occurences.get(character) != null) {
                    occurences.put(character, occurences.get(character) + 1);
                } else {
                    occurences.put(character, 1);
                }
            }
        }

        System.out.println(occurences.toString());

    }
}
