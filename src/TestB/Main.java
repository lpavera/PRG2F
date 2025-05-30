package TestB;

public class Main {
    public static void main(String[] args) {

        BankovniUcet Pepa = new BankovniUcet("15978PVC", 0.0, "czk");
        Pepa.vklad(-100);
        Pepa.vklad(443);
    }
}
