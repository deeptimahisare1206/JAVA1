interface Lambda{
	void hello();
}
class Lambdamain{
	public static void main(String args []){
		Lambda de =()->{
			System.out.println("Hello Lambda Expression");
		};
		de.hello();
	}
}