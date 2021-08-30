package que18;
import java.util.Scanner;
public class Print3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value Of A");
		a = sc.nextInt();
		System.out.println("Enter The Value Of B");
		b = sc.nextInt();

		while (a<=b && a>=b )
		{
			if (a>b) {
				System.out.println(a);
				a--;
			}
			else if (a<b){
			System.out.println(a);
			a++ ;
			}
		}
	}

}
