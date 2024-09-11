import java.util.Random;



public class FunctionLib {
    public static void bytt(int[] arr, int i, int j) {
        int iValueTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = iValueTemp;
    }
    public static int[] generateRandomArray(int n){
        int[] list = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
        {
            list[i] = (random.nextInt(1000));
        }
       return list;
    }  

}
