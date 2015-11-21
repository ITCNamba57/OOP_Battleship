package OOP_Pommitamine;

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
        }
        return false;
    }
}
