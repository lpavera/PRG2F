package VzorovyTest;

public class Zavod {
    String Misto;
    private int rok;
    private int mesic;
    private int den;

    public void printInfo(){
        System.out.println("Závod se koná: " + den + "." + mesic + ". " + rok + ", " + Misto);
    }
    public Zavod(String Misto, int rok, int mesic, int den){
        this.Misto = Misto;
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
    }
    public Zavod(int rok, int mesic, int den, String Misto){
        this.Misto = Misto;
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
    }

    public void setRok(int rok){
        if (rok > 2024){
            this.rok = rok;
        }
    }
    public void setMesic(int mesic){
        if (rok > 5){
            this.mesic = mesic;
        }
    }
    public void setDen(int den){
        if (rok > 25){
            this.den = den;
        }
    }


}
