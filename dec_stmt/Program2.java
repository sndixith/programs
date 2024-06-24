/*
    Design an app to read age of three siblings Ramu,
    Raghu and Raju and store them in a variable. 
    The app when executed  should display the age of the 
    youngest sibling. 
*/
import java.util.Scanner  ; 

public class Program2 {
    public static void main(String[] args) {
        int ramu , raghu  , raju  ; 
        Scanner s  = new Scanner(System.in)  ; 
        ramu = s.nextInt()  ; 
        raghu = s.nextInt()  ; 
        raju = s.nextInt()  ; 

        if( ramu < 0  || raghu < 0 || raju < 0  ){
            System.out.println("age is invalid ");
        }
        else if( ramu < raghu && ramu < raju ){
            System.out.println(ramu );
        }
        else if( raghu < raju  ){
            System.out.println( raghu);
        }
        else{
            System.out.println(raju);
        } 
    }
}
