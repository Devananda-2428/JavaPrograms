import java.util.Scanner;

public class SortStringArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = obj.nextInt(); 
        
        String[] strings = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i<n; i++) {
            strings[i] = obj.nextLine();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        obj.close();
    }
}
