import java.util.*;

public class B_Angry_Monk{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int t=sc.nextInt();
    while(t-->0)
    {
// int n=sc.nextInt();
int k=sc.nextInt();
ArrayList<Integer> ar=new ArrayList<Integer>();
for (int i = 0; i < k; i++) {
    int num=sc.nextInt();
    ar.add(num);
}
Collections.sort(ar);

int op=0;
for (int i = 0; i < k-1; i++) {
   op+=ar.get(i)+ar.get(i)-1;

}
System.out.println(op);
    }
    sc.close();
    }
}
