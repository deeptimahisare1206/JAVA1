import java.util.*;

class X{
	
	private int a;
	int b;
	
	void getvalue(){
		System.out.println("Enter the two values: ");		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	int call(){
		return a;
	}
}

class Y extends X{
	
	int c;
	void calculate(){
		c = call()*b;
	}
	
	void display(){
		System.out.println(call() + " X " + b +" = " + c);
	}
}

class Single{
	public static void main(String args []){
	
	Y y = new Y();
	y.getvalue();
	y.calculate();	
	y.display();
	}
}