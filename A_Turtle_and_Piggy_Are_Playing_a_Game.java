import java.util.*;

public class A_Turtle_and_Piggy_Are_Playing_a_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = r;
            int p = l;
            int score = 0;
            while (x > 1) {
                x = x / p;
                score++;
            }
            System.out.println(score);
        }
        sc.close();
    }
}