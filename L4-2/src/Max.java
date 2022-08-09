import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = null;
        int val = 0;
        for (int i = 0; i < 1; i++) {
            System.out.println("Vyberete: ");
            System.out.println("1.Sozdanie razmera massiva v ruchnuu");
            System.out.println("2.Sozdanie razmera massiva avtomoticheski");
            int punkt = sc.nextInt();
            if(punkt<3) {
                switch (punkt) {
                    case 1:
                        System.out.print("Vvedite razmer massiva: ");
                        val = sc.nextInt();
                        arr = new int[val];
                        break;
                    case 2:
                        arr = new int[r.nextInt(5)+1];
                        break;

                }
                i++;
            }
            i--;

        }
        for(int i = 0; i< arr.length; i++){
            arr[i]=r.nextInt(9)+1;
        }
        System.out.print("Massiv "+ Arrays.toString(arr));
        System.out.println();
        int min=arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimal znachenie: "+min);
        int max=arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximal znachenie: "+max);
        float sred=0;
        for(int i = 0; i< arr.length; i++){
            sred=sred+arr[i];
        }
        sred=sred/arr.length;
        System.out.println("Srednee znachenie: "+sred);
    }
}
