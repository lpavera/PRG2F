import java.util.Random;
import java.util.Scanner;

public class ruskaruleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //hod kostkou a kolikrat umru pri 100 hodech a v procentech
        int dead = 13;
        int hod = -1;
        int pocetsmrti = 0;
        int pocethodu = 100;

        Random rng = new Random();

        for (int i = 1; i <= pocethodu; i++){
            hod = rng.nextInt(1, 21);

            if (hod == dead){
                pocetsmrti++;
            }
        }
        System.out.println("Počet smrtí je:" + pocetsmrti);
        System.out.println("počet smrtí v procentech " + ((pocetsmrti * 100) / pocethodu) + "%");

         */


        //hod minci 1 miliardkrat a kolikrat v procetnech padla hlava (1)

        int hlava = 1;
        int hod = -1;
        int pocethlav = 0;
        int pocethodu = 1_000_000_000;

        Random rng = new Random();

        for (int i = 1; i <= pocethodu; i++){
            hod = rng.nextInt(0, 2);

            if (hod == hlava){
                pocethlav++;
            }
        }

        System.out.println("počet hlav v procentech " + ((pocethlav * 100.0) / pocethodu) + "%");
    }
}
