import java.util.Scanner;
public class SammysRentalPrice{
    public static void main(String[] args){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S   Sammy's make it fun in the sun.    S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of minutes: ");
        int rentedMinutes = scan.nextInt();
        int hour = rentedMinutes / 60;
        System.out.println("Hours: "+hour);
        
        int addPerMin = rentedMinutes - (hour * 60);
        System.out.println("Remaining Minutes: "+addPerMin);
        
        int rentalPrice = 40;
        int totalPrice = hour * rentalPrice + addPerMin;
        System.out.println("Total Price: $"+totalPrice);
        
        

        
        
        
        
    }
}
