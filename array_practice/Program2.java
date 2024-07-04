import java.util.Scanner  ; 
public class Program2 {
    // read size from the user 
    // create int[] for user provided size 
    // initialize data by reading it from the user 
    // print all the data present in the array 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ; 
        // read size 
        System.out.println("Enter size : ");
        int size  = s.nextInt()  ; 
       // creating array object 
        int[] a = new int[size] ; 
        // read elements 
        a[4] = 20 ; // Compile Time Success 
        // Exception--->  ArrayIndexOutOfBoundsException

        for( int index = 0 ; index < a.length ; index++ ){
            a[index] = s.nextInt() ; 
        } 
        // print array elements 
        for( int index = 0 ; index < a.length ; index++){
            System.out.print(a[index] + ", ");
        }
    }
}