import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int a=1; a>0 ; --a) {
            System.out.println("Vvedite polozhitelnje chislo do 100 i ne menshe 1: ");
            int x = scanner.nextInt();

            if (x > 100 || x <= 0) {
                System.out.println("Oshibka diapozons chisel");
                ++a;

            } else {
                int b = 1;
                a = x;
                while (b != a) {
                    x = x + b;
                    System.out.println(x);
                    ++b;
                }
            }
        }
    }
}
