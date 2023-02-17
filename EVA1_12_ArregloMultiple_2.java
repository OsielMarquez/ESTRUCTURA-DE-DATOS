package EVA1_12;
import java.util.Scanner;

public class EVA1_12_ArregloMultiple_2 {

    public static void main(String[] args) {
        // TODO code application logic here
/*
         int arregloMulti[][] = new int[3][];
         //grupo 1: 40
         arregloMulti[0] = new int[40];
         //grupo 2: 10
         arregloMulti[1] = new int[10];
         //grupo 3: 25
         arregloMulti[2] = new int[25];
         */

        //Capturar la cantidad de grupos
        //Por cada grupo, capturar calificaciones
        int arreGpos[][];
        Scanner input = new Scanner(System.in);
        //Solicitar la cantidad de grupos
        System.out.println("Introduce la cantidad de grupos: ");
        int grupos = input.nextInt();
        arreGpos = new int[grupos][];//Declarando un arreglo de arreglos
        //Llenar los datos
        for (int i = 0; i < arreGpos.length; i++) {
            System.out.println("Grupo " + i);
            System.out.println("¿Cuátos estudiantes tiene?");
            int estu = input.nextInt();
            arreGpos[i] = new int[estu];
            for (int j = 0; j < arreGpos[i].length; j++) {
                System.out.println("Estudiante: " + j);
                System.out.println("Calificacion: ");
                int califa = input.nextInt();
                arreGpos[i][j] = califa;
            }
        }
        for (int i = 0; i < arreGpos.length; i++) {//filas
            for (int j = 0; j < arreGpos[i].length; j++) {//2da dim
                System.out.print("[" + arreGpos[i][j] + "]");

            }
            System.out.println("");
        }
    }
}
