import java.util.ArrayList;
import java.util.Scanner;

public class erejListEvidence {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> seznamTrid = new ArrayList<>();

        System.out.println("Zadejte počet tříd");
        int pocetTrid = sc.nextInt();

        for (int i = 0; i < pocetTrid; i++){
            seznamTrid.add(new ArrayList<>());

            System.out.println("Zadej počet žáků v " + (i + 1) + ". třídě");
            int pocetZaku = sc.nextInt();
            System.out.println("Zadej jména žáků");

            for (int j = 0; j < pocetZaku; j++) {
                String zak = sc.next();
                seznamTrid.get(i).add(zak);
            }
        }

        for (int i = 0; i < pocetTrid; i++){
            System.out.println((i+1) + ". třída " + seznamTrid.get(i));
        }

    }
}
