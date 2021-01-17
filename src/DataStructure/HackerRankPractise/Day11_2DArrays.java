package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day11_2DArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                sum = 0;
                sum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }

        }

        System.out.println(max);
        scanner.close();
    }
}
