
package EVA1_5;

public class EVA1_5_Borrar_Objetos {

    public static void main(String[] args) {
        Read r = new Read();
        System.out.println(r);
        r = null;
        System.out.println(r);
    }

}

class Read {}