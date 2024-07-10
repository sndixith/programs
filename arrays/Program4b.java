/*
 * 
 *  remove duplicates from the sorted array 
 *  sorted in ascending order
 * 
 *  i/p: a = [ 2,3,3,4,6,6,6,7,10] 
 *  o/p: b = [ 2,3,4,6,7,10] 
 * 
 */
import java.util.Arrays ; 
public class Program4b {
    
    public static int[] removeDuplicates(int[] array){
        int[] newArray = new int[array.length] ; 
        newArray[0] = array[0] ; 
        int k = 0  ; 
        for( int i = 1 ; i <array.length ; i++ ){
            if( array[i] > newArray[k]){
                newArray[++k] = array[i] ; 
            }
        }
        // trim array to k 
        newArray = Arrays.copyOf(newArray , k+1 ) ; 
        return newArray ; 
    }

    public static void main(String[] args) {
        int[] a = { 2,3,3,4,6,6,6,7,10} ;
        a = removeDuplicates(a) ; 
        for( int i = 0 ; i < a.length ; i++ ){
            System.out.print(a[i] + ", ");
        }
    }
}
