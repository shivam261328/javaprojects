import java.util.*;

public class gpseries {
    public static void main(String arg[]) {
        int n,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

