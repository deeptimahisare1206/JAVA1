class CommandLine{
	/*public static void main(String args []){
		
		int i;
		for(i = 0; i<args.length ; i++)
			System.out.println(args[i]);
	}
	*/
	
	
	public static void main(String args[]){
		
		int i, sum = 0, a;
		
		for( i = 0 ; i < args.length ; i++){
			a = Integer.parseInt(args[i]);
			sum += a;
		}
		System.out.println("Sum : " + sum);
		
		
	}
	
	
}