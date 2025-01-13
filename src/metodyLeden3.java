public class metodyLeden3 {
    static void DoubleA(int a){
        a = a * 2;
        System.out.println(a);
    }

    static void pridatKonec(StringBuilder text){
        text.append(" konec");
    }
    public static void main(String[] args) {

        int a = 5;
        DoubleA(a);
        System.out.println(a); // vypíše 5 neboli to co je int a v mainu

        StringBuilder mujText = new StringBuilder("Začátek");
        System.out.println(mujText);

        pridatKonec(mujText);

        System.out.println(mujText);
    }
}
