import java.util.Scanner;
public class Ascending {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = scan.nextInt();
		System.out.print("Enter Third Number: ");
		int num3 = scan.nextInt();
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.println("Ascending Order: "+num1+" "+num2+" "+num3);
		}
		else if(num1 >= num2 && num2 <= num3 && num1 <= num3){
		    System.out.println("Ascending Order: "+num2+" "+num1+" "+num3);
		}
		else if(num1 <= num2 && num2 >= num3 && num1 <= num3){
			    System.out.println("Ascending Order: "+num1+" "+num3+" "+num2);
		}
		else if(num1 <= num2 && num2 >= num3 && num1 >= num3){
			     System.out.println("Ascending Order: "+num3+" "+num1+" "+num2);
		}
		else if(num1 >= num2 && num2 <= num3 && num1 >= num3){
			      System.out.println("Ascending Order: "+num2+" "+num3+" "+num1);
		}
		else if(num1 >= num2 && num2 >= num3){
			      System.out.println("Ascending Order: "+num3+" "+num2+" "+num1);
		}
		
	}
}
