package EVA1_21_Tiempo;

public class EVA1_21_Tiempo {

    public static void main(String[] args) {
        // TODO
        int arreglo[] = new int[1000];
        //o(n)=736,400
        long ini = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);

        }
        long fin = System.nanoTime();
        System.out.println("Tiempo: " + (fin - ini));

        //O(N^2)= 25,876,100
        ini = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[i] = (int) (Math.random() * 100);
            }

        }
        fin = System.nanoTime();
        System.out.println("Tiempo: " + (fin - ini));

    }

}
