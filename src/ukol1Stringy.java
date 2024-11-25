import java.util.Scanner;

public class ukol1Stringy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadejte jméno");
        String jmeno = sc.next();

        System.out.println("Zadejte příjmení");
        String prijmeni = sc.next();


        //na obracení pismen pozpatku
        String obracenejm = new StringBuilder(jmeno).reverse().toString();
        String obraceneprij = new StringBuilder(prijmeni).reverse().toString();

        System.out.println("Vaše jméno a příjmení pozpátku:");
        System.out.println(obracenejm.toUpperCase() + " " + obraceneprij.toUpperCase());
    }
}
