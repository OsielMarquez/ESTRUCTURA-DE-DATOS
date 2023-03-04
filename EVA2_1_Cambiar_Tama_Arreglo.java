package EVA2_1;

public class EVA2_1_Cambiar_Tama_Arreglo {

	public static void main(String[] args) {
		// TODO code application logic here

		int[] arreglo = new int[3];
		arreglo[0] = 111;
		arreglo[1] = 222;
		arreglo[2] = 333;
		// Expondir el arreglo a tamaño 10
		int[] copia = CambiarTama(arreglo, 2);
		for (int valor : copia) {// for each
			System.out.println("[" + valor + "]");
		}
		/*
		 * int[] copia = Arrays.copyOf(arreglo, 10);
		 * 
		 * for (int valor : copia) { System.out.print("[" + valor + "]"); }
		 */
//Recordatorio, no se puede usr las utilerias del lenguaje

	}

	public static int[] CambiarTama(int[] arreglo, int tama) {
		// Crear la copia
		int[] copia = new int[tama];
		for (int i = 0; i < copia.length; i++) {
			if (i < arreglo.length)
				copia[i] = arreglo[i];
		}
		return copia;
	}
}