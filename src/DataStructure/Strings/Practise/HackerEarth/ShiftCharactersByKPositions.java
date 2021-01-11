package Practise.DataStructure.Strings.Practise.HackerEarth;

public class ShiftCharactersByKPositions {

    public static void shiftStringByKCharacters(String string, int K) {
        char[] arr = string.toCharArray();
        char[] shiftedArray = new char[arr.length];
        String shiftedString = "";
        for (int i = 0; i < arr.length; i++) {
            int index = (i + K) % arr.length;
            shiftedArray[index] = arr[i];
        }
        shiftedString = String.valueOf(shiftedArray);
        System.out.println(shiftedString);
    }

    public static void main(String[] args) {
        shiftStringByKCharacters("hello", 5);
    }
}
