import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Udali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[r.nextInt(5)+1];
        int[] arr1=null;
        //System.out.print("Mass ");    //Если хотите посмотреть на масиввы
        for(int i = 0; i< arr.length; i++){
            arr[i]=r.nextInt(9)+1;
        }
        /*System.out.print(" "+ Arrays.toString(arr));
        System.out.println();*/
        System.out.println("Vvedite chislo ot 1 do 9: ");
        int val = sc.nextInt();
        for (int i = 0; i<arr.length; i++) {

            if (arr[i] == val) {
                arr1 = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    arr1[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    arr1[j] = arr[j+1];
                }
                System.out.println("Bylo:"+ Arrays.toString(arr));
                System.out.println("Stalo:"+ Arrays.toString(arr1));
                return;
            }

        }
        System.out.println("Net takogo chisla");
    }
    }

