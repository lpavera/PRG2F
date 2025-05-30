package TestB;

public class BankovniUcet {
    private String cisloUctu;
    private double zustatek;
    private String mena;


    public void vklad(double castka){
       if (castka > 0) {
           zustatek = castka + zustatek;
           System.out.println("Na účet " + cisloUctu + " bylo vloženo: " + castka + " " + mena + ". Nový zůstatek: " + zustatek + " " +mena);
       }else
        System.out.println("Nemůžeš vkládat když nic nemas");
    }
    public BankovniUcet(String cisloUctu, double zustatek, String mena){
        this.cisloUctu = cisloUctu;
        this.zustatek = zustatek;
        this.mena = mena;
    }
    public BankovniUcet(String cisloUctu){
        this.cisloUctu = cisloUctu;
        zustatek = 0;
        mena = "czk";
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public double getZustatek() {
        return zustatek;
    }

    public String getMena() {
        return mena;
    }

    public void setZustatek(double zustatek) {
        if (zustatek > 0){
            this.zustatek = zustatek;
        }
    }
}
