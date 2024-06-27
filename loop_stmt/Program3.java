/*
Write a program to check whether the entered 
number is prime number or not.

Test Case 1: 
	Input : 7
	Output : true

Test Case 2: 
	Input : 15
	Output : false

*/
import java.util.Scanner  ; 
public class Program3 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in)  ; 
		// read num  
		int num  = s.nextInt()  ; 
		// count factors 
		int count = 2  ; // 1 & num itself is a factor 
		for ( int i = 2  ; i <= num / 2 ; i++  ){
			if( num % i == 0 )
				count++ ; 
		}
		// check if it is prime 
		if( count == 2 ){
			System.out.println("is prime");
		}
		else {
			System.out.println("it is not prime");
		}
	}
}
