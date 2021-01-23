package DataStructure.Lists.ArrayLists.Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Tom");
        studentList.add("Peter");
        studentList.add("Harry");
        studentList.add("Mark");


        //1. Traditional Iteration Mechanism for loop
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("---------------------------------");

        //2. For Each Loop
        for (String s : studentList) {
            System.out.println(s);
        }

        System.out.println("---------------------------------");

        //3. JDK8 - Using Streams with Lambda
        studentList.stream().forEach(ele -> System.out.println(ele));


        //4. Iterator
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
