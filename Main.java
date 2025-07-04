package practice;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toLowerCase();

        // Array to mark presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];

        // Marking letters present in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check and print missing letters
        boolean allPresent = true;
        System.out.print("Missing alphabets: ");
        for (int i = 0; i < 26; i++) {
            if (!alphabetPresent[i]) {
                System.out.print((char) (i + 'a') + " ");
                allPresent = false;
            }
        }

        if (allPresent) {
            System.out.println("None (It's a pangram)");
        }
    }
}
