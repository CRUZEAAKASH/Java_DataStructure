package DataStructure.Java.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        DataStructure.Java.Singleton.Singleton tmp = DataStructure.Java.Singleton.Singleton.getInstance();
        tmp.demoMethod();
        DataStructure.Java.Singleton.Singleton.demoMethod();
    }
}
