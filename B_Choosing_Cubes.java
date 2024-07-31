import java.util.Arrays;
import java.util.*;
public class B_Choosing_Cubes{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int n=sc.nextInt();
        int f=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int ele=a[f];
        Arrays.sort(a, Collections.reverseOrder());
    }
    sc.close();
   } 
 }