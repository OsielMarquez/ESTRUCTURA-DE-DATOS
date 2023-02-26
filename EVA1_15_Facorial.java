package EVA1_15_Factorial;

public class EVA15Facorial {

    public static void main(String[] args) {

        
        System.out.println(factorial(12));
    }

    public static int factorial(int nume) {
        if (nume > 0) {
            return nume * factorial(nume - 1);
        } else {
            return 1;
        }
    }
}

