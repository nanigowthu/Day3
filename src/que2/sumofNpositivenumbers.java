package que2;
import java.util.Scanner;
public class sumofNpositivenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0, count=0,i=1,b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The values of N");
		n = sc.nextInt();
		
		
		while (i<=n)
		{
			System.out.println("Enter N Numbers");
			b = sc.nextInt();
			i++;
			
			
			if (b>=0) {
				count++; 
				sum = sum+b;
				
			}
			
			
		}
		System.out.printf("Number of postive numbers %d and the number of sum is %d", count , sum);
	}

}
