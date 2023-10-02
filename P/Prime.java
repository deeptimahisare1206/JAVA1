import java.util.*;

class Prime{
	public static void main(String args[]){
		
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		
		if(n%1==0 || n%n==0){
			System.out.println(n + " is a prime number..");
			
		}
		else{
			System.out.println(n + " is not a prime number..");

		}
	}
	
}