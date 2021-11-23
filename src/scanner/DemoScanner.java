package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // SYNTAX: ClassName objName= new ClassName();

        Scanner obj= new Scanner(System.in); // create object of scanner class

        System.out.println("Please Enter your Name : ");

        String name = obj.nextLine();//Reads  String input

        System.out.println("You have enters : " +name);

        System.out.println("Please enter your age :");
        int age=obj.nextInt(); // reads integer value

        System.out.println("You have entered Age as : " +age);

        System.out.println("Please Enter your  salary");
        double salary = obj.nextDouble();
        System.out.println("You have entered Salary as : " + salary);

    }
}
