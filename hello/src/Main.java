import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int foot;
//        double inch;
//        Scanner in =new Scanner(System.in);
//        foot=in.nextInt();
//        inch=in.nextDouble();
//        System.out.println((foot+inch/12)*0.3048);


        int foot;
        double inch;
        int constant1=12;
        float constant2= (float) 0.3048;
        Scanner in =new Scanner(System.in);
        foot=in.nextInt();
        inch=in.nextDouble();
        System.out.println((double) ((foot+inch/constant1)*constant2));

    }
}
