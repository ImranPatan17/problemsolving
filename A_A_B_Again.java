import java.util.Scanner;

public class A_A_B_Again{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
int n=sc.nextInt();
int a=n/10;
int b=n%10;
System.out.println(a+b);
    }
    sc.close();
    }
}