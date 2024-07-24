import java.util.*;
public class A_Creating_Words{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
    String str1=sc.next();
    String str2=sc.next();
    char ch1=str1.charAt(0);
    char ch2=str2.charAt(0);
    System.out.println(ch2+str1.substring(1,3)+" "+ch1+str2.substring(1,3));
        }
        sc.close();
 }
}