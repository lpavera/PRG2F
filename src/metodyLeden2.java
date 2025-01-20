import jdk.jshell.Snippet;

import java.util.Scanner;

public class metodyLeden2 {
    /*
    static double obvodtelesa(){
        int a = 10;
        int b = 5;
        double c = Math.PI ;
        double obvod = a * b * c;

        return obvod; // nahore je napsáno double tak se to tu musí vrátit aby byl obvod telesa nejak nevim proste vracenej ci co
    }

     */

    static double nacticislo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo");
        double cislo = sc.nextDouble();

        return cislo;
    }
    public static void main(String[] args) {
        /*
        double vysledekMetody = obvodtelesa();
        System.out.println(obvodtelesa());

         */


        double vysledek = nacticislo() ;
        double csl = nacticislo() ;
        System.out.println(csl + vysledek);

    }
}
