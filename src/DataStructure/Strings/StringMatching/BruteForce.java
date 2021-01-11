package Practise.DataStructure.Strings.StringMatching;

public class BruteForce {

    public static int bruteForceApproach(int[] T, int n, int[] P, int m) {
        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && P[j] == T[i + j]) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] T = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] P = new int[]{4, 5, 6, 700};
        System.out.println("Pattern matches at " + bruteForceApproach(T, T.length, P, P.length) + " th position");
    }
}
