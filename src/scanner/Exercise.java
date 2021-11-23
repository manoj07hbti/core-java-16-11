package scanner;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in); // create object of scanner class
        System.out.println("Please enter number : ");

        int number=obj.nextInt();

        if (number%2==0){
            System.out.println("Number is even number "+number);
        }
        else
        {
            System.out.println("Number is NOT even number "+number);
        }

    }

}
