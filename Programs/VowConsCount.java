import java.util.Scanner;

public class VowConsCount {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str=obj.nextLine().toLowerCase();
        
        int vowels=0, consonants=0;
        
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        obj.close();
    }
}
