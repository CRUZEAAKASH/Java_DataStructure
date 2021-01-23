package DataStructure.HackerRankPractise;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] arr){
        this.elements = arr;
    }

    public void computeDifference(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : elements){
            if(i<min)
                min = i;
            if(i>max)
                max=i;
            maximumDifference = max-min;
        }
    }

    // Add your code here

}

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
