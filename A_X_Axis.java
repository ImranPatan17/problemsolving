import java.util.*;

public class A_X_Axis{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int a[]= new  int[3];
for (int i= 0; i < 3; i++) {
    a[i]=sc.nextInt();
}
int sum=0;
Arrays.sort(a);
for (int j = 0; j < a.length; j++) {
    

sum+=Math.abs(a[j]-a[1]);
}
System.out.println(sum);
    }
    sc.close();
    }
}