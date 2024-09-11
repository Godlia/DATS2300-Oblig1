public class Oblig1UnitTest {
    public static void main(String[] args) {
        //Oppgave 0
        System.out.println("Oppgave 0: Antall Gruppemedlemmer = " + Oppgave0.gruppeMedlemmer());
        
        //Oppgave 1
        int[] a = FunctionLib.generateRandomArray(90);
        System.out.println("Oppgave 1: Maks verdi er = " + Oppgave1.maks(a));
        
        //Oppgave 2
        int[] Opg2Arr = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};
        System.out.println("Oppgave 2: Antall Ulike = " + Oppgave2.antallUlikeSortert(Opg2Arr)); // Expected 6

        //Oppgave 3
        int[] Opg3Arr = {1,4,2,6,3,8,4,2,5};
        System.out.println("Oppgave 3: Antall Ulike = " + Oppgave3.antallUlikeUsortert(Opg3Arr));
    }
}
