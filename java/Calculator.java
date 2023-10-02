import java.util.*;

class Calculator{
public static void main(String [] args){

Scanner sc = new Scanner (System.in);
System.out.println("Enter first no.: ");
int x = sc.nextInt();
System.out.println("Enter operator no. 1-5(A,S,M,D,Mo.): ");
int op= sc.nextInt();
System.out.println("Enter Second no.: ");
int y = sc.nextInt();

switch(op){
case 1:
System.out.println("Sum:  "+ (x+y));
break;
case 2:
System.out.println("Difference:   "+(x-y));
break;
case 3:
System.out.println("Multiple:    "+(x*y));
break;
case 4: if (y==0){
System.out.println("Invalid .... ");
}
else 
System.out.println("Divide:   "+(x/y));
break;
case 5:
if (y==0){
System.out.println("Invalid .... ");
}
else 
System.out.println("Modulus:   "+ (x%y));
break;
default:
System.out.println("Invalid Operator...");
}
}
}