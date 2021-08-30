package que14;
import java.util.Scanner;
public class AmoebaMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1=0, n2=1 , n3 = 0 ,i , number ;
		
		System.out.println("Enter The Number");
		 number =sc.nextInt();
			
		 for (i = 2 ; i<number ; ++i ) {
			 n3 = n1+n2 ;
			 n1 = n2;
			 n2 = n3 ;		 
		 }
			
		 System.out.println( n3 );
	}

}
