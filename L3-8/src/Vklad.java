import java.util.Scanner;
//эту прогу можнои без цикла сделать

public class Vklad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite summy vklada: ");
        float i = sc.nextInt();
        System.out.println("Vvedite kolichestvo mesecev: ");
        int x = sc.nextInt();
        float c=i*7/100;
        for (int a=1; a <= x; a++){
            i=i+c;
        }
        System.out.println("Summa za: "+ x + " mesyacev: " + i);
    }
}
