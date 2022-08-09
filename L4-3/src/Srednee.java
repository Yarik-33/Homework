import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Srednee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        int val = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(9) + 1;
            arr2[i] = r.nextInt(9) + 1;
        }

        System.out.print("Massiv 1: " + Arrays.toString(arr1));
        System.out.println();
        System.out.print("Massiv 2: " + Arrays.toString(arr2));
        System.out.println();

        float sred1 = 0;
        float sred2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sred1 = sred1 + arr1[i];
            sred2 = sred2 + arr2[i];
        }
        sred1 = sred1 / arr1.length;
        System.out.println("Srednee znachenie massiva 1: " + sred1);

        sred2 = sred2 / arr2.length;
        System.out.println("Srednee znachenie massiva 2: " + sred2);

        if (sred1 == sred2) {
            System.out.println("Srednie chisla ravny");
        }

        System.out.println("Srednee chislo u " + ((sred1 > sred2) ? "massiva 1 bolshe" : "massiva 2 bolshe"));
    }
}
