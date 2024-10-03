public class TestCircle {
    public static void main(String[] args) {
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
    }
}
