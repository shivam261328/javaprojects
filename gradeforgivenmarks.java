
import java.util.*;

public class gradeforgivenmarks {
        public static void main(String arg[]) {
                int m1, m2, m3;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the marks of 3 subjects");
                m1 = sc.nextInt();
                m2 = sc.nextInt();
                m3 = sc.nextInt();
                float avg = (float) (m1 + m2 + m3) / 3;
                System.out.println("average"+avg);
                if (avg >= 70) {
                        System.out.println("A grade");
                } else if (avg >= 60 && avg <= 70) {
                        System.out.println("B grade");
                } else if (avg >= 50 && avg <= 60) {
                        System.out.println("C grade");
                } else if (avg >= 40 && avg <= 50) {
                        System.out.println("D grade");
                } else {
                        System.out.println("F grade");
                }
        }
}


