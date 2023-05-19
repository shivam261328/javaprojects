import java.util.*;

public class countdigitofanumber {
    public static void main(String arg[]) {
        int n, r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        int m=n;
        while (n > 0) {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if(m==rev)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}