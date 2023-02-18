package EVA1_8;

public class EVA1_8_ARREGLOS {


 public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[50];
        int arregloDatos2[] = new int [50];
        //tipoDato[] todos los identificadores son arreglos
        int [] a,b,c,d;
        //tipoDato identificador[], solo el identificador es arreglo
        int w, x[],y,z;
        //-------------------------------------
        System.out.println(arregloDatos);
        String[] arregloCade = new String[50];
        System.out.println(arregloCade);
        
        //legth = cantidad de elementos del arreglo
        
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) (Math.random()*100) ;
        }
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print("["+arregloDatos[i]+"]"); ;
        }
        
        //Para dar error = arregloDatos[50]=100; //Posición incorecta
        
        
    }
    
}