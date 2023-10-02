import java.util.*;

class greatsmall{
public static void main(String [] args){

Scanner sc = new Scanner (System.in);
System.out.println("Enter Firrst no.: ");
int a = sc.nextInt();
System.out.println("Enter Second no.: ");
int b  = sc.nextInt();

if(a<b){
System.out.println("a is smaller");
}

else if(a==b){
System.out.println("a and b are equal");
}

else{
System.out.println("a is greater");
}
}
}