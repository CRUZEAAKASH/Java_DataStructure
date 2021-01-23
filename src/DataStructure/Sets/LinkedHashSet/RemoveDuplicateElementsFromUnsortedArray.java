package DataStructure.Sets.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementsFromUnsortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 3, 4, 4, 5, 6, 3, 5, 7, 8, 0, 1, 4, 7, 9, 0};

        //If you want to preserve the insertion order
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        for (int temp : arr) {
            integerLinkedHashSet.add(temp);
        }
        System.out.println(integerLinkedHashSet);

        //If you do not want to preserve the insertion order, than use only Set
        HashSet<Integer> integerSet = new HashSet<>();
        for (int temp : arr) {
            integerSet.add(temp);
        }
        System.out.println(integerSet);
    }
}
