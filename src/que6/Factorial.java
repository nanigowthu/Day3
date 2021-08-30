package que6;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i=1 , s=1 ;
		Scanner sc = new Scanner("Enter The Number");
		
			n = sc.nextInt();
		
		 while (n<=0)
		 {
			 s=s*i ;
			 i++ ;
		 
		 if (s==1)
		 break ;
	
		 }
			 if (s==0)
			 System.out.println("YES");
			
			 else 
				 System.out.println("NO");
	}

}
