package class_and_object;

import java.util.Scanner;

public class CalculatorApp {

    public int addition (int a, int b){

        int result=a+b;

        return result;
    }


    public int subtration (int a, int b){

        int result=a-b;

        return result;
    }

    public int multi (int a, int b){

        int result=a*b;

        return result;
    }

    public int divide (int a, int b){

        int result=a*b;

        return result;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please Enter Your Choice : 1-Addition, 2- Subtraction , 3- Multi and 4 Divide");

        int choice= myObj.nextInt();

        System.out.println("Please enter value os fist input number a: ");
        int a= myObj.nextInt();
        System.out.println("Please enter value os fist input number b: ");
        int b= myObj.nextInt();

        CalculatorApp obj= new CalculatorApp();
        int output=0;

        if (choice==1){

            // call addition

             output= obj.addition(a,b);
        }
        else if (choice ==2){
            // call sub
            output=  obj.subtration(a,b);
        }
        else if (choice==3){
            // call mult
            output=  obj.multi(a,b);
        }
        else {
            //call divide
            output= obj.divide(a,b);
        }

        System.out.println("result of given input is "+output);

    }
}
