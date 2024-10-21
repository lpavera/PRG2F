import java.util.Scanner;

public class cyklyFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //vypsat násobky 5 od 1 do 1000
        /*
        //verze cyklus while

        int i = 1;
        while (i < 1000) {
            System.out.println(i);
            i += 5;
        }

         */
/*
        //verze cyklus for

        for (int i = 0; i <= 1000; i += 5){
            System.out.println(i);
        }


 */




/*
        //vypsat vsecky cisla od 100 do 0

        for (int i = 100; i >= 0; i--){
            System.out.println(i);
        }
*/
/*
        //upravit cyklus

        //for (int i = 100; i >= 0; i--){
        //    System.out.println(i);
        //}

        //aby vypisoval 2 mocnina cisel

        for (int i = 100; i >= 0; i--){
            System.out.println(i*i);
        }
  */


        //vypsat malou nasobilku
        /*
        //moje reseni
        for (int a = 1; a <= 10){
            a = a+a;
        }
        for (int b = 2; b <= 20){
            b = b+b;
        }
        for (int c = 3; c <= 30){
            c = c+c;
        }
        for (int d = 4; d <= 40){
            d = d+d;
        }
        for (int f = 5; f <= 50){
            f = f+f;
        }
        for (int g = 6; g <= 60){
            g = g+g;
        }
        for (int h = 7; h <= 70){
            h = h+h;
        }
        for (int i = 8; i <= 80){
            i = i+i;
        }
        for (int j = 9; j <= 90){
            j = j+j;
        }
        for (int k = 10; k <= 100){
            k = k+k;
        }
        */


        //lepsi reseni
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i * j + " ");
            }
            System.out.println();
        }

    }
}
