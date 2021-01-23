package DataStructure.Lists.ArrayLists.Practise;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {

    public static void main(String[] args) {
        ArrayList<Object> arrayList1 = new ArrayList<>();   //In this case, virtual capacity is 10(default value).

        //To increase the virtual capacity, we can define the capacity of ArrayList
        ArrayList<Object> arrayList2 = new ArrayList<>(20);
    }
}
