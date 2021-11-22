package loops;

public class WhileLoop {

    public static void main(String[] args) {

        // SYNTAX : while(condition) { CODE increment/decrement }

      int i=0;

      while (i<5){
          System.out.println("Hello Java increment " +i);
          i++;
      }
      // i=5
        while (i>0){
            System.out.println("Hello Java decrement " +i);
            i--;
        }

      /* SYNTAX :do {CODE inc/dec}
                 while (condition);*/
      int j=0;
      do {
          System.out.println("Hello Java in Do while INC " +j);
          j++;
      }
      while (j<5);
     // j=5
        do {
            System.out.println("Hello Java in Do while DEC " +j);
            j--;
        }
        while (j>0);


     // INFINITE LOOP
/*

     while(true){

         System.out.println("INFINITE LOOP");
     }
*/

    }
}
