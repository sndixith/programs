/*
 * Given an integer array nums and an integer val, 
remove all occurrences of val in nums in-place. 
The order of the elements may be changed. 
Then return the number of elements in nums which are not
 equal to val.

Consider the number of elements in nums which are not equal 
to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums 
contain the elements which are not equal to val. 
The remaining elements of nums are not important as well as the 
size of nums.

Return k.

Test Case 1: 

	Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]

Test Case 2: 

	Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]


 */

public class Program5 {
   
    public static int removeElement(int[] nums , int val ){
        // j represnts index of the data to be retained 
        int j = 0  ; 
        for( int i = 0 ; i < nums.length ; i++){
            if( nums[i] != val) {
                nums[j++] = nums[i] ; 
            }
        }
        // return count of elements without val 
        return j ; 
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2} ; 
        int k = removeElement(nums, 2 ) ; 
        System.out.println("count: " +  k );
        for( int i = 0 ; i < k ; i++ ){
            System.out.print(nums[i] + ", ");
        }
    }

}
