import java.util.Scanner;

public class area {
    public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the Radius:");
        double r=obj.nextInt();

        double area=Math.PI*r*r;
        System.out.println("Area of the circle is:"+area);

        obj.close();

    }    
}
