import javax.swing.*;
import java.util.Scanner;

public class Ukol2Metody {

    static void validatePassword(String password){



        Boolean podminka = true;

        //délka vetší než 8
        if (password.length() < 8) {
            System.out.println("Heslo nesplnuje jednu z podmínek: Délka");
            podminka = false;
        }
        //nesmí obsahovat heslo
        else if (password.toLowerCase().contains("heslo")) { //to lower case je protože aby to nemohl napsat ze něco velkým protože pak to nefunguje
            System.out.println("Heslo nesplňuje jednu z podmínek: obsahuje zakázané slovo");
            podminka = false;
        }
        //heslo nesmí obsahovat "-"
        else if (password.contains("-")) {
            System.out.println("Heslo nesplňuje jednu z podmínek: obsahuje  \"-\"");
            podminka = false;
        }
        else {
            podminka = true;
            System.out.println("Heslo je v pořádku");
        }

    }



    public static void main(String[] args) {

        validatePassword("heslo");
        validatePassword("jauznevimHEslo");
        validatePassword("blabla-bla4245");
        validatePassword("spravnykreslo");

    }
}
