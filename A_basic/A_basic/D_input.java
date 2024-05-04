
import java.util.*;

public class D_input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("enter the int");
        int a = sc.nextInt();
        System.out.println("a " + a); 

        System.out.println("enter the short");
        Short s = sc.nextShort();
        System.out.println("s " + s);

        System.out.println("enter the byte");
        Byte b = sc.nextByte();
        System.out.println("b " + b);

        System.out.println("enter the Long");
        long l = sc.nextLong();
        System.out.println("l " + l);

        System.out.println("enter the float");
        float  f = sc.nextFloat();
        System.out.println("f " + f);

        System.out.println("enter the Double");
        Double d = sc.nextDouble();
        System.out.println(d);

        System.out.println("enter the Boolean");
        Boolean b1 = sc.nextBoolean();
        System.out.println(b1);

        System.out.println("enter the String");
        String s1 = sc.nextLine();
        System.out.println(s1);



    }
}