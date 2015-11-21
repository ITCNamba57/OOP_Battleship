package OOP_Pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by abogdan on 21.11.15.
 */
public class Laev {
    private int[] koordinaadid;
    private boolean pihtaSaanud = false;

    public Laev(int mereServaPikkus) {
        System.out.println("START LAEV");
        genereeriKordinaadid(mereServaPikkus);
    }

    private void genereeriKordinaadid(int mereServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(mereServaPikkus);
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[]{x,y};
        System.out.println(Arrays.toString(koordinaadid));
    }
}
