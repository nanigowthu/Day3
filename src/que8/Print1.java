package que8;
import java.util.Scanner;
public class Print1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int a,b ;
		 System.out.println("Enter The Values Of A");
			a = sc.nextInt();
			System.out.println("Enter The Values Of B");
			b = sc.nextInt();	
			
			while (a<=b) {
				System.out.println(a);
				a++ ;
			}
	}

}
