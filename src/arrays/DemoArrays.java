package arrays;

public class DemoArrays {

    public void demoIntArray (){

        // SYNTAX of  Array : DataType [] variable_name={,,,};

        int [] marksArray={43,55,33,87,98,67,78,32,41};

        // index 0,1,2,3,4,5,

        System.out.println(marksArray[0]);
        System.out.println(marksArray[1]);
        System.out.println(marksArray[2]);
        System.out.println(marksArray[3]);
        System.out.println(marksArray[4]);

        for (int i=0; i<marksArray.length;i++){

            System.out.println("Inside for Loop "+marksArray[i]);
        }

        // advance for loop
        // SYNTAX : for (DataType var_name : array){
        // }

        for(int var:marksArray){
            System.out.println("INSIDE Advance for loop "+var);
        }
    }

    public void demoStringArray(){
        // SYNTAX of  Array : DataType [] variable_name={,,,};

        String [] nameArray= {"Java","Java8","Spring ","Spring Boot","Cloud"};
        for(String var: nameArray){

            System.out.println("Inside advance for loop Name Array : "+var);
        }

    }
    // Double Salary or price

    public static void main(String[] args) {

        DemoArrays obj= new DemoArrays();
        obj.demoIntArray();
        obj.demoStringArray();
    }
}
