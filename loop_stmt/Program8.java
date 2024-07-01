/*
 * We have a concept called a "Zigzag Number." 
A Zig-zag Number is formed by interleaving the digits of two 
equal-length input numbers.
Given two input numbers, determine the Zigzag Number and print 
the output
Explanation:
The candidate should recognize the interleaving pattern:
Take the first digit from the first input number.
Take the last digit from the second input number.
Continue this process alternately until all digits from both 
numbers are used.
This explanation demonstrates their understanding of the 
interleaving process used to form a Zigzag Number.

Test Case 1: 

	Input 1 : 927
	Input 2 : 613
	Output : 932176

Test Case 2: 

	Input 1 : 514
	Input 2 : 706
	Output : 561047

Test Case 3: 

	Input 1 : 32
	Input 2 : 190
	Output : Invalid

 */
import java.util.Scanner  ; 
public class Program8 {

    // returns length of the number(number of digits)
    public static int length( int num ){
        int count = 0 ; 
        while( num != 0 ){
            num /= 10 ; 
            count++ ; 
        }
        return count  ; 
    }

    // returns reverse of a number 
    public static int reverse(int num) {
        int rev = 0 ;
        // logic for reverse
        while( num != 0 ){
            int d = num % 10 ; 
            rev = rev * 10 + d  ; 
            num /= 10  ; 
        } 
        return rev ; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        int num1 = s.nextInt()  ; 
        int num2 = s.nextInt()  ; 
        // find the length validate for zigzag
        if(length( num1) == length(num2) ){
            // find zigzag number 
            // step1: reverse num1 
            int rev_of_num1  = reverse( num1  ) ; 
            int zigzag = 0  ; 
            while( rev_of_num1 != 0 ){
                // extract from rev_of_num1
                int d  = rev_of_num1 % 10  ; 
                zigzag = zigzag * 10 + d  ; 
                // extract from num2 
                d = num2 % 10  ; 
                zigzag = zigzag * 10 + d ; 
                // update 
                rev_of_num1 /= 10 ; 
                num2 /= 10  ; 
            }// end of loop 
            System.out.println(zigzag);
        }
        else{
            // if length not same
            System.out.println("invalid");
        }
    }
}


/*
        condition for loop (r_of_n1 != 0 && num2 != 0 )
 *          r_o_n1 = 23 
 *          num2 = 245 
 * after 1st iteration
 *          r_o_n1 = 2
 *          num2 = 24
 * after 2nd cycle 
 *          r_o_n1 = 0 
 *          num2 = 2
 *          
 */