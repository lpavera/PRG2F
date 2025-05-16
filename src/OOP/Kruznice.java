package OOP;

public class Kruznice {

    private double polomer;

    public double getPolomer() {
        return polomer;
    }

    public void setPolomer(double polomer){
        if(polomer < 0.0) {
            return;
        }

        this.polomer = polomer;
    }

    /*public Kruznice(double polomer){
        this.polomer = polomer;
    }*/


    public double obvod(){
        System.out.println("Obvod je " + polomer * 2 * Math.PI);
        return polomer * 2 * Math.PI;
    }
    public  double obsah(){
        System.out.println("obsah je " + Math.PI * polomer * polomer);
        return Math.PI * polomer * polomer;
    }

}
