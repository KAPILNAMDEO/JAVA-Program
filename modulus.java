import java.util.*;
public class helloworld {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int modulus=0;
        int x=sc.nextInt();
        int y=sc.nextInt();


        modulus=x%y;
        System.out.println("modulus : "+modulus);
    }
}