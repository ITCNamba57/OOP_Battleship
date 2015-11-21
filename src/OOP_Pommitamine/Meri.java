package OOP_Pommitamine;

import java.util.Arrays;

/**
 * Created by abogdan on 21.11.15.
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];


    public Meri(int pikkus) {
        System.out.println("START MERI");
        mereServaPikkus = pikkus;
        looLaevastik();

    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);
        }
    }

    public boolean kasOnLaevuElus() {
        for (Laev laev : laevastik) {
            boolean elus = laev.kasOledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasSaidPihta(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaSeis() {
        char[][] laud = new char[mereServaPikkus][mereServaPikkus];
        for (int i = 0; i < mereServaPikkus; i++) {
            for (int j = 0; j < mereServaPikkus; j++) {
                laud[i][j] = ' ';
            }
        }
        for (Laev laev : laevastik) {
            int[] koordinaadid = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            int x = koordinaadid[0];
            int y = koordinaadid[1];
            if (elus){
                laud[x][y] = 'O';
            } else {
                laud[x][y] = 'X';
            }

        }
        System.out.println("  0  1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < laud.length; i++) {
            System.out.println(i + Arrays.toString(laud[i]));
        }
    }
}
