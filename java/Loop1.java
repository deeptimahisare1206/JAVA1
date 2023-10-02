import java.util.*;

class Loop1{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter no.:  ");

int n = sc.nextInt();

/*
for(int i = 0; i<=n;i++){
System.out.println(i);
}

*/


// sum of n nauturak no.: 

int sum = 0;
for (int j = 1 ; j<= n; j++){
sum +=j;

} 
System.out.println(sum);



}
}