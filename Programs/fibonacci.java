import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n=obj.nextInt();
        
        int a=0,b=1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;
        }
        obj.close();
    }
}
