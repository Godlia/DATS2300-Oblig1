
import java.util.NoSuchElementException;

public class Oblig1 {
    public static int gruppeMedlemmer() {
        return 1;
    }

    public static int maks(int[] a) {
        int antallOmbytt = 0;
        // Guard clause for array
        if (a.length <= 1)
            throw new NoSuchElementException("Array er for liten");

        for (int i = 0; i < a.length; i++) {
            if ((i + 1) < a.length && a[i] > a[i + 1]) {
                antallOmbytt++;
                FunctionLib.bytt(a, i, (i + 1));
            }
        }
        // System.out.println(antallOmbytt); //bare for å telle hvor mange bytt som blir
        // gjordt
        return (a[a.length - 1]);
    }

    public static int ombyttinger(int[] a) {

    }

    public static int antallUlikeSortert(int[] a) {
        int prev = a[0];
        int antallUnike = 1; // starter med en mtp. første tallet er unikt.

        for (int i = 1; i < a.length; i++) {
            if (a[i] != prev)
                antallUnike++;

            if (a[i] >= prev) {
                prev = a[i];
            } else {
                throw new IllegalStateException("Liste er ikke sortert i stigende rekkefølge");
            }
        }
        return antallUnike;
    }

    public static int antallUlikeUsortert(int[] a) {
        int antallUnike = 1;

        // loop through every number in array
        for (int i = 1; i < a.length; i++) {
            // pointerIndex that will "chase" after, looking if there are any repeats.
            int L2RPointer = 0;
            // alarm
            boolean foundSameNumber = false;
            // if i is at the 7th element, L2R will move from 0->6 looking for similar value
            // as a[i]
            while (L2RPointer < i) {
                if (a[L2RPointer] == a[i]) {
                    foundSameNumber = true;
                    break;
                }
                L2RPointer++;
            }
            // did we go through with no hits? then increment
            if (!foundSameNumber)
                antallUnike++;
        }
        return antallUnike;
    }
}