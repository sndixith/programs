/*

For an Ecommerce application we need to write a logic to calculate the total price of the purchase after applying the discount.The discount are as follows,
If the customer is a teenager, flat discount 5%. If the total purchase price is above 5000 after the flat discount customer gets additional 5% discount.
If the customer is in 20's flat discount 6%. If the total purchase price is above 4000 after the flat discount customer gets additional 6% discount.
If the customer is aged above 29 flat discount 15%. 
Assume the age and total purchase price is given as input.
Write a program to calculate the total price of purchase after discount and display, 
total price before discount,total price after discount,discounted amount if any.


*/

import java.util.Scanner  ; 
public class Program5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in) ; 
        // read inputs 
        int age  = input.nextInt()  ; 
        double total_price  = input.nextDouble() ; 
        double price_after_discount = total_price ; 
        // lets apply discount 
        if( age >= 13 && age <= 19 ){
            // apply 5% discount 
            price_after_discount = total_price - ( total_price * 0.05) ; 
            // s2: apply another 5% if after disc price > 5000
            if(  price_after_discount > 5000   )
            {
                price_after_discount = price_after_discount - (price_after_discount*0.05);
            }// end of inner-if 
        }// end of outer if 
        else if( age >= 20 && age <= 29 )  {
            // s1: apply flat 6% discount 
            price_after_discount = total_price - ( total_price * 0.06) ; 
            // s2: cherck new price is greater than 4000 
            if(price_after_discount > 4000 ){
                price_after_discount = price_after_discount-(price_after_discount*0.06) ; 
            }// end of inner if 

        }// end of outer else if 
        else if( age > 29 ){
            // s1: apply flat 15% disc 
            price_after_discount = total_price - ( total_price * 0.15) ; 
        }
        // display the outputs 
        // 1 ---> total price 
        System.out.println(total_price);
        // 2 ---> total price after discount 
        System.out.println(price_after_discount);
        // 3 ---> discounted amount 
        System.out.println(total_price - price_after_discount);

    }
}
