import java.util.*;
class Greater3 {
public static void main(String args[]){

int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the three numbers: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>b){
	if(a>c){
		
System.out.println("A is greater");
}
else
System.out.println("C is greater");
}


else{
	if(b>c){
		
System.out.println("B is greater");
}
else
System.out.println("C is greater");
}
}
}