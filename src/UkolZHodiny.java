import java.util.Random;
import java.util.Scanner;

public class UkolZHodiny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //zjistovani jestli je cislo delitelne 5


        System.out.println("Napiš číslo jesli je delitelné 5");
        int a = sc.nextInt();

        if (a % 5 == 0) {
            System.out.println("číslo je dělitelné 5");
        }else
        System.out.println("číslo není dělitelné 5");
        */

        /*
            //hazeni 2x kostkou a soucet vyssi nez 10


        System.out.println("hod kostkou");

        Random rng = new Random();
        int HodHostkou = rng.nextInt();1, 7);
        int HodKostkou = rng.nextInt(1, 7

        if (HodHostkou + HodKostkou >= 10 || HodHostkou == HodKostkou) {
            System.out.println("Vyhráls");
        } else {
            System.out.println("Máš to blbý");
        }
        */



        /*
        //zadani ciselne hodnoty a zjistit jestli je v intervalu


        System.out.println("Napiš číslo");
        int b = sc.nextInt();

        if (b <= 100 && b >= -100){
            System.out.println("číslo je v intervalu");
        }
        else{
            System.out.println("číslo není v intervalu");
        }
        */


        /*
        //zadani ciselne hodnoty a zjistit jestli je v intervalu ale nesmi byt 0


        System.out.println("Napiš číslo");
        int b = sc.nextInt();

        if (b <= 100 && b >= -100 && b != 0){
            System.out.println("číslo je v intervalu");
        }
        else{
            System.out.println("číslo není v intervalu");
        }
        */



        /*
        //zadani ciselne hodnoty a zjistit jestli NENÍ v intervalu


        System.out.println("Napiš číslo");
        int b = sc.nextInt();

        if (b < -100){
            System.out.println("číslo je v intervalu");
        }
        else if (b > 100) {
            System.out.println("číslo je v intervalu");
        }
        else{
            System.out.println("číslo není v intervalu");
        }
        */

        /*
        //vstup do kina a slevy pro věkové skupiny

        int cena = 100;
        System.out.println("napiš věk");
        int vek = sc.nextInt();

        if (vek < 13 && vek >= 1 || vek >= 70){
            System.out.println("cena lístku je:" + cena * 0.6 + "kč");
        }
        else if (vek >= 13 && vek < 19) {
            System.out.println("cena lístku je:" + cena * 0.8 + "kč");
        }
        else {
            System.out.println("cena lístku je:" + cena + "kč");
        }
        */


        //pozemek, obdélník, cena za m2 = 640kč, uživatel zadá parcelu (délku a šířku) a kolik má peně a program napíše jestli si to může dovolit

        int cenaM2 = 640;

        System.out.println("napiš délku pozemku");
        int delka = sc.nextInt();

        System.out.println("napiš šířku pozemku");
        int sirka = sc.nextInt();

        System.out.println("napiš kolik máš peněz");
        int prachy = sc.nextInt();

        // prachy > delka * sirka * cenaM2   --  mas vic penez nez stojí pozemek

        if (prachy >= sirka * delka * cenaM2) {
            System.out.println("Máte peníze");
        }
        else {
            System.out.println("Nemáte peníze");
        }

    }
}
