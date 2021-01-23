package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day16_Exceptions_StringToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int output = Integer.parseInt(input);
            System.out.println(output);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }
    }
}
