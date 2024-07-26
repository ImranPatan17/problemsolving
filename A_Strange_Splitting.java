import java.util.*;
public class A_Strange_Splitting{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
    int n=sc.nextInt();
    int a[]=new int [n];
    StringBuilder str=new StringBuilder();
     for (int i = 0; i < a.length; i++) 
          a[i]=sc.nextInt();
          boolean same=true;
    for (int i = 0; i < a.length; i++) {
          if(a[i]!= a[0]){
          same=false;
          break;
          }
    }
        if(!same) {
            for (int i = 0; i < a.length; i++) {
                if (i == 1) { // Check if it's the second element (index 1)
                    str.append("B");
                } else {
                    str.append("R");
                }
            }
            System.out.println("YES");
            // Print the pattern
            System.out.println(str.toString());
   }
else 
System.out.println("NO");
        }
        sc.close();
       }
    }