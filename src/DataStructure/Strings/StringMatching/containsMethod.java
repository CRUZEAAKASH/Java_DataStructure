package Practise.DataStructure.Strings.StringMatching;

public class containsMethod {
    public static void main(String args[]) {
        String text = "Aakash";
        String pattern = "Aa";
        System.out.println("pattern contains in String = " + containsMethodCheck(text, pattern));
    }

    public static Boolean containsMethodCheck(String T, String P) {
        return T.contains(P);
    }
}
