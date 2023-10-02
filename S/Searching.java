import java.util.*;

class Searching{
	public static void main(String srgs[]){
		int i ,j , k , n,search,f=0;
		
		int a[]=new int[10];
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the array size: ");
		n= sc.nextInt();
		System.out.println("Enter the array numbers: ");
		for(k=1 ; k<=n; k++){
			a[k]=sc.nextInt();
		}
		
		
		System.out.println("Enter the number you want to search: ");
		search = sc.nextInt();
		
		for(i=0 ; i<=n ; i++){
			if(a[i]==search){
				
				System.out.println(search +" found at "+i);
				f++;
				break;
			}
		}
		if(f==0){
			System.out.println(search + " not found....");
			
		}
		
		
	}
}