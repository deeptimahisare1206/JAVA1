class Base{
	String color = "red";
}
class Derived extends Base{
	String color = "Green";
	void display(){
		System.out.println(super.color);
	System.out.println(color);
	}
}

class SuperVariable{
	public static void main(String args []){
		Derived d = new Derived();
		d.display();
	}
}