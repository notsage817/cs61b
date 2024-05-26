import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> letterToNumMap = new HashMap<>();
        int n = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            letterToNumMap.put(c, n);
            n++;
        }
        return letterToNumMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> squareMap = new HashMap<>();
        for (int i:nums) {
            squareMap.put(i, i*i);
        }
        return squareMap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> countWords = new HashMap<>();
        for (String word:words) {
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        return countWords;
    }
}
