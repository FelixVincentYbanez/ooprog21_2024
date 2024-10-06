import java.util.Scanner;

public class BloodData {
    public static void main(String[] a) {
        TestBloodData tbt = new TestBloodData();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter blood type (A, B, O, or AB): ");
        String bloodType = scan.next();
        
        System.out.print("Enter RH factor (+ or -): ");
        String rhFactor = scan.next();
        
        tbt.displayBloodInfo(bloodType, rhFactor);
        
    }
}
