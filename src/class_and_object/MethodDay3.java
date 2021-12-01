package class_and_object;

public class MethodDay3 {

    // Syntax : access_specifier return_type  method_name (parameter) {}

    //parameter : (Datatype variable_name1,Datatype variable_name2)

    public String m1(String name){

        System.out.println("This is M1 method..."+name);

        return name;
    }

    public void m2(int age){

        System.out.println("This is M2 method..."+age);
    }

    public void m3(int a , String b){

        System.out.println("This is M3 method..."+a +" "+b);
    }

    public static void main(String[] args) {

        MethodDay3 obj=new MethodDay3();

        String var=obj.m1("Java");
        System.out.println("output is "+var);
        obj.m2(23);

        obj.m3(33,"Spring");
    }
}
