package collections;

import model.Employee;

import java.util.HashSet;

public class SetWithEmployee
{

    public static void main(String[] args) {

        HashSet<Employee> set= new HashSet<>();

        set.add(new Employee(23,"Test","Test1"));
        set.add(new Employee(23,"Test","Test2"));
        set.add(new Employee(24,"Test","Test3"));

        for (Employee var: set){
            System.out.println(var.getEmp_name());
        }
    }
}
