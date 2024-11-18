import java.util.Scanner;

public class CyklySAtamanukemCoSeVratil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int velikostMrizky = 5;

        for (int radek = 0; radek < velikostMrizky; radek++){
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++){
                if (radek == 0 || radek == velikostMrizky - 1){   // napsat "nebo" → ||
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
        */

        /*
        int velikostMrizky = 5;

        for (int radek = 0; radek < velikostMrizky; radek++){
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++){
                if (radek == sloupec){
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
        */

        /*
        // obraceny Z
        int velikostMrizky = 5;

        for (int radek = 0; radek < velikostMrizky; radek++){
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++){
                if (radek == 0 || radek == velikostMrizky - 1 || radek == sloupec){
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }

         */

        /*
        // ctverecek
        int velikostMrizky = 10;

        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == 0 || radek == velikostMrizky - 1 || sloupec == 0 || sloupec == velikostMrizky - 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();

        }

         */

        //normalni Z
        int velikostMrizky = 10;

        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == 0 || radek == velikostMrizky - 1 || sloupec == 0 || sloupec == velikostMrizky - 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();

        }


    }
}
