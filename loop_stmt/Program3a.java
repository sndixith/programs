/*
 design a method which can accept an int and 
 return true if the int is prime, 
 false if int is not a prime
*/
import java.util.Scanner  ; 
public class Program3a {
 
    public static boolean isPrime( int num ) {
        // count number of factors 
        int count = 2  ; // 1 & n are already factors of n 
        for( int i = 2  ; i <= num/2 ; i++ )
        {
            if( num % i == 0 )
                count ++ ; 
        }
        return count == 2  ; 
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in) ; 
        // int num  = s.nextInt()  ; 
        // // check for prime by calling method 
        // if( isPrime( num ) )
        //     System.out.println("it is prime ");
        // else 
        //     System.out.println("it is not prime");
       
        // print prime numbers between 10 & 20
        for ( int i = 10 ; i <= 20 ; i++ ){
            if( isPrime( i ) )
                System.out.println(i);
        }
    }

}
