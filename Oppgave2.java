public class Oppgave2 {
    public static int antallUlikeSortert(int[] a) {
        int prev = a[0];
        int antallUnike = 1; // starter med en mtp. første tallet er unikt.
    
        for(int i = 1; i < a.length; i++) {
            if(a[i] != prev) antallUnike++;
    
            if(a[i] >= prev) {
                prev = a[i];    
            } else {
                throw new IllegalStateException("Liste er ikke sortert i stigende rekkefølge");
            }
        }
        return antallUnike;
    }

    public static void main(String[] args) {
    }
}
