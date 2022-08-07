public class tab_um {
    public static void main(String[] args) {
        for(int b=1 ; b <=10 ; b++) {
            for(int i=1 ; i<=10 ; i++) {
                int x = 0;
                x += i*b;
                System.out.print(i+"*"+b+"="+x+" ");
            }
            System.out.println();
        }
    }
}
