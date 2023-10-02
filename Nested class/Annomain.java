import java.util.*;
interface Anno{
	void display();
}
class Annomain{
	public static void main(String args []){
		
		Anno an = new Anno(){
			public void display(){
			Scanner sc = new Scanner(System.in);
			String ch;
			System.out.println("Enter your name: ");
			ch = sc.nextLine();
				System.out.println("Welcome " + ch);
			}
		};
		an.display();
	}
}