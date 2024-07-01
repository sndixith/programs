/*
Write a program to find the reverse of a given number 
and check whether the given number is palindrome or not.

Description:

A palindrome is a word, sentence, verse, or even number 
that reads the same backward or forward.

Input : 12321
Reverse of the given number: 12321
The input and reverse number are same so it's called Palindrome

Test Case 1: 
	Input : 8767 
	Output : false

Test Case 2: 
	Input : 985589
	Output : true

Test Case 3: 
	Input : 65298
	Output : false
*/
import java.util.Scanner  ; 
public class Program6 {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in)  ; 
		// read 1 num 
		int num  = s.nextInt() ; 
		int temp = num ; 
		// logic to reverse 
		// initialize rev to 0 
		int reverse  = 0  ; 
		while( num != 0 ){
			int digit  = num % 10 ; 
			reverse  = reverse * 10 + digit  ;  
			num = num /  10  ; 
		}
		System.out.println(reverse);
		// check for palindrome 
		// compare original number with reversed number 
		if( temp == reverse  )
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
	}
}
