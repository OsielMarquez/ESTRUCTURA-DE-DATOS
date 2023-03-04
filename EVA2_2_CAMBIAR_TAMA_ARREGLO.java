package EVA2_2;

public class EVA2_2_CAMBIAR_TAMA_ARREGLO {

	public static void main(String[] args) {
		int[] arreglo = new int[1];

//Este for simula los clientes
//Cada ciclio es un cliente nuevo
//Cada ciclo incrementa el tamaño del arreglo en 1
//O(N*N)
		for (int i = 1; i < 100000; i++) {

			int[] copia = CambiarTama(arreglo, i);
//Guardar el los datos del cliente
			copia[i - 1] = (int) (Math.random() * 100);
			arreglo = copia;
		}
	}

//copiamos lo del codigo anterior
	public static int[] CambiarTama(int[] arreglo, int tama) {
		// Crear la copia
		int[] copia = new int[tama];
		for (int i = 0; i < copia.length; i++) {
			if (i < arreglo.length) {
				copia[i] = arreglo[i];
			}
		}
		return copia;
	}
}