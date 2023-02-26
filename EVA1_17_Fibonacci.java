package EVA1_17_Fibonacci;
public class EVA1_17_Fibonacci {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println(fibonacci(6));
	}

	public static int fibonacci(int posi) {
		if (posi == 1) {
			return 1;
		} else if (posi == 0) {
			return 1;
		} else {
			return fibonacci(posi - 1) + fibonacci(posi - 2);

		}
	}
}
