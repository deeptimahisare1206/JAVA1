import java.util.*;

class Student{
	
	int rollno, marks;
	
	Student(int x, int y){
		rollno = x;
		marks = y;
	}
	
	void display(){
		
		System.out.println("Roll no: " + rollno);
		System.out.println("Marks: " + marks);
		
	}
}

class ParaCons{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student(101 , 123);
		st.display();
	}
}