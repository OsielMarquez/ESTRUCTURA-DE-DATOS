package EVA1_13;
import java.util.Scanner;

public class Eva1_13_Capturar_Califas {

    public static void main(String[] args) {

        int arreCalifas[][][];
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos grupos existen?");

        int grupos = input.nextInt();
        arreCalifas = new int[grupos][][];

//-----
        for (int i = 0; i < arreCalifas.length; i++) {
//por  cada grupo, preguntar cuantos alumnos tiene
            System.out.println("Cuantos alumnos tiene el grupo " + i);
            int noAlumnos = input.nextInt();
            arreCalifas[i] = new int[noAlumnos][];

            //alumnos
            for (int j = 0; j < arreCalifas[i].length; j++) {
                System.out.println("Cuants materias tiene el alumno " + j);

                int noMaterias = input.nextInt();
                arreCalifas[i][j] = new int[noMaterias];
//califa

                for (int k = 0; k < arreCalifas[i][j].length; k++) {
                    System.out.println("Calificaciones de materia " + k);
                    int califa = input.nextInt();
                    arreCalifas[i][j][k] = califa;
                }

            }
        }

        for (int i = 0; i < arreCalifas.length; i++) {
            System.out.println("Grupo " + i);
            for (int j = 0; j < arreCalifas[i].length; j++) {
                System.out.print("Estudiante " + j + " : ");
                for (int k = 0; k < arreCalifas[i][j].length; k++) {
                    System.out.print("[" + arreCalifas[i][j][k] + "]");
                }
                System.out.println("");
            }

        }
    }
}