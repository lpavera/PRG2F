import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // připomínka z minulé hodiny

        // Rozdělte datové typy k proměnnám
        // String, boolean, char, int, double


//        type vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
//        type PI = 3.14159d;                   // reálná čísla (s desetinou čárkou)
//        type isTrue = true;                   // pravdivostní hodnota true/false (ano/ne)
//        type bigA = 'A';                      // jeden znak, píše se do ''
//        type name = "Jmeno";                  // textový řetězec (znak/slovo/text), píše se do "";

        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */
        System.out.println("PREHAZOVANI CISEL");

        int cislo1 = sc.nextInt();
        int cislo2 = sc.nextInt();

        System.out.println(cislo1);
        System.out.println(cislo2);

        int cislo3 = cislo1;
        cislo1 = cislo2;
        cislo2 = cislo1;

        System.out.println(cislo1);
        System.out.println(cislo2);




        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */
        System.out.println("JEDNODUCHA KALKULACKA");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);



        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */

        boolean vysledek = 'A' + 'B' + 'C' > 300;
        
        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */
        System.out.println("UDAJE O UZIVATELI");

        System.out.println("zadej jmeno");
        String jmeno = sc.next();

        System.out.println("zadej prijmeni");
        String prijmeni = sc.next();

        System.out.println("zadej PSC");
        int psc = sc.nextInt();

        System.out.println("zadej svoje rodne cislo");
        String rodnecislo = sc.next();

        System.out.println(jmeno);
        System.out.println(prijmeni);
        System.out.println(psc);
        System.out.println(rodnecislo);

        /**
         * CV 5
         * Vygenerujte šachovnici o velikosti NxN, kde N je vstup od uživatele
         * int n;
         *
         * Pro generaci šachovnice odkomentujte následující kód
         for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
         if ((i + j) % 2 == 0) System.out.print("■");
         else System.out.print("□");
         }
         System.out.println();
         }
         */
        /**strany ctverce
         *
         */
        System.out.println("STRANY OBDELNIKU NEBO CTVERCE");

        System.out.println("zadej stranu a");
        int x = sc.nextInt();

        System.out.println("zadejte stranu b");
        int y = sc.nextInt();

        System.out.println(2*(x+y));

        /** celsius na farenheit
         *
         */
        //  F = C * (9/5) + 32
        System.out.println("CELSIUS NA FARENHEIT");

        System.out.println("zadej teplotu ve stupnich celsius:");
        double celsius = sc.nextDouble();
        double F = celsius * (9f/5) + 32;

        System.out.println("teplota v F" + F);

        /** random cisla
         *
         */
        System.out.println("RANDOM CISLA");

        int max = 50;
        int min = 12;

        Random rng = new Random();
        int vytvor = rng.nextInt(min, max);

        /**nacist horni a spodni mez od uzivatele a vypsat nahodne cislo mezi
         *
         */
        System.out.println("HORDI A DOLNI HRANICE A NECO TO VYHODI");

        System.out.println("napis dolni hranici");
        int p = sc.nextInt();
        System.out.println("napis horni hranici");
        int o = sc.nextInt();

        min = p;
        max = o;

        Random lmp = new Random();
        int vecCoSemChtel = lmp.nextInt(min, max);

        System.out.println("nahodne cislo " + vecCoSemChtel);
        /*
        Pokud byste chtěli vypisovat barevně, lze využít tyto řetězce
        - Použití - System.out.println(RED + "Your message" + Reset);
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        */
    }
}