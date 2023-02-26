package EVA1_18_NUmerosPrimos;

public class EVA1_18_NumerosPrimos {

	public static void main(String[] args) {

		long ini = System.nanoTime();
		System.out.println("1,000,000,019: " + calcularEsPriInef(1000000019));
		long fin = System.nanoTime();
		System.out.println("Tiempo ineficiente: " + (fin - ini));
		ini = System.nanoTime();
		System.out.println("1,000,000,019: " + calcularEsPriEfi(1000000019));
		;
		fin = System.nanoTime();
		System.out.println("Tiempo eficiente: " + (fin - ini));
		//
	}

	// ineficiente
	public static boolean calcularEsPriInef(int nume) {
		boolean resu = true;
		for (int i = 2; i < nume; i++) {
			int resi = nume % i;
			if (resi == 0) {
				resu = false;// No es primo
				break;
			}
		}
		return resu;
	}

	// eficiente
	public static boolean calcularEsPriEfi(int nume) {
		boolean resu = true;
		int fin = (int) Math.sqrt(nume);
		for (int i = 2; i < fin; i++) {
			int resi = nume % i;
			if (resi == 0) {
				resu = false;// No es primo
				break;
			}
		}
		return resu;
	}
}