import java.util.Scanner ;
public class fibonacci{
 public static void fibonacciGenerator(int n){
 	int first, sec, third;
 	first = 0;
 	sec = 1;
 	int counter = 3;
 	if(n==1){
 		System.out.println(first);
 		return ;
 	}
 	if(n==2){
 		System.out.println(first);
 		System.out.println(sec);
 		return ;

 	}
 	System.out.println(first);
 	System.out.println(sec);
 	while(n>2 && counter <= n){
 		third = first + sec ;
 		if(n==3)
 			System.out.println(third);
 		else{
 			System.out.println(third);
 			first = sec;
 			sec = third ;
 		}
 		counter = counter + 1 ;
 	}
 	return ;

 }
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of fibonnacci chain");
		int n = s.nextInt();
		if(n>0)
			fibonacciGenerator(n);
		else
			System.out.println("Why did u give wrong Number");

	}
}
