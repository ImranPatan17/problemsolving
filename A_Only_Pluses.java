import java.util.*;
import java.util.Arrays;
public class A_Only_Pluses{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int [] arr=new int [3];
           for (int i = 0; i < 3; i++) {
            arr[i]=sc.nextInt();
           }
           for (int i = 0; i < 5; i++) {
            Arrays.sort(arr);
            arr[0]++;
            System.out.println("1: " +arr[0]+"|| " +"2: " +arr[1]+"|| " +"3: " +arr[2]);
           }


int sum=0;
           
            sum+=arr[0]*arr[1]*arr[2];
            System.out.println(sum);
        }
        sc.close();
    }
}