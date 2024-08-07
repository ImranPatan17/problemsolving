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
        
        if((a[0]==a[1]) && (a[2]==a[3]))
    {
        if(a[0]>a[2] && a[1]>a[3])
        System.out.println(4);
        else
        System.out.println(0);
    }
    else if ((a[0]>a[2] && a[1]>a[3]) || (a[0]>a[3]) && (a[1]>a[2]))
        System.out.println(2);
   
   
    }
    }
}