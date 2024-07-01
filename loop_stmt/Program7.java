/*
* Write a Java program to find the largest digit  in the given series of number.

Description :
Input : 12321
Output : 3

 */
import java.util.Scanner  ; 
public class Program7 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        int num  = s.nextInt() ; 
        // assumption 
        int largest_digit = num %10  ; 
        num /= 10  ; 
        // check if the assumption is correct for remaining digits?
        while( num != 0 ){
            int digit = num % 10  ; 
            // check whether assumption is correct
            if( digit > largest_digit)
            {
                // assumption was wrong change largest digit
                largest_digit = digit ; 
            }
            // update 
            num  /= 10 ; 
        } // end of loop 
        System.out.println(largest_digit);
    }

}
