
package EVA1_14;

public class EVA1_14_Recursividad {

    public static void main(String[] args) {
        //recursivo();
        /*for (int i = 10; i >= 1; i--) {
         System.out.println(i + " - ");
         }*/
        falsoFor(10);
        System.out.println("");
        falsoFor2(1, 10);
    }

    private static void recursivo() {
        System.out.println("Hola StackOverflow");
        recursivo();

    }

    public static void falsoFor(int valor) {
        System.out.print(valor + " - ");

        if (valor > 1) {
            falsoFor(valor - 1);
        }
    }

    public static void falsoFor2(int ini, int valor) {

        System.out.print(ini + " - ");

        if (ini < valor) {
            falsoFor2(ini + 1, valor);
        }

    }
}