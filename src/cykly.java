import java.util.Random;
import java.util.Scanner;

public class cykly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //cyklus while


        /*
        //výpis čísel 1 - 10

        int cislo = 1;
        while (cislo <= 10){
            System.out.println(cislo);
            cislo++;  //vzdy po cyklu zvětší číslo o 1
        }



         */

        /*
        //kostka

        Random kostka = new Random();

        int cislo = kostka.nextInt(1, 7);
        while (cislo < 4){
            cislo++;
            System.out.println("Hodil jsi " + cislo);
        }

        do {
            cislo++;
            int cislo1 = kostka.nextInt(1, 7);
        }while (cislo < 4);

         */


        //výpis sudých čisel do 1000

        int csl = 0;

        while (csl <= 1000){
            System.out.println(csl);
            csl = csl + 2;
        }





        //hod kostkou dokud nepadne 6

        Random rng = new Random();

        int czislo = rng.nextInt(1,7);
        do{
            czislo = rng.nextInt(1,7);
            System.out.println("Hodil jsi " + czislo);
        }while (czislo != 6);




    }
}
