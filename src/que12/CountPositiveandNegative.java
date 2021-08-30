package que12;
import java.util.Scanner;
public class CountPositiveandNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, i=1,j,c=0, c1=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Values of N");
		n = sc.nextInt();
		
		while (i<=n)
		{
			System.out.println("Enter The Values of N");
			
			j = sc.nextInt();
			 if (j>=0) {
				 c++;}
			 else 
					 c1++;
					 i++ ;
			 }
			 System.out.println("no +Ve numbers is  "+c);
			 System.out.println("no -Ve numbers is  "+c1);
	}

}
