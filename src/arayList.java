import java.util.ArrayList;
public class arayList {
    public static void main(String[] args) {
        ArrayList<String> Auta = new ArrayList<>();

        Auta.add("Škoda");
        Auta.add("Mercedes");
        Auta.add("BMW");
        Auta.add("Lancia");
        Auta.add("Fiat");
        Auta.add("Audi");
        Auta.add("Volvo");
        Auta.add("Saab");

        System.out.println(Auta.get(0));

        System.out.println(Auta.size());
        boolean jeSmazano = Auta.remove("Fiat");
        System.out.println(Auta.size());
        System.out.println(jeSmazano);

        Auta.set(6, "Pagani Zonda");
        System.out.println(Auta.get(6));
        System.out.println(Auta);
    }
}
