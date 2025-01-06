import java.util.Random;

public class MetodyLeden {

    static void hodkostky(){
        Random rng = new Random();
        int hod = rng.nextInt(0, 6);
        hod += 1;
        System.out.println("hodnota hodu je: " + hod);
    }
    static void vypishlasku(){
        System.out.println("Zadejte číslo 0 - 10");
    }
    public static void main(String[] args) {
        //INFIS gamba
        hodkostky();

        vypishlasku();


        //todo ruska ruleta
    }
}
