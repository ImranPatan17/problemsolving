import java.util.*;
public class A_Upload_More_RAM{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k==1)
        System.out.println(n);
        else
        {
            int min=(n-1)*k+1;
            System.out.println(min);
        }
        
    }
}
}