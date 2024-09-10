public class fibonacci{
   public static void main(String[] args){
   
   int num = 10;
   int firstNum = 0;
   int secondNum = 1;
   
   System.out.println("Fibonacci Sequence: ");
   
   for(int i = 0; i <= num; i++){
      System.out.println("Fibonacci("+i+") = "+firstNum);
         int thirdNum = firstNum + secondNum;
         firstNum = secondNum;
         secondNum = thirdNum;
         
         }
   }
}
 
