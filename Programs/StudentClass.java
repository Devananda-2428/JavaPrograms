class StudentClass {
    int studentId;
    String name;
    double marks;

    StudentClass(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    
    void Details() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(101, "Anu", 86);
        student1.Details();
        System.out.println("Passed: " + student1.isPassed());

        StudentClass student2 = new StudentClass(102, "Abin", 36);
        student2.Details();
        System.out.println("Passed: " + student2.isPassed());
    }
}
