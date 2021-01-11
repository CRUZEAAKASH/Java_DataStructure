package Practise.DataStructure.Java.Inheritance;

class Parent {
    public static void foo() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    public static void foo() {  // hides Animal.foo()
        System.out.println("child");
    }
}

public class MethodHiding {

    public static void main(String[] args) {
        Parent.foo();   //prints parent
        Child.foo();    //prints child

        Parent a = new Parent();
        Parent b = new Child();
        Child c = new Child();
        Parent d = null;

        a.foo();    // static methods should not be called from object. Prints parent because the declared type of a is parent
        b.foo();    // static methods should not be called from object. Prints parent because the declared type of b is parent
        c.foo();    // static methods should not be called from object. Prints Child because the declared type of c is Child
        d.foo();    // static methods should not be called from object. Prints parent because the declared type of d is parent


    }
}
