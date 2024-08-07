import java.util.*;
public class A_Little_Nikita {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0)
     {
       int n= sc.nextInt();
       int m=sc.nextInt();
       if(n>=m)
       System.out.println("Yes");
       else 
       System.out.println("No"); 
     }
     sc.close();
    }
 }