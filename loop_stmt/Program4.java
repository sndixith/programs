/*
Write a program to Calculate the GCD (HCF) of 
two given natural numbers.

Test Case 1: 
	Input : 15 
	Input : 25
	Output : 5

Test Case 2: 
	Input : 6 
	Input : 9
	Output : 3
*/
import java.util.Scanner ; 
public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        // s1: read n1 & n2 
        int n1 = s.nextInt() ; 
        int n2 = s.nextInt() ; 
        // s2: find largest 
        int largest = n1 > n2 ? n1 : n2  ; 
        // s3: initialize hcf = 1 
        int hcf = 1  ; 
        // s4 : find CF from i = largest/2 upto 2 
        for( int i = largest/2 ; i >= 2 ; i-- ){
            // check for CF 
            if( n1 % i == 0 && n2 % i == 0 )
            {
                hcf = i  ; 
                break ; 
            }// end of if 
        }// end of for 
        System.out.println(hcf);
    }
}
