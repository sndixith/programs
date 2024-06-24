public class Program2b {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(system.in) ; 
        // 1 input 
        int hour = s.nextInt()  ; 
        if( hour >=5 && hour <= 11 ){
            System.out.println("Good Morning");   
        }
        else if(hour >= 12 && hour <= 16 ){
            System.out.println("Good Afternoon ");
        }
        else if( hour >= 17 && hour <= 20){
            System.out.println("good evening ");
        }
        else if ( hour >= 21 && hour < 24 || hour >= 0 && hour <= 4 )
        {
            System.out.println("good night");   
        }
        else{
            System.out.println("invalid Hour");
        }
    }


}
