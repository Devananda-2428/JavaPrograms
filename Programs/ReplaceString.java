import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String original=obj.nextLine();
        
        System.out.print("Enter the pattern to replace: ");
        String pattern=obj.nextLine();
        
        System.out.print("Enter the replacement string: ");
        String replace=obj.nextLine();
        
        String newstring=original.replace(pattern,replace);
        
        System.out.println("New string: "+newstring);
        
        obj.close();
    }
}
