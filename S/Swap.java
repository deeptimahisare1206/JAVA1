import java.util.*;
class Swap{
public static void main(String args[]){
int a,b;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the two numbers ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swapping:");
System.out.println("a="+a);
System.out.println("b="+b);
a+=b;
b=a-b;
a=a-b;
System.out.println("After Swapping:");
System.out.println("a="+a);
System.out.println("b="+b);

}
}