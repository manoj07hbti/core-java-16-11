package class_and_object;

public class Calculator {

    // add , sub a-b , mul a*b and div a/b


    public int add (){

        int a=6;
        int b=7;

        int result =a+b;
        // System.out.println("Addition is "+result);

        return result;
    }

    public int addWithInput (int a, int b){


        int result =a+b;
        // System.out.println("Addition is "+result);

        return result;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();

      int result=  calculator.addWithInput(13,6);

      System.out.println("Addition is "+result);

    }
}
