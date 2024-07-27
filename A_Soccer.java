import java.util.Scanner;
public class A_Soccer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
    int []x=new int[2];
    int []y=new int[2];
    x[0]=sc.nextInt();
    y[0]=sc.nextInt();
    x[1]=sc.nextInt();
    y[1]=sc.nextInt();
    int numPoints = 100;

    // Check for equality at each intermediate point
    boolean foundEqual = false;
    for (int i = 0; i <= numPoints; i++) {
        double ti = (double) i / numPoints;
        double xValue = x[0] + ti * (x[1] - x[0]);
        double yValue =  + ti * (y[1] - y[0]);
        if (xValue == yValue) {
            System.out.println("NO");
            foundEqual = true;
        }
    }
    if (!foundEqual)
    System.out.println("YES");

        }
       }
    }