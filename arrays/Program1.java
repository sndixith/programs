/*
    Write a method to return the count of even elements  
    in the given integer array

    Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 3

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 4

    Test Case 3: 

	Input : [ 5, -24, 47,- 21 ,58]
	Output : 1


 */
class Program1{
    
	// design a metho 
	public static int evenCount(int[] array){
		// s1: create count and initialize with 0 
		int count = 0 ; 
		// s2: 
		for( int i = 0 ; i < array.length ; i++ ){
			// check for even 
			if( array[i] % 2 == 0 ){
				// increase count 
				count++  ; 
			}// end of if 
		}// end of for 
		// s3: return count 
		return count  ; 
	}

	public static void main(String[] args) {
		int[] a = { 2 , 3 ,4 ,5} ; 
		System.out.println( evenCount(a) );

	}
}