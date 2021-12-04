package collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public void demo (){

        // Collection objName= new Collection();

        ArrayList arrayList= new ArrayList();

     arrayList.add("Java");// index 0
     arrayList.add("Spring Boot");// index 1
     arrayList.add("Spring");// index 2
     arrayList.add(5);//index 3
     arrayList.add("Cloud"); // index 4

     System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList.get(0));

        // advance for loop for (Datatype var: array/collection){CODE}

        for (Object var : arrayList){

            System.out.println("inside advance for loop " +var);
        }
    }

    // GENERICS

    public void demoWithGenerics(){

        //  Collection <Datatype> objName= new Collection();
        ArrayList <String> arrayList= new ArrayList();
        arrayList.add("Java");// index 0
        arrayList.add("Spring Boot");// index 1
        arrayList.add("Spring");// index 2
        arrayList.add("Cloud"); // index 3

        for (String var : arrayList){

            System.out.println("inside demoWithGenerics advance for loop " +var);
        }

        ArrayList <Integer> marksList= new ArrayList();
        marksList.add(45);
        marksList.add(65);
        marksList.add(75);

        for (Integer var : marksList){

            System.out.println("inside demoWithGenerics advance for loop for marksList " +var);
        }

    }

    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.demo();

        obj.demoWithGenerics();

    }
}
