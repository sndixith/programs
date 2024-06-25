/*
    Problem Definition : 

    Write a program that takes three inputs from the user and checks how many of these inputs are even. Depending on the number of even inputs, the program should perform different operations:
    1. If only one input is even, the program should print that even number.
    2. If two inputs are even, the program should print the sum of the two even numbers.
    3. If all three inputs are even, the program should print the product of all three numbers.
    4. If no input is even, the program should print 0.

*/
import java.util.Scanner  ; 
public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ; 
        // variable to store count 
        int count  = 0  ; 
        int num1 = s.nextInt()  ;
        if( num1 %2 == 0 )
            count++  ; 
        int num2  = s.nextInt()  ; 
        // using conditional operator 
        count = num2 %2 == 0 ? count+1 : count  ; 
        int num3  = s.nextInt()  ; 
        count  = num3 % 2 == 0? count+1 : count  ; 
        // switch 
        switch ( count ){
            case 1 : {
                       if( num1 % 2== 0 )
                            System.out.println(num1 );  
                       if( num2 % 2== 0 )
                            System.out.println(num2 ); 
                       if( num3 % 2== 0 )
                            System.out.println(num3 );    
                    }break ; 
            case 2 : {
                        System.out.println("case2: "+ count);
                        if( num1 %2 == 0 && num2 % 2 ==0 )
                            System.out.println( num1 + num2  );
                        // do for remaining possibilities 
                        
                    }break ; 
            case 3 : {
                        System.out.println(num1 * num2 * num3 );    
                    }break ; 
        }
    }    
}




