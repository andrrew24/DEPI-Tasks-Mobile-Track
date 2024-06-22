import java.util.ArrayList;

public class Instructor extends User {

    ArrayList<String> students = new ArrayList<>();

    public Instructor(String name,String password){
        super(name, password);
    }

    @Override
    void printUser() {
        System.out.println("Welcome " + this.getUsername() + " to the instructor dashboard");
        System.out.println("----------------------------");
        System.out.println("Here are your students: ");
        System.out.println("Students: " + students);
    }

    public void addStudent(String student){
        this.students.add(student);
    }

    public void addStudents(ArrayList<String> students){
        this.students.addAll(students);
    }

        
}
