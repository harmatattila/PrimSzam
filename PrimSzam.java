public class PrimSzam {

    public static void main(String[] args) {
        System.out.println("Teszt kiírás");
        //System.out.println("Parameter: " + args[0]);
        int kapott = Integer.parseInt(args[0]);
        //int kapott = 23;
        System.out.println("Kapott szám: " + kapott);
        boolean igaze = primE(kapott);
        System.out.println("Igaze: " + igaze);

        if (primE(kapott)) {
            System.out.println(kapott + " szám " + "prím.");
        } else {
            System.out.println(kapott + " szám " + "nem prím.");
        }
    }

    static boolean primE(int kapott) {
        for (int i = 2; 2 * i < kapott; i++) {
            if (kapott % i == 0) {
                return false;
            }
        }
        return true;

    }
}
