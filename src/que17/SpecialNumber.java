package que17;
import java.util.Scanner;
public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i=1,sum=0,nsum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N Values");
		n = sc.nextInt();
		
		while (i<=n) 
		{
			System.out.println("Enter The Values");
			nsum = sc.nextInt();
				sum=sum+nsum;
				i++;
			}
		System.out.printf("The Sum  is %d ", sum);
	}

}
