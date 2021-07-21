import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string1 = "Your Digital Career Starts Here";
        System.out.println("string1 = " + string1);
        System.out.println("vowels  = " + countVowels(string1));

        String string2 = "The quick brown fox jumps over the lazy dog";
        System.out.println("\nstring2 = " + string2);
        System.out.println("vowels  = " + countVowels(string2));

        String string3 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr";
        System.out.println("\nstring3 = " + string3);
        System.out.println("vowels  = " + countVowels(string3));
    }

    /**
     * Function that takes a string and returns the number of vowels
     * @param words - a String containing the words
     * @return number of vowels
     */
    public static int countVowels(String words) {
        words = words.toLowerCase();
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            char currentLetter = words.charAt(i);
            // is the current letter a vowel?
            if (vowels.indexOf(currentLetter) > -1) {
                count++;
            }
        }
        return count;
    }
}
