package Practise.DataStructure.Java.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance();
        tmp.demoMethod();
        Singleton.demoMethod();
    }
}
