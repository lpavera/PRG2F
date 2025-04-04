package OOP;

public class Kruznice {

    double polomer;

    public Kruznice(double polomer){
        this.polomer = polomer;
    }
    public double obsah(){
        System.out.println("Obvod je " + polomer * 2 * Math.PI);
        return polomer * 2 * Math.PI;
    }
    public  double obvod(){
        System.out.println("obsah je " + Math.PI * polomer * polomer);
        return Math.PI * polomer * polomer;
    }

}
