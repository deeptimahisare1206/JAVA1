class Super{
	void show(){
		System.out.println("This is the Super class...");
	}
}

class Sub extends Super{
	void show(){
		System.out.println("This override the super class....");
	}
}

class Override{
	public static void main (String args []){
		Sub sb = new Sub();
		sb.show();
	}
}