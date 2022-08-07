import java.util.Scanner;

public class Raduga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo ot 1-7: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> System.out.println("Red ");
            case 2 -> System.out.println("orange ");
            case 3 -> System.out.println("yellow ");
            case 4 -> System.out.println("green ");
            case 5 -> System.out.println("sky ");
            case 6 -> System.out.println("blue");
            case 7 -> System.out.println("purple ");
        }


    }
}