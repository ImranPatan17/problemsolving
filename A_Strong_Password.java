import java.util.*;
public class A_Strong_Password{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        
String s=sc.next();
StringBuilder inserted = new StringBuilder(s);
boolean found = false;

for (int i = 0; i < inserted.length() - 1; i++) {
    if (inserted.charAt(i) == inserted.charAt(i + 1)) {
        char c = inserted.charAt(i);
        inserted.insert(i + 1, (char)(c + 1));
        found = true;
        break; 
    }
}
if(found == true)
System.out.println( inserted.toString());
else
{
    if (s.length()==1) {
        char c=s.charAt(0);
        System.out.println((char)(c+1)+s);
    }
    else
    System.out.println(s);
}

    }
    sc.close();
   } 
 }