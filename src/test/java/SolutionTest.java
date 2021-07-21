import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void countVowels_1() {
        String sentence = "Your Digital Career Starts Here";
        int vowels = Solution.countVowels(sentence);
        assertTrue(vowels == 11);
    }

    @Test
    void countVowels_2() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        int vowels = Solution.countVowels(sentence);
        assertTrue(vowels == 11);
    }

    @Test
    void countVowels_3() {
        String sentence = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr";
        int vowels = Solution.countVowels(sentence);
        assertTrue(vowels == 18);
    }

}