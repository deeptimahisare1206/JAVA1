interface Demo{
	void display();
}

class Demo1 implements Demo{
	public void display(){
		System.out.println("The interface.");
	}
}

class Interface1{
	public static void main(String args []){
		Demo de = new Demo1();
		de.display();
	}
}