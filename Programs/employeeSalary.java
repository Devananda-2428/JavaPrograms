import java.util.Scanner;

public class employeeSalary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter job role (1-Manager, 2-Developer, 3-Intern): ");
        int role = sc.nextInt();
        
        System.out.println("Enter years of experience: ");
        int experience = sc.nextInt();
        
        double salary;
        switch (role) {
            case 1: salary = 80000; 
                    break;
            case 2: salary = 50000; 
                    break;
            case 3: salary = 20000; 
                    break;
            default: System.out.println("Invalid role"); 
                        return;
        }
        
        if (experience > 5) {
            salary *= 1.2;
        } else if (experience >= 3) {
            salary *= 1.1;
        }
        
        System.out.println("Final Salary: " + salary);
        sc.close();
    }
    
    
}
