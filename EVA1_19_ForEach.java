
package EVA1_19_ForEach;

public class EVA1_19_ForEach {

	public static void main(String[] args) {
		// for each para cada
		int[] arreglo = new int[20];

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 100);
		}
		// imprimir for each
		// for (tipo de dato del arreglo variable: arreglo)

		for (int a : arreglo) {
			System.out.print("[" + a + "]");
		}

		String[] arregloStr = new String[20];

		for (String a : arregloStr) {

		}

	}
}