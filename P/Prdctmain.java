import java.util.*;

class Product{
	int pid,price;

	void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id: ");
		pid = sc.nextInt();
		System.out.println("Enter the product price: ");
		price = sc.nextInt();
	}
	
	void display(){
		
		System.out.println("Product id: " + pid);
		System.out.println("Product Price: " + price);
		
		
	}

}

class Prdctmain{
	public static void main(String args []){
		
		Product[] pt = new Product[3];
		
		for(int i=0;i<3;i++){
			pt[i]=new Product();
			pt[i].getdata();
		}
		
		for(int i=0;i<3;i++){
			pt[i].display();
		}
	
	}
	
	
}