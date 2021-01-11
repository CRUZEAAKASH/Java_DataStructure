package Practise.DataStructure.Strings.Practise.HackerEarth;

import java.util.Arrays;

public class SortStringInDefinedRange {

    public static void sortStringInDefinedRange(String pattern, int startIndex, int endIndex) {
        char[] arr = pattern.toCharArray();
        char[] toBeReverse = new char[endIndex - startIndex + 1];
        Arrays.sort(toBeReverse);
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            toBeReverse[j++] = arr[i];
        }
        // toBeReverse = sortInDescendingOrder(toBeReverse);
        for (int i = 0; i < startIndex; i++) {
            System.out.print(arr[i]);
        }
        for (int i = toBeReverse.length - 1; i >= 0; i--) {
            System.out.print(toBeReverse[i]);
        }
        for (int i = endIndex + 1; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        sortStringInDefinedRange("hello", 1, 3);
    }
}
