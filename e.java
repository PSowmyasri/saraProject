import java.util.Scanner ;
import java.lang.* ;
public class e{
 public static void eGenerator(int n){
	 	double dec = Math.pow(10,n);
	 	double e = Math.exp(1);
	 	double newE = Math.round(e * dec)/dec ;
	 	System.out.println(newE);
	 	return ;
 	}
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of e --less than 10--");
		int n = s.nextInt();
		if(n <= 10 && n >= 0){
			eGenerator(n);
		}
		else
			System.out.println("Hey, why did u enter a wrong number");
	}
}
