package DataStructure.Java.Inheritance;

interface Multiplication {
    int multiply(int a, int b);

    default int square(int a) {
        return multiply(a, a);
    }
}


public class DefaultMethodOfInterface implements Multiplication {

    public static void main(String[] args) {
        DefaultMethodOfInterface defaultMethodOfInterface = new DefaultMethodOfInterface();
        System.out.println("Multiply = " + defaultMethodOfInterface.multiply(2, 3));
        System.out.println("Square = " + defaultMethodOfInterface.square(2));
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
