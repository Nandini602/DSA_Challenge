
// area of the circle 

import java.util.*;
public class G_area{
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the radius");
        float radius = sc.nextFloat();

        float area = 3.14f*radius*radius;
        System.out.println("area " + area);
    

    }
}