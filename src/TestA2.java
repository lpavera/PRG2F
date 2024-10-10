import java.util.Random;
import java.util.Scanner;

public class TestA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //příklad 1

        //musi byt nad 140cm aby mohl na horskou drahu

        System.out.println("Napiš svou výšku v cm");

        int vyska = sc.nextInt();

        if (vyska >= 140){
            System.out.println("Můžete jet na horské dráze");
        }
        else {
            System.out.println("Nemůžete jet na horské dráze");
        }



        //příklad 2

        //hazeni 2 kostek, pokud je součet 7 nebo 11 tak vyhrává

        Random rng = new Random();

        int hod1 = rng.nextInt(1,7);
        int hod2 = rng.nextInt(1,2);

        if (hod1 + hod2 == 7 || hod1 + hod2 == 11){
            System.out.println("Vyhrál, hodnota kostky 1 :" + hod1 + "hodnota kostky 2 :" + hod2);
        }
        else {
            System.out.println("Prohrál, hodnota kostky 1 :" + hod1 + "hodnota kostky 2 :" + hod2);
        }



        //příklad 3

        //Cena jednoho lístku je 150 Kč.
        //Pokud si objedná 5 nebo více lístků, dostane slevu 15 %.
        //Pokud objedná 10 nebo více lístků, dostane slevu 30 %.
        //Pokud objedná více než 50 lístků, bude objednávka zamítnuta

        int cena = 150;

        System.out.println("Zadej počet lístků, které si chceš koupit");

        int pocet = sc.nextInt();

        if (pocet <= 4){
            System.out.println("Vaše cena je:" + pocet * cena + "kč");
        }
        else if (pocet >= 5 && pocet <= 9) {
            System.out.println("Vaše cena je:" + (pocet * cena) * 0.85 + "kč");
        }
        else if (pocet >= 10 && pocet <=49) {
            System.out.println("Vaše cena je:" + (pocet * cena) * 0.70 + "kč");
        }
        else {
            System.out.println("Pokus o hromadný nákup");
        }
    }
}
