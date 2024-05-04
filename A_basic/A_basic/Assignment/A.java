
// write the java program to find the input of the 3 elements 
import java.util.*;
public class A{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;

        System.out.println("avg " + avg);
    } 
}