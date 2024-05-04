
public class D_logical{
    public static void main(String args[]){
        // && || ! 

        boolean a = true;
        boolean b = false; 

        System.out.println(a&&b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b); 

        System.out.println("one more time"); 
        
        System.out.println("and operator");
        System.out.println((true && true));
        System.out.println((true && false));
        System.out.println((false && true));
        System.out.println((false && false));
       
        System.out.println("or operator");
        System.out.println((true || true));
        System.out.println((true || false));
        System.out.println((false || true));
        System.out.println((false || false));

    }
}