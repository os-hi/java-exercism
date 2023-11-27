package Acronym;

import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String phrase = reader.nextLine();

        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z0-9\\s-]", "");
        String[] words = cleanedPhrase.split("[\\s-]");

        StringBuilder acronymBuilder = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                acronymBuilder.append(word.charAt(0));
            }
        }
        System.out.println(acronymBuilder);
    }
}
