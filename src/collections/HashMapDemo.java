package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //Syntax : HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <Integer, String> course= new HashMap<>();

        // add

        course.put(1,"Java");
        course.put(2,"Spring");
        course.put(3,"Spring Boot");
        course.put(4,"Microservice and Cloud");


        //get / read
        System.out.println(course.get(3));
        System.out.println(course.get(2));
        System.out.println(course.get(1));

        // iterate hashMap

     for (Map.Entry<Integer, String> var: course.entrySet()){

         System.out.println(var.getValue());
     }

     // Java 8

        course.forEach((k,v)->System.out.println("Using Lambda Key " +k +" and Value "+v ));

    }
}
