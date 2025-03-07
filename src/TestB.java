import java.util.Arrays;

public class TestB {
    public static double mocnina (double a){
        a = a * a;
        return a;
    }

    public static void swap(int[] pole1, int pos1, int pos2) {
        pos1 = pole1.length + 1;
        pos2 = pole1.length - 1;
    }

    public static void naDruhou (int[] pole){
        for (int i = 0; i < pole.length ; i++){
           pole[i] = pole[i] * pole[i];
        }
    }
    public static void main(String[] args) {
        System.out.println(mocnina(5));
        int[] pole = new int[]{3, 1, 4, 1, 5, 9};
        naDruhou(pole);
        System.out.println(Arrays.toString(pole));
        int []pole1 = new int[]{1,2};
        System.out.println(Arrays.toString(pole1));
    }
}
