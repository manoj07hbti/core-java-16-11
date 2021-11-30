package class_and_object;

public class MethodDay2 {

     /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */


     public int addition (){

         int a=6;
         int b=7;

         int result =a+b;
        // System.out.println("Addition is "+result);

         return result;
     }

     // message :  // Syntax : access_specifier return_type  method_name (parameter) {}

    public String message(){

         String msg="Welcome to Java ";

         return msg;
    }

    // getPrice

    public double getPrice(){

         double price=232.5;

        return price;
    }

    public static void main(String[] args) {
        MethodDay2 obj= new MethodDay2();

      int sum=  obj.addition();

      System.out.println("Addition is "+sum);

      String output= obj.message();

      System.out.println("Message is "+output);

      double var=obj.getPrice();

        System.out.println("Price is "+var);
    }

}
