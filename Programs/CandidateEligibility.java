import java.util.Scanner;

public class CandidateEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for three subjects(Mathematics,Physics,chemistry): ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        
        int total = sub1 + sub2 + sub3;
        int total1= sub1+sub2;
        if (total >= 200 || total1>=150) {
            System.out.println("Candidate is eligible.");
        } else {
            System.out.println("Candidate is not eligible.");
        }
        sc.close();
    }
}