package que7;
import java.util.Scanner;
public class Mutiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number  N ");
		n = sc.nextInt();
		
		System.out.println("Enter The Number  M ");
		m = sc.nextInt();
		
		
		
		
		
		while (i<=m) 
		{
			System.out.printf("%d * %d = %d \n", i ,n , i*n);
			i++;
		}
	}

}
