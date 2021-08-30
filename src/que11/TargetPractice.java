package que11;
import java.util.Scanner;
public class TargetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,a,i=0,c=0,s=0;
		n = sc.nextInt();
		
		do {
			c ++ ;
			a = sc.nextInt();
			s+=a;
			i++;
		}
		while (s<n);
		{
			System.out.println(c);
		}
	}

}
