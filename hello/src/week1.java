/**
 * @Author by Rudy
 * @Date 2022/4/11
 */

import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {
        scannerin(args);  //用于讲解读入一个函数；
        intdouble(args);   //变量；
        tocelsius(args);  //浮点数类型的计算；
        tofahrenehit(args);

    }

    public static void scannerin(String[] args) {
//        读输入
        System.out.println("chinese");
        Scanner in= new Scanner(System.in);  //用于读入屏幕输入
        System.out.println(in.nextLine());
    }


    public static void intdouble(String[] args) {
        //变量
        int foot;
        double inch;
        int constant1=12;
        float constant2= (float) 0.3048;
        Scanner in =new Scanner(System.in);
        foot=in.nextInt();
        inch=in.nextDouble();
        System.out.println((foot+inch/constant1)*constant2);

    }

    public static void tocelsius(String[] args) {
//      华氏温度转换成摄氏温度：
        float celsius;
        System.out.println("请输入一个华氏温度：");
        Scanner in = new Scanner(System.in);
        celsius = in.nextFloat();
        System.out.println((int) ((celsius - 32) * 5 / 9));
    }
    public static void tofahrenehit(String[] args) {
//        摄氏温度转换成华氏温度：
        System.out.println("请输入一个摄氏温度");
        Scanner in = new Scanner(System.in);
        double celsius2;
        double fahrenehit = in.nextDouble();
        celsius2 =(9/5.0)*fahrenehit+32;
        System.out.println((int)(celsius2));
    }
}