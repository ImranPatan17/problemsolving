import java.util.*;

public class A_Problem_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str = new String();
            str = sc.next();
            int count[] = new int[10];
            char ch[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == (ch[i])) {
                        count[i]++;
                    }
                }

            }
            int total = 0;
            for (int i = 0; i < 7; i++) {
                if (count[i] < m) {
                    int missing = m - count[i];
                    total += missing;
                }
            }
            System.out.println(total);
        }

        sc.close();
    }

}
