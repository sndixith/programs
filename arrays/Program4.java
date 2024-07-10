/*
 * Given an array of integers, write a method to remove all 
 * duplicate elements from the array. The method should return 
 * a new array that contains only the unique elements from the 
 * original array, maintaining their original order.
 * 
 * Test Case 1: 

	Input: [4, 5, 9, 1, 5, 9, 3, 4, 6]
	Output: [4, 5, 9, 1, 3, 6]


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :      [2,3]

 */

public class Program4 {

    // method to accept and int[] and return int[] 
    public static int[] removeDuplicates(int[] array){
        // s1: create new array of size n 
        int[] newArray = new int[array.length] ; 

        // s2: copy first element 
        newArray[0] = array[0] ; 

        // s3: create k and initialize 1 
        int k = 1 ;  

        // s4: insert remaining unique elements 
        for( int i = 1 ; i < array.length ; i++  ){
            // s4.1 : check if ith element is present in new array
            // compare ith element with elements in new array upto k
            int j = 0 ; 
            for(  ; j < k ; j++ ){
                if( array[i] == newArray[j]){
                        break ; 
                }// end of if 
            }// end of inner for 
             // when should we insert ?
            if( j == k  ){
                newArray[k++] = array[i] ; 
            }
        }// end of outer for 

        // s5: trimming 
        int[] b = new int[k ] ; 
        for( int i = 0 ; i < k ; i++ ){
            b[i] = newArray[i] ; 
        }
        // newArray = Arrays.copyOf( newArray, k ) ; 
        return b ; 
    }

     public static void main(String[] args) {
        int[] a = {4, 5, 9, 1, 5, 9, 3, 4, 6}     ; 
        int[] b  = removeDuplicates(a) ; 
        for( int i = 0 ; i < b.length ; i++ ){
            System.out.print(b[i]+ ", ");
        }
     }
}
