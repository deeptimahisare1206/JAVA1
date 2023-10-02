import java.util.*;

class Dimen{
	
	int r , length , breadth , base;
	float ar , height;
	
	//Area of circle....
	
	void area(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextInt();
		ar = 3.14f * r * r;
		System.out.println("Area of circle : " + ar);
		
	}
	
	//Area of Rectangle...
	
	void area(int l, int b){
		length = l;
		breadth = b;
		
		ar = l*b;
		
		System.out.println("Area of Rectangle : " + ar);
		
		
	}
	
	//Area of triangle...
	
	void area(int b , float h){
		
		base = b;
		height = h;
		ar = (1f/2f)* b * h;
		System.out.println("Area of Triangle : " + ar);
		
		
	}
}

class Shape{
	
	public static void main(String args []){
		
		int length,breadth , base;
		float height;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		System.out.println("Enter the base and heigth of the triangle: ");
		base = sc.nextInt();
		height = sc.nextFloat();
		
		Dimen dm = new Dimen();
		dm.area();
		
		dm.area(length , breadth);
		
		dm.area(base , height);
		
		
		
	}
}