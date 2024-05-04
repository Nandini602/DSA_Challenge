

// enter  the cost of the 3 items the user ,a pencile , pen , eraser 

import java.util.*;
public class C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the cost of  pencile, pen, eraser") ;

         float p = sc.nextFloat();
         float pen = sc.nextFloat();
         float eraser = sc.nextFloat();

          float total_cost = (p+pen +eraser);
          System.out.println(total_cost);  

          float tax = (total_cost*(0.18f)); 

          System.out.println(tax);

    }
}