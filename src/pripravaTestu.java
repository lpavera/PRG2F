import java.util.Random;
import java.util.Scanner;

public class pripravaTestu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);





        //1 cviceni na and

        /*
        //vstup na atrakci, musi byt nad 12 let a mit nad 140cm ale do 200cm

        System.out.println("Zadej věk");
        int vek = sc.nextInt();

        System.out.println("Zadej výšku");
        int vyska = sc.nextInt();

        if (vek >= 12 && vyska >= 140 && vyska <= 200){
            System.out.println("Můžeš na atrakci");
        }
        else {
            System.out.println("Nemžeš na atrakci");
        }
         */


        /*
        //registrace na maraton, musi mit nad 18 let a ubehnout 10km pod 60 minut

        System.out.println("Zadej věk");
        int vek = sc.nextInt();

        System.out.println("Zadej tvůj čas na 10km běhu v minutách");
        int cas = sc.nextInt();

        if (vek >= 18 && cas <= 60 ){
            System.out.println("Registrace byla úspěšná");
        }
        else {
            System.out.println("Registrace zamítnuta");
        }
         */


        /*
        //pokud je cena nákupu nad 5000kč a uživatel má nad 100 věrnostních bodů tak dostane slevu

        System.out.println("Zadej cenu nákupu");
        int cena = sc.nextInt();

        System.out.println("Zadej počet věrnostních bodů");
        int body = sc.nextInt();

        if (cena >= 5000 && body >= 100 ){
            System.out.println("Získáváte slevu na váš nákup");
        }
        else {
            System.out.println("Máš smůlu nic nebude");
        }
        */





        //2 cvicení na or a random

        /*
        //gamble, pokud je součet čísel 21 nebo menší než 10 tak vyhrál

        System.out.println("Začínáme gamble o tvůj barák");

        Random rng = new Random();
        int cisla = rng.nextInt(1, 13);
        int czisla = rng.nextInt(1, 13);

        if ( cisla + czisla == 21 || cisla + czisla <= 10){
            System.out.println("Vyhráls, máš štěstí zmrdecku");
        }
        else {
            System.out.println("Hahaha přišels o barák");
        }
         */


        /*
        //dalsí gamble ale hody kostkou, pokud je soucet mensi než 10 tak vyhral a pokud sou obe cisla 6 tak vyhral

        System.out.println("Začínáme gamble o tvýho cernocha");

        Random rng = new Random();
        int hod1 = rng.nextInt(1, 7);
        int hod2 = rng.nextInt(1, 7);

        if ( hod1 + hod2  == 12 || hod1 + hod2 <= 10){
            System.out.println("Vyhráls, máš štěstí zmrdecku");
        }
        else {
            System.out.println("Hahaha přišels o otroka");
        }
         */


        /*
        //hod 3 kostek a aspon 2 musí bejt stejný

        System.out.println("Začínáme gamble o tvýho ptáka");

        Random rng = new Random();
        int hod1 = rng.nextInt(1, 7);
        int hod2 = rng.nextInt(1, 7);
        int hod3 = rng.nextInt(1, 7);

        if ( hod1 == hod2 || hod2 == hod3 || hod3 == hod1){
            System.out.println("Vyhráls, máš štěstí zmrdecku, necham ti péro");
        }
        else {
            System.out.println("Hahaha přišels o ptáka, kde mam pilku");
        }

         */






        //3 cvicení pouzití v realnem zivote

        /*
        //uživatel napíše čas a pokud je 5 - 11 tak napise dobre rano, pokud je 12 - 17 tak napise dobre odpoledne a pokuje 18 - 4 tak napíše dobry vecer

        System.out.println("Kolik je hodin?");

        int hodiny = sc.nextInt();

        if ( hodiny >= 5 && hodiny <= 11){
            System.out.println("Dobré ráno");
        }
        else if ( hodiny >= 12 && hodiny <= 17) {
            System.out.println("Dobré odpoledne");
        }
        else {
            System.out.println("Dobrý večer");
        }
         */


        /*
        //zádá se počet vstupenek který si chce uzivatel koupit, 1ks stojí 1200kč,
        //1-5 vstupenek platí plnou cenu
        //6-10 vstupenek má slevu 15%
        //11-20 vstupenek má slevu 25%
        //20+ vstupenek objednávka zamítnuta

        int cena = 1200;

        System.out.println("Napiš počet objednávek");

        int pocet = sc.nextInt();

        if ( pocet >= 1 && pocet <= 5 ){
            System.out.println("Vaše cena je:" + pocet * cena + "kč");
        }
        else if ( pocet >= 6 && pocet <= 10 ) {
            System.out.println("Vaše cena je:" + (pocet * cena) * 0.85 + "kč");
        }
        else if ( pocet >= 11 && pocet <= 20 ) {
            System.out.println("Vaše cena je:" + (pocet * cena) * 0.75 + "kč");
        }
        else {
            System.out.println("Objednávka zamítnuta");
        }
         */


        /*
        //zadam měsíční spotřebu vody a program vypíše kolik kč zaplatí uživatel za vodu za daný měsíc
        // 0l - 4 999l   -   0,03kč
        // 5 000l - 9 999l   -   0,025kč
        // 10 000l - 14 999l   -   0,02kč
        // 15 000l +   -   0,015kč

        double voda1 = 0.03;
        double voda2 = 0.025;
        double voda3 = 0.02;
        double voda4 = 0.015;

        System.out.println("Napiš spotřebu vody v litrech");

        int voda = sc.nextInt();

        if ( voda >= 0 && voda <= 4999 ){
            System.out.println("Vaše cena za vodu je:" + voda * voda1 + "kč");
        }
        else if ( voda >= 5000 && voda <= 9999 ) {
            System.out.println("Vaše cena za vodu je:" + voda * voda2 + "kč");
        }
        else if ( voda >= 10000 && voda <= 14999 ) {
            System.out.println("Vaše cena za vodu je:" + voda * voda3 + "kč");
        }
        else {
            System.out.println("Vaše cena za vodu je:" + voda * voda4 + "kč");
        }
         */



    }
}
