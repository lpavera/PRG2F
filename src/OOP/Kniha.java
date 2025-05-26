package OOP;

public class Kniha {
    String autor;
    String nazevKnihy;

    public Kniha(String autor){
        this.autor = autor;
    }
    public void vypisInfo(){
        System.out.println(nazevKnihy + " - " + autor);
    }

}
