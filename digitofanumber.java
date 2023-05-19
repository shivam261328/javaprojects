import java.lang.*;
import java.util.*;

public class digitofanumber {
    public static void main(String arg[]) {
        int n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        while(n>0)
        {
            r=n%10;
            System.out.println(r);
            n=n/10;


        }

    }
}
