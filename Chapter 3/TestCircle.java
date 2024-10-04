import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();
        a.setRadius(3);
        System.out.println("Circle a:");
        System.out.println("Radius: " + Circle.getRadius());
        System.out.println("Diameter: " + Circle.getDiameter());
        System.out.println("Area: " + Circle.getArea());
        b.setRadius(20);
        System.out.println("Circle b:");
        System.out.println("Radius: " + Circle.getRadius());
        System.out.println("Diameter: " + Circle.getDiameter());
        System.out.println("Area: " + Circle.getArea());

        System.out.print("Input value: ");
        double value = scan.nextDouble();

        c.setRadius(value);
        System.out.println("Circle c:");
        System.out.println("Radius: " + Circle.getRadius());
        System.out.println("Diameter: " + Circle.getDiameter());
        System.out.println("Area: " + Circle.getArea());


        
    }
}
