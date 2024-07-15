/*
 * Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

    Test Case 1: 

	Input: [1, 2, 3, 4] 
Output: [24, 12, 8, 6]


Test Case 2: 

	Input: [2, 3, 4, 5]
Output: [60, 40, 30, 24]


 */
class Program6{
    
    public static int[] genArray(int[] array){
        // creating new array for the length of given array 
        int[] newArray = new int[array.length] ; 
        for( int i = 0 ; i < array.length ; i++ ){
            int product = 1 ; 
            for( int j = 0 ; j < array.length; j++ ){
                if( i != j )
                    product = product * array[j] ; 
            }
            newArray[i] = product ; 
        }
        return newArray ; 
    }

    public static void main(String[] args) {
        int[] a = { 0 , 2 ,3 ,4} ; 
        int[] res  = genArray(a ) ; 
        for( int i = 0 ; i < res.length ; i++ ){
            System.out.print(res[i] + ", ");
        }
    }
}

