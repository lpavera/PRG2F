import java.util.Scanner;

public class Hodina9ListopadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*
        String jmeno = "  behHAS   EFNU ckjan he jaj    ";

        int index = jmeno.indexOf("he");


        System.out.println(jmeno);

        System.out.println("he je na " + index + " místě"); //napise kde je dané pismeno nebo pismena

        System.out.println(jmeno.toLowerCase()); //zmeni vsechna pismena na maly
        System.out.println(jmeno.toUpperCase()); // zmeni vschna pismena na velky

        System.out.println(jmeno.trim()); //vymaže mezery na začátku a konci

        String vdanackjanhejaj = jmeno.replace("ckjan he jaj", "koket zkurveny");
        System.out.println(vdanackjanhejaj);
        */



        //nejakej ukol

        System.out.println("Napiš slovo");

        String slovo = sc.next();

        int pocetpismen = slovo.length();

        System.out.println(pocetpismen);

        System.out.println(slovo.toUpperCase());


    }
}
