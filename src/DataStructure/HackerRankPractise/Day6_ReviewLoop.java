package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day6_ReviewLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberOfTestCases = Integer.parseInt(scanner.nextLine());
        while (NumberOfTestCases-- > 0) {
            String input = scanner.nextLine();
            String even = "";
            String odd = "";
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    even = even + input.charAt(i);
                } else {
                    odd = odd + input.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
