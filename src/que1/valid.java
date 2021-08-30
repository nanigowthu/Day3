package que1;
import java.util.Scanner;
public class valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c =0;
		
		Scanner sc = new Scanner(System.in);
		

		while (c<=8)
		{
			System.out.println("Enter The Number");
			 n = sc.nextInt();
			 if (n%8==0) {
				 c++ ;
			 }
			 else {
				 System.out.println(c);break;
			 }
		}
	}

}
