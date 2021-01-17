package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day2_Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip_amount = (tip_percent * meal_cost) / 100;
        double tax_amount = (tax_percent * meal_cost) / 100;
        int totalAmount = (int) Math.round((tip_amount + tax_amount + meal_cost));
        System.out.println(totalAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
