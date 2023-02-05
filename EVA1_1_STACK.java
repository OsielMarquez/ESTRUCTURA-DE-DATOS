package eva1_1_stack;

/**
 *
 * @author Osiel Isaac Marquez Aguilar
 */
public class EVA1_1_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        System.out.println("Inicia Main");
         A();   
         System.out.println("Termina Main"); 
    }
       public static void A(){
           System.out.println("Inicia A");
          
           B();
           System.out.println("Termina A");
      }
      public static void B(){
          System.out.println("Inicia B");
          int x = 100;
          double y =100.0;
          System.out.println("Termina B");
      }  
}