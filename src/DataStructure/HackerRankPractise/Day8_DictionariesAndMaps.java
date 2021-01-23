package DataStructure.HackerRankPractise;

import java.util.HashMap;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                phoneBook.get(s);
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
