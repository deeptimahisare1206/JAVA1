import java.util.*;
class IncDecrement{
public static void main(String args[]){
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the two numbers ");
a=sc.nextInt();
b=sc.nextInt();

c=a*b;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);

c=a*b++;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);

c=a*++b;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);

c=--a*b++;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);

}
}