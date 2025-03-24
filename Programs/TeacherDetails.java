import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherId;

    Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void displayDetails() {
        System.out.println("--------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: $" + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class TeacherDetails {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = obj.nextInt();
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = obj.next();
            System.out.print("Gender: ");
            String gender = obj.next();
            System.out.print("Address: ");
            String address = obj.next();
            System.out.print("Age: ");
            int age = obj.nextInt();
            System.out.print("Employee ID: ");
            int empId = obj.nextInt();
            System.out.print("Company Name: ");
            String companyName = obj.next();
            System.out.print("Qualification: ");
            String qualification = obj.next();
            System.out.print("Salary: ");
            double salary = obj.nextDouble();
            System.out.print("Subject: ");
            String subject = obj.next();
            System.out.print("Department: ");
            String department = obj.next();
            System.out.print("Teacher ID: ");
            int teacherId = obj.nextInt();

            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }
        
        System.out.println("\nTeacher Details:");
        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }

        obj.close();
    }
}

