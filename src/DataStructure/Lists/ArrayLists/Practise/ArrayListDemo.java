package DataStructure.Lists.ArrayLists.Practise;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();  //Defining type of data which arrayList can end
        arrayList.add(100);
        arrayList.add("Hello");
        arrayList.add(true);
        System.out.println(arrayList);          //Printing whole arrayList
        System.out.println(arrayList.get(2));   //Printing 3rd element of ArrayList
        System.out.println(arrayList.get(-1));  //Will give ArrayIndexOutOfBoundException as Negative indexes are not allowed in ArrayList
    }
}
