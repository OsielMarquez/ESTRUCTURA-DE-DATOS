
package EVA1_10_Matrices ;

public class EVA1_10_Matrices {

		 public static void main(String[] args) {
	            // TODO code application logic here

	            int[][] matrizDatos = new int[3][4];
	//llenar con numeros aleatorios
	//primer cilo primer dimension filas
	            for (int i = 0; i < matrizDatos.length; i++) {
	                for (int j = 0; j < matrizDatos[i].length; j++) { // 2da dimension (columnas)
	                    matrizDatos[i][j] = (int) (Math.random() * 100);
	                }
	            }
	            for (int i = 0; i < matrizDatos.length; i++) {//filas
	                for (int j = 0; j < matrizDatos[i].length; j++) {//2da dim
	                    System.out.print("[" + matrizDatos[i][j] + "]");

	                }
	                System.out.println("");
	            }
	        }

	    }