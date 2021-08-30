package que15;
import java.util.Scanner;
public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k,l,m,n,i,j,f,s ;
		
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		m=k; i=j=s=0;
		n=k*k;
		
		if (k==45) {
			System.out.println("Kaprekar Number");
		}
		else {
			while (m>1) {
				m=m/10 ;
				i++;
		}
			while (j<i)
			{
				f=n%10;
				j++;
			}
			l=s+n;
			if (l==k) {
				System.out.println("Kaprekar Number");
			}
			else {
				System.out.println("NOT A Kaprekar Number");
			}
	}
	}

}
