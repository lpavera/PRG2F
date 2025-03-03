import java.util.Scanner;

public class Ukol3ProLuciku {
    static class prezdivka{

        static String jmeno;
        static String prijmeni;

        static void ukol1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Napiš jméno");
            jmeno = sc.next();
            System.out.println("Napiš příjmení");
            prijmeni = sc.next();
        }

        static String prezdivka;

        static void ukol2() {
            String prezdivka1;
            if (jmeno.length() <= 4 ) {
                prezdivka1 = jmeno;
            }else{
                prezdivka1 = jmeno.substring(2 , 5);
            }
            String prezdivka2;
            if (prijmeni.length() <= 3) {
                prezdivka2 = prijmeni;
            } else{
                prezdivka2 = prijmeni.substring(1 , 4);
            }

            prezdivka = prezdivka1.concat(prezdivka2);
            prezdivka = prezdivka.toLowerCase();
        }

        static void zaJednicku(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Napiš rok svého narození");
            String datum = sc1.next();
            String cislo = datum.substring(2 , 4);
            prezdivka = prezdivka.concat(cislo);
        }

        static void ukol3() {
            if (prezdivka.length() >= 5){
                System.out.println("Uživatelské jméno je správné");
            }else{
                System.out.println("Uživatelské jméno není dost dlouhé");
            }
            System.out.println(prezdivka);
        }


    }

    public static void main(String[] args) {
        prezdivka.ukol1();
        prezdivka.ukol2();
        prezdivka.zaJednicku();
        prezdivka.ukol3();
    }
}

//uz ani nevim jak ti mam rikat tak tu je dalsi forma tvyho jmena v nazvu souboru
//taky mam pocit ze je se mnou neco spatne kdyz ti ten ukol jen tak dělam, nechceš mi prosím říct proč? treba mi to napiš na ig