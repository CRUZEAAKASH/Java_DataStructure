package DataStructure.Strings.Practise.HackerRank;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(++count);
    }
}
