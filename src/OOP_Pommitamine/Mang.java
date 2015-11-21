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
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()) {
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinadid();
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            }else{
                mangija.moodas();
            }
        }
        mangija.gameover();
        meri.kuvaSeis();
    }
}
