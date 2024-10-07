public class hodina5 {
    public static void main(String[] args) {


        /*
        //vypisování dne
        int day = 1;
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Anything else");
                break;
       }
         */

        //5 vypíše je sobota
        //6 vypíše je neděle
        //zbytek vypíše je pracovní týden

        int day = 5;
        switch (day){
            case 5:
                System.out.println("Je sobota");
                break;
            case 6:
                System.out.println("Je neděle");
                break;
            default:
                System.out.println("Je pracovní týden");
                break;
        }


    }
}
