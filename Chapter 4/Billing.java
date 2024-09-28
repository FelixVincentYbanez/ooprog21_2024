public class Billing{
   public static void main(String[] args){
   
   computeBill(23.2);
   computeBill(23.2, 2);
   computeBill(23.2, 3, 2);

   
  }
   public static void computeBill(double price){
      double result = price + (price * 0.08);
           System.out.println("The total price for the bill is: $"+result);
   }
      public static void computeBill(double price, int quantity){
       double result = (price + (price * 0.08)) * 2;
           System.out.println("The total price for the bill is: $"+result);

      }
      public static void computeBill(double price, int quantity, int coupon){
       double result = ((price + (price * 0.08)) * 3) - 2;
       System.out.println("The total price for the bill is: $"+result);

      }
   }
