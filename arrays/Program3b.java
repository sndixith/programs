/*
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ​


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */
import java.util.HashSet ; 
public class Program3b {

    public static void frequencyCount(int[] array){
        // create hashset
        HashSet<Integer> hs = new HashSet<>() ; 
        // insert array elements into hashSet 
        for( int i = 0 ; i < array.length ; i++ ){
            hs.add(array[i]) ; 
        }

        for( int element : hs){
            int count = 0 ; 
            for( int i = 0 ; i < array.length ; i++ ){
                if( element == array[i])
                    count++ ; 
            }
            System.out.println(element + " : " + count );
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 6 , 1 , 0 , 8} ; 
        frequencyCount(a);
    }
}
