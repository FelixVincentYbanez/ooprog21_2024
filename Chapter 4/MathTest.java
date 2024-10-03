import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scan.nextDouble();

        System.out.println("SQRT: " + Math.sqrt(number));
        System.out.println("SIN: " + Math.sin(number));
        System.out.println("COS: " + Math.cos(number));
        System.out.println("FLOOR: " + Math.floor(number));
        System.out.println("CEIL: " + Math.ceil(number));
        System.out.println("ROUND: " + Math.round(number));
        System.out.println("MAX: " + Math.max(number, 71));
        System.out.println("MIN: " + Math.min(number, 68));
        System.out.println("RANDOM: " + (Math.random() * 100));
    }
}
