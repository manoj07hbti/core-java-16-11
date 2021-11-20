package loops;

public class DemoForLoop {

    public static void main(String[] args) {


        //SYNTAX : increment for loop
        // for (int i=initial_value; condition ; increment){ CODE }

        for(int i=0; i<5; i++) {
            System.out.println("Hello Increment for Loop " +i);
        }

        //SYNTAX : increment for loop
        // for (int i=initial_value; condition ; decrement){ CODE }

        for (int i=5; i>0; i--){

            System.out.println("Hello Decrement for Loop " +i);
        }
    }
}
