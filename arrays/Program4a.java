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

 // solve using LinkedHashSet 

 import java.util.LinkedHashSet; 
public class Program4a {

    public static LinkedHashSet<Integer> removeDuplicates(int[] array){
        LinkedHashSet<Integer> newArray = new LinkedHashSet<>();
        for( int i = 0 ; i < array.length ; i++ ){
            // read element from array and insert it into 
            // LinkedHashSet 
            newArray.add(array[i]) ; // O(1) 
        }
        // time complexity : O(n)
        return newArray ; 
    }
    public static void main(String[] args) {
        int[] a = {4, 5, 9, 1, 5, 9, 3, 4, 6} ; 
        System.out.println(removeDuplicates(a));
    }
}
