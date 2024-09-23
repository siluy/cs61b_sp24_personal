import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        int n = L.size();
        for (int i = 0; i < n; i++) {
            sum += L.get(i);
        }
        // TODO: Fill in this function.
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evens = new ArrayList<Integer>();
        int n = L.size();
        for (int i = 0; i < n; i++) {
            if ((L.get(i) % 2) == 0) {
                evens.add(L.get(i));
            }
        }
        return evens;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> common = new ArrayList<Integer>();
        for (int i : L1){
            for (int j : L2){
                if (i == j) {
                    common.add(i);
                }
            }
        }
        return common;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String i : words){
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
