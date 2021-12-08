package collections;

import java.util.HashSet;

public class HashSetDemo {

    public void demoString(){
        //  Collection <Datatype> objName= new Collection();

        HashSet <String > course= new HashSet<>();

        course.add("Java");
        course.add("Java");
        course.add("Spring");
        course.add("Spring boot");
        course.add("Spring boot");
        course.add("Spring boot");
        course.add("Cloud and Microserivce");


        for (String var: course){

            System.out.println("inside for Loop..." +var);
        }
    }

    public void demoInteger(){
        //  Collection <Datatype> objName= new Collection();

        HashSet <Integer > roll_number= new HashSet<>();

        roll_number.add(23);
        roll_number.add(32);
        roll_number.add(5);
        roll_number.add(5);
        roll_number.add(33);
        roll_number.add(33);
        roll_number.add(23);


        for (Integer var: roll_number){

            System.out.println("inside for Loop..." +var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo obj= new HashSetDemo();
        obj.demoString();
        obj.demoInteger();
    }
}
