import java.util.*;

class Pattern1{
public static void main(String [] args){


/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter no.:  ");

int n = sc.nextInt();
*/

int n= 5;
int m = 5;


//=======================================
//SOLID RECTANGLE
System.out.println("1--->");
for(int i = 1; i<=n;i++){
	for(int j = 1; j <= m; j++){
	System.out.print(" * ");
}

System.out.println();
}

//==================================================

//HOLLOW RECTANGLE

System.out.println("2--->");

for (int i = 1; i<=n; i++){
	for (int j = 1; j<=m;j++){
		if (i==1||j==1||i==n||j==m){
			System.out.print(" * ");		
		}
		else
			System.out.print("   ");
	}
System.out.println();
}

//==================================================

//LOWER TRIANGLE

System.out.println("3--->");


for(int i =1 ;i<=n;i++){
	for(int j = 1; j<=i; j++){

		System.out.print(" * ");
}
	System.out.println();
}



//==================================================
            //INVERTED HALF PYRAMID
        System.out.println("4--->");

        for(int i=n ;i>=1;i--){
            
            for(int j=1; j<=i; j++){

                System.out.print(" * ");
            }
            System.out.println();
        }



//==================================================
            //INVERTED HALF PYRAMID by 180 degree
        System.out.println("5--->");
        
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=n-i ; j++){
            System.out.print("   ");
            }
            
            for(int k=1; k<=i ;k++){
                System.out.print(" * ");
            }
            System.out.println();
            }







}
}