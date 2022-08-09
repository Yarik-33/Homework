import java.util.Scanner;
import java.util.Random;
public class Massiv {
    public static void main(String[] args) {
     int[] arr = new int[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

     for(int i = 0; i< arr.length; i++){
         int val = r.nextInt(9)+1;
         arr[i]=val;
     }
        //System.out.print("Mass "); // Я запутался в 0 и 1 заданиях надо показывать массив или нет
        /*System.out.print(" "+ Arrays.toString(arr)); // поэтому если надо то сотрите
        System.out.println();*/
            System.out.println("Vvedite chislo ot 1 do 9: ");
            int val1 = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == val1) {
                    System.out.println("Est takoe chislo");
                    return;
                }

            }
            System.out.println("Net takogo chisla");
        }
    }

