import java.util.Scanner;

public class suplikcykly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }

         */

        /*
        for (int i = 20; i >=0; i -= 2){
            System.out.println(i);
        }
        */
        System.out.println("toto je příklad na cyklus \"FOR\"");

        int radky = 6;
        int sloupce = 8;
        int x = 1;

        for (int i = 1; i <= radky; i++){ // ++i nejdriv zvýší o 1  a pak vypíše ALE i++ nejdriv vypíše a pak zvýší o 1
            for (int j = 1; j <= sloupce; j++){
                System.out.print(x++ + "\t");   // misto println je tam print aby to nejelo na dalsi řádek hned
            }
            System.out.println();
        }


    }
}
