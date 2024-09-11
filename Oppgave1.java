import java.util.NoSuchElementException;    

public class Oppgave1 {
    public static int maks(int[] a) {
        int antallOmbytt = 0;
        //Guard clause for array
        if(a.length <= 1) throw new NoSuchElementException("Array er for liten");
        
        for(int i = 0; i < a.length; i++) {
            if((i+1) < a.length && a[i] > a[i+1]) {
                antallOmbytt++;
                FunctionLib.bytt(a, i, (i+1));
            }
        }
        //System.out.println(antallOmbytt); //bare for å telle hvor mange bytt som blir gjordt
        return(a[a.length-1]);
    }


    public static void main(String[] args) {
    }
}
