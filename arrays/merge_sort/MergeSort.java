public class MergeSort {
    
    // mergeSort method 
    // divide left and right array and merge 
    public static void mergeSort(int[] arr , int start , int end ){

        if( start < end ){
            // s1 : calculate mid 
            int mid = (start + end ) / 2  ; 
            // s2: divide left array 
            mergeSort(arr , start , mid ) ; 
            // s3: divide right array 
            mergeSort( arr , mid + 1 , end ) ; 
            // merge 
            merge( arr  , start , mid , end ) ; 
        }
    }

    // merge method 
    public static void merge( int[] arr , int start , int mid , int end ){
        // s1 : calculate size of left & right array 
        int left_array_size = mid - start + 1  ; 
        int right_array_size = end - mid  ;  

        // s2 : create left and right array 
        int[] left_array = new int[left_array_size] ; 
        int[] right_array = new int[right_array_size] ; 

        // copy data to left array 
        for( int i = 0 ; i < left_array.length ; i++ ){
            left_array[i] = arr[ start + i ]  ;  // important 
        }

        // copy right data 
        for( int i = 0 ; i < right_array_size ; i++ ){
            right_array[i] = arr[ mid + 1 + i  ] ; 
        }

        // merge left and right array 
        // index i , j & k represents left , right and arr array 
        int i = 0 ; 
        int j = 0 ; 
        int k = start  ; 

        while( i < left_array_size && j < right_array_size){
            if( left_array[i] < right_array[j]){
                arr[k++] = left_array[i++] ; 
            }
            else {
                arr[k++] = right_array[j++ ] ; 
            }

        }// end of while 

        // copy remaining elements 
        // left 
        while( i < left_array_size){
            arr[k++] = left_array[i++]  ; 
        }
        // right 
        while( j < right_array_size){
            arr[k++] = right_array[j++] ; 
        }
    }// end of merge method 


    // utility method to print array 
    public static void printArray( int[] arr){
        for( int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 2,0,1,3,7,5} ; 
        // sort using mergeSort 
        mergeSort(a, 0, a.length-1 );
        // print array 
        printArray(a); 
    }
}
