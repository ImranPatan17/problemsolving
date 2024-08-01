import java.util.*;

public class B_Choosing_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            Integer[] array = new Integer[n];
            for (int i = 0; i < n; i++)
                array[i] = sc.nextInt();
            int fav = array[f - 1];
            Arrays.sort(array, Collections.reverseOrder());
            if (array[k - 1] < fav)
                System.out.println("YES");
            if (array[k - 1] == fav) {
                if ((k < n) && (array[k] == fav))
                    System.out.println("MAYBE");
                else
                    System.out.println("YES");
            }
            if (array[k - 1] > fav) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
