public class kvadrat {
    public static void main(String[] args) {
        int b=1;
        int s=10;
       //int d=2;
        /*Я не помню проходили ли мы Math.pow но я помню его ещё когда я в школе на джава ходил,
                  в С++ там просто .pow */
        while (s != 21) {
                b=s*s;
                System.out.print(" "+ b);
                s++;

          //  System.out.print(" "+ Math.pow(s,d));
          //  s++;

        }
    }
}
