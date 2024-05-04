
// write the java program to find the  area of sqaure 
 
import java.util.*;
public class B{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); 
        
        System.out.println("enter the side of square");
        int side  = sc.nextInt(); 

        int area = side * side; 

        System.out.println("area " + area);


    }
}