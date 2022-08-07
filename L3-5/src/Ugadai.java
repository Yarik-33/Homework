import java.util.Random;
import java.util.Scanner;

public class Ugadai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(30) + 1;
        int a = 5;
        System.out.println("Vy dolzhni ugadat chislo ot 1 do 30");
        while (a >= 0) {
            System.out.println("U vas " + a + "popytki");
            System.out.println("Vvedite chislo: ");
            int i = sc.nextInt();
            if(a == 0){
                System.out.println("game over");
                return;
            }else if(i == x){
                System.out.println("vi ugodali");
                return;
            }else {
                System.out.println("Tvoe chislo "+ ((i>x)?"boshe":"menshe"));
                --a;
            }

        }
    }
}
