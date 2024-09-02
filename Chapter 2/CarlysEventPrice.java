import java.util.Scanner;

public class CarlysEventPrice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("******************************************");
        System.out.println("*    Carly's makes the food that makes   *");
        System.out.println("                it a party.              *");
        System.out.println("******************************************");
        
        System.out.println("Number of guests: ");
        int guests = scan.nextInt();
        int priceGuests = 35;
        System.out.println("Price per guests: $"+priceGuests);
        int totalPrice = guests * priceGuests;
        System.out.println("Total Price: $"+totalPrice);
        if(guests > 50){
            System.out.println("Large event: True");
        }
        else{
            System.out.println("Large event: False");
        }
    }
}
