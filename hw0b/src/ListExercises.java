import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sumOfList = 0;
        for (int i : L) {
            sumOfList += i;
        }
        return sumOfList;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> L2 = new ArrayList<>();
        for (int i :L) {
            if (i % 2 == 0) {
                L2.add(i);
            }
        }
        return L2;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commonList = new ArrayList<>();
        for (int i:L1) {
            if (L2.contains(i)) {
                commonList.add(i);
            }
        }
        return commonList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int occur = 0;
        for (String s:words) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    occur++;
                }
            }
        }
        return occur;
    }
}
