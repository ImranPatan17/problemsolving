import java.util.Scanner;

public class B_Card_Game{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        
        int a[]=new int [4];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
      int sol =0;
    if ((a[0]>a[2] && a[1]>=a[3]) || (a[0]>=a[2] && a[1]>a[3]))
       sol++;
        if ((a[0]>a[3]) && (a[1]>=a[2]) || (a[0]>=a[3]) && (a[1]>a[2]))
      sol++;
      System.out.println(sol*2);
   
    }
    }
}