/*
A school follows a day wise time table for its students to play a specific  game
TIME TABLE  
Monday: Basket Ball 
Tuesday: Tennis 
Wednesday: Basket Ball
Thursday: Cricket
Friday: Tennis
Saturday: Exercise 
Sunday: Holiday 
Design a simple application which can read the day of the week and suggest to the student which game he is supposed to play today by following the prescribed timetable designed by the school.

*/

import java.util.Scanner  ; 
public class Program4a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ; 
        String day  = s.next().toLowerCase()  ; 
        switch( day ){
            case "monday" :     
            case "wednesday" : {
                                    System.out.println("Basket Ball") ;
                                }
                                break ; 
            case "tuesday":
            case "friday" : System.out.println("Tennies");
                            break ; 
            case "thursday": System.out.println("Cricket");
                            break ; 
            case "saturday": System.out.println("Exercise");
                            break ; 
            case "sunday" : System.out.println("Holiday");
                            break ; 
            default : System.out.println("Invalid Day");
        }
    }
}
