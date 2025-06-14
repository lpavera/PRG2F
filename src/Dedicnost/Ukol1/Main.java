package Dedicnost.Ukol1;

public class Main {
    public static void main(String[] args) {
        Vehicle s = new Vehicle();
        s.speed = 50;
        s.move();

        System.out.println();
        System.out.println();

        Car truck = new Car();
        truck.color = "Zelená";
        truck.speed = 15;
        truck.move();
        truck.clarksonNoise();
    }

}
