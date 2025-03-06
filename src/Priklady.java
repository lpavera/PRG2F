public class Priklady {

    //cviceni 1
    public static int soucet(int a, int b) {
        int vysledek = a + b;
        return vysledek;
    }

    //cviceni 2
    public static boolean jeSude(int c) {
        boolean cislo = c % 2 == 0;
        return cislo;
    }

    //cviceni 3
    public static String uvitaciZprava(String jmeno) {
        return "Ahoj, " + jmeno + "! Vítej.";
    }

    //cviceni 4
    public static int mocnina(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * mocnina(x, n - 1); /*
        x * x^n-1

        pokud
        x = 2
        n = 3

        2 * 2^3-1 = 2 * 2^2 = 2 * 4 = 8

        2^3 = 8
        */
    }

    //cviceni 5
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * faktorial(n - 1);  //faktorial 5 = 5*4*3*2*1 = 120
    }
/*
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Pokud je n 0 nebo 1, vrátíme 1
        } else {
            int vysledek = 1;
            for (int i = 2; i <= n; i++) {
                vysledek *= i;  // Vynásobíme hodnoty od 2 do n
            }
            return vysledek;
        }
    }
    */

    //cviceni 6
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //cviceni 7
    public static int[] bubbleSort(int[] pole) {
        int n = pole.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pole[j] > pole[j + 1]) {
                    int temp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = temp;
                }
            }
        }
        return pole;
    }

    //cviceni 8
    public static int[] zdvojnasobPole(int[] pole) {
        int[] novePole = new int[pole.length];// Vytvořím nové pole stejné délky
        for (int i = 0; i < pole.length; i++) { // Projdu každý prvek
            novePole[i] = pole[i] * 2;  // Zdvojnásobím hodnotu a uložíme do nového pole
        }
        return novePole;
    }

    //cviceni 9
    public static int[] filtrujSudaCisla(int[] pole) {
        return java.util.Arrays.stream(pole).filter(x -> x % 2 == 0).toArray();
    }
    /*
    public static int[] filtrujSudaCisla(int[] pole) {
        int[] sudaCisla = bubbleSort(pole);
        int count = 0;
        for (int num : sudaCisla) {
            if (num % 2 == 0) count++;
        }
        int[] vysledek = new int[count];
        int index = 0;
        for (int num : sudaCisla) {
            if (num % 2 == 0) vysledek[index++] = num;
        }
        return vysledek;
    }
    */


    public static void main(String[] args) {
        System.out.println(soucet(3, 5)); // 8
        System.out.println(jeSude(4)); // true
        System.out.println(uvitaciZprava("Jan")); // Ahoj, Jan! Vítej.
        System.out.println(mocnina(2, 3)); // 8
        System.out.println(faktorial(5)); // 120
        System.out.println(fibonacci(6)); // 8
        System.out.println(java.util.Arrays.toString(bubbleSort(new int[]{3, 1, 4, 1, 5, 9, 2, 6}))); // Setříděné pole
        System.out.println(java.util.Arrays.toString(zdvojnasobPole(new int[]{1, 2, 3}))); // [2, 4, 6]
        System.out.println(java.util.Arrays.toString(filtrujSudaCisla(new int[]{1, 2, 3, 4, 5, 6}))); // [2, 4, 6]
    }
}
