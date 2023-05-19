import java.util.*;
public class oddoreven {
    public static void main(String arg[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
