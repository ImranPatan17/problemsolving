import java.util.*;

public class A_Turtle_and_Piggy_Are_Playing_a_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int l = sc.nextInt();
            double r = sc.nextInt();
            
            
            int result=(int)(Math.log(r)/Math.log(2));
            System.out.println(result);
        }
        sc.close();
    }
}