import java.util.Scanner;

public class stringListopad28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // začíná scanner


        String jmeno = "           Pepa Pepa";
        String prijmeni = "Kokotek";

        prijmeni = prijmeni.replace("ek",  "domrdany"); // změní část nebo celý string

        System.out.println(jmeno + " " + prijmeni);

        //alternativa
        String spojene = jmeno.concat(prijmeni);
        System.out.println(spojene);


        System.out.println(jmeno.length()); // urci jak dlouhe je slovo

        System.out.println(jmeno.indexOf('P')); //rekne na jake pozici he toto pismeno
        // zacina se pocitat od 0 takze by to vyhodilo 0, do tohohle pismena ' ' a do tohohle slova nebo tak " "

        System.out.println(jmeno.charAt(12)); // rekne co je na tom cisle za pismeno

        System.out.println(jmeno.toUpperCase()); //vsechno na velky pismena

        System.out.println(jmeno.toLowerCase()); // vsechno na maly pismena

        System.out.println(jmeno.trim()); // odenda mezery na konci a na začátku
        System.out.println(jmeno.strip()); // odenda mezery na konci a na začátku, ALE JE LEPŠÍ → POUŽÍVAT!!


        System.out.println("Napiš větu alespon o 2 slovech");
        String veta = sc.nextLine();
        // Jak se nazývá město zimbabve -- zjistit jak je dlouhé první slovo

        System.out.println("Délka prvního slova je: " + veta.indexOf(' '));

        int pocetslov = 0;

        for (int i = 0; i < veta.length(); i++ ) {
            if (veta.charAt(i) == ' ') {
                pocetslov++;
            }
        } System.out.println("Počet slov je: " + pocetslov);



        //System.out.println("Počet slov je: " + veta.split("").length); // druhá varianta - mi nefunguje






        sc.close(); // ukončuje scanner

    }
}
