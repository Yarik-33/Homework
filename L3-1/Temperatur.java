import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int a=1; a>0 ; --a) {

            System.out.println("Vvedite temperaturu: ");
            int x = scanner.nextInt();

            if(x<-30 || x>30){
                System.out.println("Oshibka diapozons chisel");
                ++a;
            }
           else
               if (x > -5) {
                System.out.println("Teplo");
            } else if (-5 >= x && x > -20) {
                System.out.println("Norm");
            } else if (x <= -20) {
                System.out.println("Holodno");
            }
        }

    }
}


