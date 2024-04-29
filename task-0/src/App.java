import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        // Define instructors credentials
         final String[][] instructorsInfo = {
            {"instructor1","instPass1"},
            {"instructor2","instPass2"},
            {"instructor3","instPass3"},
            {"instructor4","instPass4"},
        };

        // Define students credentials
         final String[][] studentsInfo = {
            {"student1","stuPass1"},
            {"student2","stuPass2"},
            {"student3","stuPass3"},
            {"student4","stuPass4"},
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Course Center Application!");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        // Combine user input in single array
        String[] UserandPass = {username,password};

        // Define course list and course's students
        String[] courseList = {"Java Programming","Web Devlopment","Data Science","Machine Learning"};
        String[] studentsList = {"student1","student2","student3","student4"};


        // Define a flag refers if credentials are valid or not
        boolean isValid = false;
        
        while (!isValid) { 

            //Search credentials exist in instructorsInfo list
            for(String[] i : instructorsInfo){
                if (Arrays.equals(UserandPass, i)) {

                    // Print login success message and students list
                    // Set isValid true
                    // Break the loop
                    System.out.println("Login successful!, List of Students:");
                    for(String j : studentsList){
                        System.out.println("- " + j);
                    }
                    isValid = true;
                    break;
                }
                
            }

            //Search credentials exist in studentsInfo list
            for(String[] i : studentsInfo){
                if (Arrays.equals(UserandPass, i)) {

                    // Print login success message and courses list
                    // Set isValid true
                    // Break loop
                    System.out.println("Login successful!, List of Courses:");
                    for(String j : courseList){
                        System.out.println("- " + j);
                    }
                    isValid = true;
                    break;
                }
            }
            // If credentials not found show error message
            // Break the loop
            if (!isValid) {
                System.out.println("Invalid username or password, Please try again.");
                break;
            }
               
        } 
        scanner.close();
    }
}
