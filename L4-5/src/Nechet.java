import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Nechet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[r.nextInt(10)+1];
        for(int i = 0; i< arr.length; i++){
            arr[i]=r.nextInt(9)+1;
        }
        System.out.println("Massiv : "+ Arrays.toString(arr));
        for(int i= 0; i< arr.length; i++) {
            if(i % 2 > 0){
            arr[i]=0;
            }
        }
        System.out.println("Massiv : "+ Arrays.toString(arr));
    }
}
