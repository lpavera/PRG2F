import java.util.Scanner;

public class Ukol3KdoViCo {


    static class nickname{

        static String jmeno;
        static String prijmeni;

        static void nacist() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Napiš jméno");
            jmeno = sc.next();
            System.out.println("Napiš příjmení");
            prijmeni = sc.next();
        }

        static String prezdivka;
        static void vytvorit() {
            String prezdivka1;
            if (jmeno.length() >= 5) {
                prezdivka1 = jmeno.substring(2, 5);
            }else{
                prezdivka1 = jmeno.substring(0 , 3);
            }
            String prezdivka2;
            if (prijmeni.length() >= 8) {
                prezdivka2 = prijmeni.substring(3, 6);
            } else if (prijmeni.length() >= 4) {
                prezdivka2 = prijmeni.substring(1, 4);
            } else{
                prezdivka2 = prijmeni.substring(0 , 3);
            }

            prezdivka = prezdivka1.concat(prezdivka2);
            prezdivka = prezdivka.toLowerCase();
        }

        static void pridavek(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Napiš den v měsíci svého narození");
            String mujPridavek = sc1.next();
            prezdivka = prezdivka.concat(mujPridavek);
        }

        static void overit() {
            if (prezdivka.length() >= 5){
                System.out.println("Uživatelské jméno je správné");
            }else{
                System.out.println("Uživatelské jméno není dost dlouhé");
            }
            System.out.println(prezdivka);
        }


    }

    public static void main(String[] args) {
        nickname.nacist();
        nickname.vytvorit();
        nickname.pridavek();
        nickname.overit();
    }
}
