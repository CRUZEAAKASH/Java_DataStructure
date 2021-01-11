package Practise.DataStructure.Java.Inheritance;

class Animal {
    public void foo() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    public void foo() { // overrides Animal.foo()
        System.out.println("Cat");
    }

    public void hello() {
        System.out.println("Hello");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Cat();
        Cat c = new Cat();
        Animal d = null;

        a.foo(); // prints Animal
        b.foo(); // prints Cat
        c.foo(); // prints Cat
        //d.foo(); // throws NullPointerException

        c.hello(); // prints hello
        //a.hello(); //Compile Time Error. java: cannot find symbol
    }
}
