/*

*/
import java.util.Scanner  ; 


public class Program1a {
    public static void main(String[] args){
        // step1 : create 2 char variables 
        char ch1 , ch2  ; 
        // step2 : read characters 
        Scanner s = new Scanner(System.in) ; 
        ch1 = s.next().charAt(0 ) ; 
        ch2 = s.next().charAt(0) ; 
        // logic
        if( ch1 < ch2 ){
            System.out.println( ch1);
        }
        else{
            System.out.println( ch2 );
        }
    }
}
