import java.util.Scanner;

public class cykly2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*
        //načitani cisla od uzivatele a to se scita (nebo odcita)
        int vstup;
        int suma = 0; // k tomuhle se budou pricitat císla z cyklu

        do {
            //tu se opakuje
            System.out.println("Napiš celé číslo");
            vstup = sc.nextInt();
            suma = suma + vstup; // alternativa: suma += vstup

        } while (vstup != 0); //cyklus se dělá dokud vstup není 0

        System.out.println("Součet je: " + suma);

         */


        /*
        //3 pokusy na zadani hesla pak se to zablokuje
        //pokud zada spatne tak napise spatne heslo
        //pokud zada 3x spatne heslo napise pristup zamitnut a pokud spravne tak napise pristup povolen


        int heslo = 852852;
        int pokus = 0;


        while (pokus != 3){
            System.out.println("Zadej heslo");
            int hesloOd = sc.nextInt();

            if (heslo == hesloOd){
                System.out.println("Přístup povolen");
                return; // ukončí program pred koncem
            }
            pokus++;
        }
        System.out.println("Přístup zamítnut");


         */


        //počet sudých čísel
        //pokud zadá zaporne cislo program se ukonci  a vypise kolik sudych cisle napsal

        int cislo;
        int sudacisla = 0;

        do {
            System.out.println("Napiš číslo");
            cislo = sc.nextInt();
            if (cislo % 2 == 0){
                sudacisla++;
            }

        }while (cislo > 0);

        System.out.println("Počet sudých čísel: " + sudacisla);




    }
}
