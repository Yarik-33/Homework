public class Posl {
    public static void main(String[] args) {
        int b=1;
        int s=0;
        while (s != 10) {
           if( b<0 ) {
               b=5*s;
               System.out.print(" "+ b);
               s++;
           }else{
               b=5*-s;
               System.out.print(" "+ b);
               s++;
           }
        }
    }
}
