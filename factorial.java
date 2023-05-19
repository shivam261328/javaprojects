import java.util.*;
public class factorial

{
    public static void main(String arg[])
    {
        int n,fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
