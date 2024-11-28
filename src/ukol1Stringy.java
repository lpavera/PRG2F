import java.util.Scanner;

public class ukol1Stringy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadejte jméno");
        String jmeno = sc.next();

        System.out.println("Zadejte příjmení");
        String prijmeni = sc.next();

        String obracenejm = "";//proměné pro obrácena slova, uvozovky = prázdná proměná
        String obraceneprij = "";

        //přendavá do proměné obracenejm písmena z proměné jmeno pozpátku
        //jmeno.length -1 ← -1 je kvuli tomu že číslování písmen ve slově začíná 0 ale délka je normalní
        //i-- protože jdu od zádu
        for (int i = jmeno.length() - 1; i >= 0; i--) {
            obracenejm += jmeno.charAt(i); // to znamená že se pomalu od zadu vypisuje to jmeno

        }

        for (int i = prijmeni.length() - 1; i >= 0; i--) {
            obraceneprij += prijmeni.charAt(i); // alternativa: obraceneprij = obracenejm + prijmeni.charAt(i);
        }

        System.out.println("Jméno a příjmení pozpádku: " + obracenejm.toUpperCase() + " " + obraceneprij.toUpperCase());











        /* tohle prej nesmim :((

        //na obracení pismen pozpatku
        String obracenejm = new StringBuilder(jmeno).reverse().toString();
        String obraceneprij = new StringBuilder(prijmeni).reverse().toString();

        System.out.println("Vaše jméno a příjmení pozpátku:");
        System.out.println(obracenejm.toUpperCase() + " " + obraceneprij.toUpperCase());

         */
    }
}
