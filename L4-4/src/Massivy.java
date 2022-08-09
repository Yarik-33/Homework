import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Massivy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr1 = null;
        int n = 0;
        for (int i = 0; i < 1; i++) {
            System.out.print("Vvedite razmer massiva n=( 5 < n <= 10 ): ");
            n= sc.nextInt();
            System.out.println();
            if(5 < n && 10 >= n){
                arr1 = new int[n];
                i++;
            }else{
            System.out.println("Vy prevysrli diapozon");
            System.out.println("povtorite popytky");
            i--;
            }

        }
        int evenNums = 0;
        for(int i = 0; i< arr1.length; i++){
            arr1[i]=r.nextInt(9)+1;
            if (arr1[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println("Massiv 1: "+ Arrays.toString(arr1));
        int[]arr2 = new int[evenNums];
        int index = 0;
        for(int i= 0; i< n; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println("Massiv 2: "+ Arrays.toString(arr2));
    }
}
