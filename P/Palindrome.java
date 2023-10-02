import java.util.*;
class Palindrome{
public static void main (String args[]){
int  num , s = 0, a, original;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
num = sc.nextInt();
original = num;
while(num!=0){
a = num%10;
num  = num/10;
s = (s*10)+a;

}
if(s==original)
System.out.println(" The number is a palindrome.");

else
System.out.println(" The number is not a palindrome.");


}

}