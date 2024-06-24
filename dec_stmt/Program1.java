import java.util.Scanner  ; 

/*
    largest of 2 integer numbers 
*/


class Program1{
    public static void main(String[] args ){
        // step1 : create 2 integer variables
        int num1  , num2  ; 
        // step2 : read data using Scanner 
        Scanner s = new Scanner(System.in) ; 
        num1 = s.nextInt()  ; 
        num2 = s.nextInt()  ; 
        // step3 is the logic to find largest 
        if( num1 > num2 ){
            System.out.println( num1 ) ;
        }
        else {
            System.out.println( num2 ) ;
        }
    }
}







