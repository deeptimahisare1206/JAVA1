import java.util.*;

class A{
	int empid , salary;
	Scanner sc  = new Scanner(System.in);
	void getvalue(){
		System.out.println("Enter the employee id no.: ");
		empid = sc.nextInt();
		
		System.out.println("Enter the Salary: ");
		salary = sc.nextInt();
		
	}
}

class B extends A{
	int da , hra , pf;
	
	void calculate(){
		
		da = (salary*130)/100;
		hra = (salary*95)/100;
		pf = (salary*45)/100;
		
	}
}

class C extends B{
	int sum;
	void total(){
		
		sum = salary+da+hra-pf;
		
	}
	
	void display(){
		
		System.out.println("Employee id: " + empid);
		System.out.println("Employee Salary: " + salary);
		System.out.println("DA: " + da);
		System.out.println("HRA: " + hra);
		System.out.println("PF: -" + pf);
		System.out.println("________________________________________________");
		System.out.println("Total Salary: " + sum);
	}
}

class Multilevel{
	public static void main(String agrs []){
		
		C c = new C();
		c.getvalue();
		c.calculate();
		c.total();
		c.display();
	}
}