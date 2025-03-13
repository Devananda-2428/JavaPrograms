import java.util.Scanner;
public class rect{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the Length:");
        int l=obj.nextInt();

        System.out.println("Enter the Breadth:");
        int b=obj.nextInt();

        int a=l*b;
        int p=2*(l+b);
        System.out.println("The area of Rectangle:"+a);
        System.out.println("The perimeter of Rectangle:"+p);

        obj.close();

    }
}