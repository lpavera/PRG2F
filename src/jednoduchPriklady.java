import java.util.Scanner;

public class jednoduchPriklady {
    static Scanner sc = new Scanner(System.in);
    static double scitani() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double soucet = a + b;
        return soucet;
    }
/*
    static double deleni() {
        double c = sc.nextDouble();
        boolean d;
        if (c % 2 == 0){
            d = true;
        }else {
            d = false;
        }
        return d;
    }

 */




    public static void main(String[] args) {
        scitani();


    }
}
