import java.util.*;
public class A_Catch_the_Coin{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
         
            int y=sc.nextInt();
        //     int mx=0,my=0;
        //     if(y<=0){
        //         while( my>=0){
        //         mx--;
        //         my--;
        //         y--;
        //         }
        //         if(my==y )
        //         System.out.println("YES");
        //         else
        //         System.out.println("NO");
        //         System.out.println("my="+my+" y="+y); 
        //     }
        //     // if(my==y)
        // //     //     System.out.println("YES");
        // //     //     else
        // //     //     System.out.println("NO");
         
        //  if(y>0)
        //  {
        //     while(my<y){
        //         mx++;
        //         my++;y--;
        //     }
        //      if(my==y )
        //     System.out.println("YES");
        //     else
        //     System.out.println("NO");
               
        //         System.out.println("my="+my+" y="+y); 
        //     }
        //     // if(my==y)
        //     // System.out.println("YES");
        //     // else
        //     // System.out.println("NO");
        if(y>=-1)
        System.out.println("YES");
        else 
        System.out.println("NO");
        }
        sc.close();
    }
}