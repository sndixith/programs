/*
 * Design a Java program that checks if a given number is a "Symmetric Power Number." 
A Symmetric Power Number is defined as a positive integer with an even number of digits that can be divided exactly into two equal parts from the middle. When these two parts are summed and the result is squared, it should equal the original number itself.
Write the Java program to implement this concept. Ensure that the program:
Prompts the user to enter a positive integer.
Determines if the entered number qualifies as a Symmetric Power Number based on the described criteria.
Prints whether the number is a Symmetric Power Number or not.
Example:
Input :2025 
After the split of the number in 2 half and addition the Sum is 45 and Square of it is 2025
Output :"Symmetric Power Number."

Test Case 1: 

	Input  : 2025
	Output : "Symmetric Power Number."

Test Case 2: 

	Input  : 2468
	Output :  "Not-Symmetric Power Number."

Test Case 3: 

	Input  : 13123
	Output : "Invalid Number”



 */
import java.util.Scanner  ; 
public class Program11 {

    // method to return length of num 
    public static int length(int num ){
        int count = 0  ;
        while( num !=0 ){
           num /= 10  ; 
           count++ ; 
        } 
        return count  ; 
    }

    // to reverse 
    public static int reverse(int num ){
        int rev = 0 ; 
        while( num !=0 ){
            int d = num % 10 ; 
            rev = rev * 10 + d  ; 
            num /= 10 ; 
        }
        return rev  ; 
    }

    // find n2 second half 
    private static int findN2(int num , int length ){
        int n2  = 0 ; 
        for( int i = 1 ; i <= length/2 ; i++ ){
            int d = num % 10  ; 
            n2 = n2 * 10 + d  ; 
            num /= 10  ; 
        }
        return reverse(n2) ; 
    }  

    // method to find n1 first half
    private static int findN1(int num , int len ){
        for( int i = 1 ; i <= len / 2 ; i++ ){
            num /= 10  ; 
        }
        return num  ; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        // s1 : read + ve integer
        int num = s.nextInt() ; 
        // s2 : find length of num 
        int len = length(num) ; 
        // s3 : check if len is even 
        
        if( len % 2 == 0 ){
            // s4: check for symmetric 
            // s4.1 : find n1 & n2 
            // s4.1.1 : find n2
            int n2 = findN2(num, len) ; 
            // s4.1.2 : find n1 
            int n1 = findN1( num , len ) ; 
            // s4.2 : find sum 
            int sum = n1 + n2  ; 
            // s4.3 : find square 
            int square = sum * sum ; 
            // s4.4 : check for symmetric 
            if( num == square){
                System.out.println("Symmetric");
            }
            else
                System.out.println("not-symmetric");
        }
        else 
        {
            System.out.println("Invalid Number");
        }
    }
}
