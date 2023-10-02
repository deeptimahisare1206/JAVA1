 class StaticOuter{
	static int a =900;
	static class StaticInner{
		static void show(){
			System.out.println("a = " + a);
		}
	}
}
class Staticmain{
	public static void main(String args []){
		StaticOuter.StaticInner SOSI = new StaticOuter.StaticInner();
		SOSI.show();
		//StaticOuter.StaticInner.show();
	}
}