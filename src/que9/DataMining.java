package que9;
import java.util.Scanner;
public class DataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,sum=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		n = sc.nextInt();
		
		while (n>0) 
		{
			m = n%10 ;
			if (m%2==0) {
				sum = sum+m ;
			}
			else {
				sum1 = sum1+m ;
			
			}
			n=n/10 ;
		}
		if (sum==sum1) 
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
