public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Khaled", 21, 3.7);

        s1.displayInfo();
        s1.study();
        s1.displayInfo();
    }
}

// Attributes
class Student {
    String name;
    int age;
    double gpa;

    // Constructor
    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void takeExam() {
        System.out.println(name + " is doing the exam.");
    }
}
