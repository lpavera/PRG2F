public class Clovek {

    String jmeno;
    String prijmeni;
    int vek;
    Long penize;
    int dluh;
    int kamaradi;

    void umrit(){
        System.out.println("--");
    }
    void spat(){
        System.out.println("Zzzzz");
    }
    void mluvit(){
        System.out.println("blablabla");
    }
    public static void main(String[] args) {
        Clovek Jakub = new Clovek();

        Jakub.jmeno = "Jakub";
        Jakub.vek = 17;
        Jakub.penize = 1_000L;

        Jakub.umrit();
        Jakub.spat();
    }
}
