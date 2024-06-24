/*
  largest of 4 numbers 
*/
import java.util.Scanner  ; 

public class Program2a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        int num1 = s.nextInt()  ; 
        int num2 = s.nextInt()  ; 
        int num3 = s.nextInt()  ; 
        int num4 = s.nextInt()  ; 
        if( num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println(num1 );

        }
        else if( num2 > num3 && num2 > num4){
            System.out.println(num2 );
        }
        else if( num3 > num4){
            System.out.println(num3 );
        }
        else {
            System.out.println(num4 );
        }
    }
}
