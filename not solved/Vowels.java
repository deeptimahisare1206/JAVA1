import java.util.*;
class Vowels{

public static void main(String args []){

char ltr;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the character: ");
ltr = sc.next();

if( (ltr=='a')  ||  ltr=='e'  ||  ltr=='i'  ||  ltr=='o'  ||  ltr=='u' )
System.out.println("The letter is vowel. ");

else
System.out.println("The letter is consonant. ");


}

}