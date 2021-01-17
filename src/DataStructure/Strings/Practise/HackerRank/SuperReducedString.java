//https://www.hackerrank.com/challenges/reduced-string/problem

package DataStructure.Strings.Practise.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (Character character : input.toCharArray()) {
            if (!characterArrayList.isEmpty() && characterArrayList.get(characterArrayList.size() - 1) == character) {
                characterArrayList.remove(characterArrayList.size() - 1);
            } else {
                characterArrayList.add(character);
            }
        }

        if (characterArrayList.size() == 0) {
            System.out.println("Empty String");
        } else {
            StringBuilder stringBuilder = new StringBuilder(characterArrayList.size());
            for (Character character : characterArrayList) {
                stringBuilder.append(character);
            }
            System.out.println(stringBuilder.toString());
        }

    }
}
