package OOP;

public class Main {
    public static void main(String[] args) {
       /* Clovek kralHandrich = new Clovek(1);

        //kralHandrich.velikostPalceUNohy = 1;

        Clovek augustyn = new Clovek(9.99);

        //augustyn.velikostPalceUNohy = 9.99;

        System.out.println(augustyn.velikostPalceUNohy);
        System.out.println(kralHandrich.velikostPalceUNohy);


        Kniha k = new Kniha("Dostojevsky");
        k.nazevKnihy = "Zločin a Trest";

        k.vypisInfo();


        Kruznice l = new Kruznice(4.8);

        l.obsah();
        l.obvod();*/



        Kruznice k = new Kruznice(); // vytvoření prázdného objektu

        k.setPolomer(-7.5); // Hodnota předaná setteru je neplatná => nenastaví se

        k.setPolomer(12.7);
        double polomerKruznice = k.getPolomer();

        // Vypíše se: Hodnota polomeru kruznice je: 12.7
        System.out.println("Hodnota polomeru kruznice je: " + polomerKruznice);
    }
}
