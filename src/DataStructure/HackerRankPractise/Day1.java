package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int secondInt = Integer.parseInt(scanner.nextLine());
        double secondDouble = Double.parseDouble(scanner.nextLine());
        String secondString = scanner.nextLine();

        System.out.println(i + secondInt);
        System.out.println(d + secondDouble);
        System.out.println(s + secondString);
    }
}
