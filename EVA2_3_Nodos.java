package EVA2_3;

public class EVA2_3_Nodos {

	public static void main(String[] args) {
		// TODO code application logic here

		Nodo nodo = new Nodo();
		nodo.valor = 100;
		nodo.sig = new Nodo();
		nodo.sig.valor = 200;
		nodo.sig.sig = new Nodo();
		nodo.sig.sig.valor = 300;

		/*
		 * System.out.print("[" + nodo.valor + "]"); System.out.print("[" +
		 * nodo.sig.valor + "]"); System.out.print("[" + nodo.sig.sig.valor + "]");
		 */

		Nodo temp = nodo;

		while (temp != null) {
			System.out.println("[" + temp.valor + "]");
			temp = temp.sig;
		}
	}
}

class Nodo {

	public int valor;
	public Nodo sig;

	public Nodo() {
		sig = null;
	}
}