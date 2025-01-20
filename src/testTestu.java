public class testTestu {
    public static void main(String[] args) {

        boolean bol = !(false && true) || (false && true);
        System.out.println(bol);

        boolean bol1 = (false && true);
        System.out.println("pravda a lez: " + bol1);
        boolean bol2 = !(false && true);
        System.out.println("negace pravda a lez: " + bol2);
        boolean bol3 = (false || true);
        System.out.println("pravda nebo lez: " + bol3);
    }
}
