package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day3_Conditional_Statements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String toBePrinted = "";
        if (N % 2 != 0) {
            toBePrinted = "Weird";
        } else {
            if (N <= 5) {
                toBePrinted = "Not Weird";
            } else if (N <= 20) {
                toBePrinted = "Weird";
            } else {
                toBePrinted = "Not Weird";
            }
        }
        System.out.println(toBePrinted);
        scanner.close();
    }
}
