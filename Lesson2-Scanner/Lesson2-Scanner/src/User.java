import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("You're name: ");
        String name = in.nextLine();

        System.out.printf("Hello %s \n", name);
    }
}
