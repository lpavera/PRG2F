import java.util.Scanner;

public class testicek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //shift+f6 změní všechny proměné a muzou se prepsat najednou

        /*
        //ŠACHOVNICE

        int Velikost = 8;

        for (int radek = 0; radek < Velikost; radek++) {
            for (int sloupec = 0; sloupec < Velikost; sloupec++) {
                if (radek % 2 == 0 && sloupec % 2 != 0 || radek % 2 != 0 && sloupec % 2 == 0 ) {
                    System.out.print(" ■ ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

         */

        /*
        //ŠACHOVNICE ALE LEPŠÍ

        int Velikost = 8;

        for (int radek = 0; radek < Velikost; radek++) {
            for (int sloupec = 0; sloupec < Velikost; sloupec++) {
                if ((radek + sloupec) % 2 == 0 ) {
                    System.out.print(" ■ ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

         */




    }
}
