import java.util.ArrayList;
import java.util.Scanner;
class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}
public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Student " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }

        double average = (double) total / students.size();
        int highest = students.get(0).marks;

        for (Student s : students) {
            if (s.marks > highest) {
                highest = s.marks;
            }
        }

        int lowest = students.get(0).marks;
        for (Student s : students) {
            if (s.marks < lowest) {
                lowest = s.marks;
            }
        }

        System.out.println("Student Report");
        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }

        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);

        sc.close();
    }

}