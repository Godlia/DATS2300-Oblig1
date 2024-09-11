public class Oppgave3 {
    public static int antallUlikeUsortert(int[] a) {
        int antallUnike = 1;
        
        //loop through every number in array
        for (int i = 1; i < a.length; i++) {
            //pointerIndex that will "chase" after, looking if there are any repeats.
            int L2RPointer = 0;
            //alarm
            boolean foundSameNumber = false;
            //if i is at the 7th element, L2R will move from 0->6 looking for similar value as a[i]
            while (L2RPointer < i) {
                if (a[L2RPointer] == a[i]) {
                    foundSameNumber = true;
                    break;
                }
                L2RPointer++;
            }
            //did we go through with no hits? then increment
            if(!foundSameNumber) antallUnike++;
        }
        return antallUnike;
    }

    public static void main(String[] args) {

        int[] Opg3Arr = {1,2,3,4,5,5,6,7,8,9,10,10,10,10,10,10};
        System.out.println(antallUlikeUsortert(Opg3Arr));
    }
}
