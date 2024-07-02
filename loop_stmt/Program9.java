/*
 * 
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153

 */
import java.util.Scanner  ; 
public class Program9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        // step1 : read num 
        int num = s.nextInt() ; 
        // step2: preserve original 
        int original_num  = num  ; 
        // step3 : find m (leangth of num)
        int count = 0 ;  
        while( num != 0 ){
            num /= 10 ; 
            count++  ; 
        }
        int m = count  ; 
        // step4 : calculate sum 
        num = original_num ; 
        int sum = 0 ;  
        while( num != 0 ){
            // obtain d 
            int d = num % 10  ; 
            // calculate d^m 
            int power = 1 ; 
            for ( int i = 1 ; i <= m ; i++ ){
                power = power * d ; 
            }// end of inner for loop
            sum = sum + power  ; 
            // update num 
            num /=10 ; 
        }// end of while loop 
        System.out.println(sum);
        // step 5: compare sum with original num 
        if( original_num == sum  )
            System.out.println("it is special");
        else 
            System.out.println("it is not special") ;

    }// end of main
}
