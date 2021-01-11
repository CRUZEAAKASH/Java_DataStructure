package Practise.DataStructure.Strings.Practise.Basics;

public class StringLiteralVsStringNewObject {

    public static void main(String[] args) {
        String s1 = "foobar";
        String s2 = "foobar";

        System.out.println(s1 == s2);      // true.Since both s1 and s2 are in String constant pool

        s2 = new String("foobar");
        System.out.println(s1 == s2);      // false.Since s1 is in String constant pool and s2 is in Heap area
        System.out.println(s1.equals(s2)); // true. Although s1 is in String constant pool and s2 is in Heap area, but here we ae checking by value
                                            // and not be references
    }
}
