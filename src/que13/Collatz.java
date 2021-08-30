package que13;
import java.util.Scanner;
public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while (n != 1 )
		{
			System.out.println(n);
			
			if ((n & 1) == 1);
			
			else 
				n = n/2 ;
				
		}
		 
		System.out.println( n );
	}

}
