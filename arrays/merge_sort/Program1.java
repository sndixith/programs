/*
 *  To Merge 2 sorted arrays 
 * 
 *  input: 
 *          a1 : [ 2, 3 , 7] 
 *          a2 : [ 3, 5, 6,8 ]
 * 
 *  output: 
 *          a : [2,3,4,5,6,7,8]
 */

class Program1{

    public static int[] merge(int[] a1 , int[] a2  ) {
        // s1 : create new array a of size m + n 
        int[] a = new int[a1.length + a2.length] ; 

        // s2 : index i , j & k 
        int i = 0 , j = 0 , k = 0 ;  

        // s3 : compare data & copy 
        while( i < a1.length && j < a2.length){
            if( a1[i] < a2[j]){
                a[k++] = a1[i++ ] ; 
            }
            else {
                a[k++] = a2[j++] ; 
            }
        }// end of while

        // s4: copy remaining elements (extra ) to a 
        // for a1 
        while( i < a1.length){
            a[k++] = a1[i++ ]  ; 
        }
        // for a2 
        while( j < a2.length){
            a[k++] = a2[j++] ;
        }

        // return merged array 
        return a  ; 
    }

    // utility method to print array 
    public static void printArray( int[] a){
        for( int i = 00 ; i < a.length ; i++ ){
            System.out.print(a[i]+ ", ");
        }
    }

    public static void main(String[] args) {
        int[] a1 = { 1,2 ,5,8,9 } ; 
        int[] a2 = {0, 3 , 8 } ; 

        int[] a = merge(a1, a2) ; 

        // print a 
        printArray(a);
    }
}