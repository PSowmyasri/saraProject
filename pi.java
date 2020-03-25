import java.util.Scanner ;
import java.lang.* ;
public class pi{
 public static void piGenerator(int n){
	 	double dec = Math.pow(10,n);
	 	double newPi = Math.round(Math.PI * dec)/dec ;
	 	System.out.println(Math.PI);
	 	System.out.println(newPi);
	 	return ;
 	}
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of pi --less thna 10--");
		int n = s.nextInt();
		if(n <= 10 && n >= 0){
			piGenerator(n);
		}
		else
			System.out.println("Hey,why did u enter a wrong number");
	}
}
