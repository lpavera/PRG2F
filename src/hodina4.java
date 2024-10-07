import java.util.Random;
import java.util.Scanner;

public class hodina4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //hod minci
        System.out.println("random");

        Random rng = new Random();
        int hodMinci = rng.nextInt(0, 2);
        if (hodMinci == 1)
            System.out.println("vyhral si");
        else
            System.out.println("si mrtvej");
    }
}
