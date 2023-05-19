import java.util.*;
public class youngornotyoung {
    public static void main(String arg[]) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        age=sc.nextInt();
        if (age <14 ||  age <= 55) {
            System.out.println("young");
        } else {
            System.out.println("not young");
        }
    }
}
