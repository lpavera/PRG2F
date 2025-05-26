package OOPznamky;

public class Znamka {
    private int znamka;
    private String nazevPredmetu;

    public int getZnamka() {
        return znamka;
    }

    public void setZnamka(int znamka){
        if(znamka >= 1 && znamka <=5 ) {
            this.znamka = znamka;
        }

    }

    public Znamka(int znamka, String nazevPredmetu) {
        this.znamka = znamka;
        this.nazevPredmetu = nazevPredmetu;
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }


}
