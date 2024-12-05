import java.util.Scanner;

public class prevadeniCisel {
    public static void main(String[] args) {
/*

        String cislo = "123";
        int c = 53;

        String RRC = String.valueOf(c);
        int CRR = Integer.parseInt(cislo);

        CRR = CRR + 15;
        System.out.println(CRR);
*/
        Scanner sc = new Scanner(System.in);

/*
        System.out.println("Zadej číslo: ");
        String radka = sc.nextLine(); // nacte i slova po mezere dokud se neda enter

        int CHR = Integer.parseInt(radka);
        CHR += 10;
        System.out.println(CHR);

 */


        System.out.println("Zadej větu zmrdečku");
        String veta =  sc.nextLine();

        String zacatekVety = "Java";
        String konecVety = "rocks.";

        System.out.println("Řetězec začíná na " + zacatekVety + ": " + veta.startsWith(zacatekVety));

        System.out.println("Řetězec Končí na " + konecVety + ": " + veta.endsWith(konecVety));

        System.out.println("Zadej od jakého znaku chceš vypsat větu");
        int zacatek = sc.nextInt();
        System.out.println("Zadej DO jakého znaku chceš vypsat větu");
        int konec = sc.nextInt();

        System.out.println("Věta od tvych hranic" + veta.substring(zacatek));
        System.out.println("Věta od do tvych hranic" + veta.substring(zacatek , konec));




    }
}
