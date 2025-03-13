import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = obj.nextLine();
        
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        obj.close();
    }
}

