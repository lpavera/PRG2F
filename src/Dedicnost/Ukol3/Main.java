package Dedicnost.Ukol3;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.drawShape();

        System.out.println();
        System.out.println();

        Square square = new Square();
        square.size = 5;

        System.out.println();
        System.out.println();

        Triangle triangle = new Triangle();
        triangle.height = 4;
    }
}
