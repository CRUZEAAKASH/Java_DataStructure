package DataStructure.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("USA", "Washington");   //stores key-value pair
        hashMap.put("India", "Delhi");      //stores key-value pair
        hashMap.put("UK", "London");        //stores key-value pair
        hashMap.put("UK", null);            //Key is duplicate, hence latest value(null) will be stored.
        hashMap.put(null, "Berlin");         //Null key is allowed

        //Iterator : Over set pair : by for each
        hashMap.forEach((k, v) -> {
            System.out.println("Key = " + k);
            System.out.println("Value = " + v);
        });

        //Iterator : Over the set pair : by using entrySet
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
        }


        // Iterator : over the keys : by using keySet()
        Iterator<String> iterator1 = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator1.next();       //To get the keys
            String value = hashMap.get(key);
            System.out.println("Key = " + key + " and value = " + value);
        }


    }
}
