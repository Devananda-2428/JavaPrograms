import java.util.Scanner;
public class ArrayReverse{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int a= obj.nextInt();
        
        int arr[]=new int[a];
        System.out.println("Enter the elements:");
        for (int i=0;i<a;i++){
            arr[i]=obj.nextInt();
        }
        
        System.out.println("The Original array:");
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("The Reversed Array:");
        for (int i=a-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        
        obj.close();
    }
}