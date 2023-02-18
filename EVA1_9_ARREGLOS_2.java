package EVA1_9;

public class EVA1_9_ARREGLOS_2 {

    public static void main(String[] args) {
     //TODO

     //Arreglo de enteros
        int arregloDatos[] = new int[100000];
        //Para que explote int arregloDatos[] = new int[1000000000];

     //Metodo para llenar de valores aleatorios 
        long ini =System.nanoTime();
        llenarArreglo(arregloDatos);
        long fin = System.nanoTime();
        System.out.println("Tiempo: "+ (fin - ini));
     //Metodo para imprimirlo
        //imprimirArreglo(arregloDatos);
    }

    public static void llenarArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }

    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");;
        }
        System.out.println("");
    }

}