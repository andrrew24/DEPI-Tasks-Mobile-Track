import java.util.ArrayList;
import java.util.Arrays;

public final class Database {

    public Database(){
        addStudents();
        addInstructors();
        addAdmin();
    }

    private final ArrayList<User> users = new ArrayList<>();

    public void addStudents(){
        Student s1 = new Student("John", "1234");
        Student s2 = new Student("Jane", "1234");

        s1.addCourse("Math");
        s1.addCourse("English");
        
        s2.addCourses(new ArrayList<>(Arrays.asList("Math", "English")));
        users.add(s1);
        users.add(s2);
    }

    public void addInstructors(){
        Instructor i1 = new Instructor("Instructor1", "1234");
        i1.addStudent("John");
        i1.addStudent("Jane");
        Instructor i2 = new Instructor("Instructor2", "1234");
        i2.addStudent("John");

        users.add(i1);
        users.add(i2);
    }

    public void addAdmin(){
        Admin a1 = new Admin("Admin", "1234");
        a1.addCourses(new ArrayList<>(Arrays.asList("Math", "English")));
        a1.addStudents(new ArrayList<>(Arrays.asList("John", "Jane")));
        a1.addInstructors(new ArrayList<>(Arrays.asList("Instructor", "Instructor2")));

        users.add(a1);
    }

    public User authenticate(String username, String password){
        for(User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

}
