import java.util.ArrayList;

public class Student extends User {

    ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String password) {
        super(name, password);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }

    public void addCourses(ArrayList<String> courses){
        this.courses.addAll(courses);
    }

    @Override
    void printUser() {
        System.out.println("Welcome " + this.getUsername() + " to the student dashboard");
        System.out.println("----------------------------");
        System.out.println("Here are your courses: ");
        System.out.println("Courses: " + courses);
    }

    
}
