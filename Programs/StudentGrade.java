import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student percentage: ");
        int percentage = sc.nextInt();
        
        
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        
        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Average.");
                break;
            case "D":
                System.out.println("Needs improvement.");
                break;
            case "F":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid input.");
        }

        sc.close();
    }
}