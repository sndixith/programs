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

public class Program3 {


    public static void frequencyCount(int[] array){
        // logic 
        // s1: 
        int visited = Integer.MIN_VALUE ; 
        // s2 : find frequency
        for( int i = 0 ; i < array.length ; i++ ){
            // check if it is visited or not 
            int count = 1 ; 
            if( array[i] != visited ){
                // not visited 
                // frequency for ith element 
                for( int j = i+1 ; j < array.length ; j++ ){
                    // check if ith element is same as jth element
                    if( array[i] == array[j]){
                        count++  ; 
                        // replace the visited data 
                        array[j] = visited ; 
                    }// end of if 
                }// end of inner for 
                System.out.println(array[i] + " : " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 6 , 1 , 0 , 8} ; 
        frequencyCount(a);
    }

}
