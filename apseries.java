import java.util.*;
public class apseries {
    public static void main(String arg[]) {
        int n, a, d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        System.out.println("enter the value of a");
        a=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a = a + d;
            d=5;
            System.out.println(a);
        }
    }
}
