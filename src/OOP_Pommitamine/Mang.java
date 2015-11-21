package OOP_Pommitamine;

/**
 * Mere ja laevastiku genereerimine
 * Kui laevu on elus
 *      Kysi kasutajat koordinaadid
 *      Pommita merd
 *      Anna tagasisidet
 * Mang on labi
 */
public class Mang {
    public Mang() {
        System.out.println("START MANG");
        Meri meri = new Meri(10);

        while (meri.kasOnLaevuElus()) {
            System.out.println("NEXT ROUND");
        }
    }
}
