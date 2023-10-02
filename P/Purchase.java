import java.util.*;

class Employee{

int empno, salary;
String empname;

void calculate(){
int da ,hra , pf, Total;

da =(salary *30)/100;
hra =(salary *45)/100;
pf=(salary *10)/100;
Total = salary +da+hra-pf;
}

void getdata( int a , int b, String ch){
empno = a;
salary = b;
empname = ch;

}
void display(){
System.out.println("Employee number: " + empno);
System.out.println("Employee salary: " + salary);
System.out.println("Employee name: " + empname);
//  System.out.println("Total: " + Total);
}

}

class Empmain{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
Employee em = new Employee();

int eid, sa;
String na;

eid = sc.nextInt();
sa = sc.nextInt();
na = sc.nextLine();
 
em.getdata(eid,sa,na);
em.display();

}

}