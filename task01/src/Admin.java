
import java.util.ArrayList;

public class Admin extends User {

    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> instructors = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();

    public Admin(String name, String password) {
        super(name, password);
    }

   public void addStudents(ArrayList<String> students){
        this.students.addAll(students);
   }

   public void addInstructors(ArrayList<String> instructors){
        this.instructors.addAll(instructors);
   }

   public void addCourses(ArrayList<String> courses){
        this.courses.addAll(courses);
   }

    @Override
    void printUser() {
        System.out.println("Welcome " + this.getUsername() + " to the admin dashboard");
        System.out.println("----------------------------");
        System.out.println("Students: " + students);
        System.out.println("Instructors: " + instructors);
        System.out.println("Courses: " + courses);
    }

   
}
