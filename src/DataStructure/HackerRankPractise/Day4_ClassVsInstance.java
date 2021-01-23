package DataStructure.HackerRankPractise;

import java.util.Scanner;

public class Day4_ClassVsInstance {

    private int age;

    public Day4_ClassVsInstance(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_ClassVsInstance p = new Day4_ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    public void amIOld() {
        String toBePrinted;
        if (age < 13) {
            toBePrinted = "You are young.";
        } else if (age < 18) {
            toBePrinted = "You are a teenager.";
        } else {
            toBePrinted = "You are old.";
        }
        System.out.println(toBePrinted);
    }

    public void yearPasses() {
        age = age + 1;
    }
}
