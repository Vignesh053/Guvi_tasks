package Question_4;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {


    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        


        while(true){
            
            // menu to add, rmove and display the students with grade
            System.out.println("Please choose an option by pressing the number and press enter to select it");
            System.out.println("1.add a student");
            System.out.println("2.remove student");
            System.out.println("3.display the grade of a student");
            System.out.println("4.Exit the program");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:{

                    System.out.println("Please enter the name of student");
                    String name = scanner.nextLine();
                    System.out.println();


                    System.out.println("please enter the grade for student");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();


                    addStudent(name, grade);

                    System.out.println("Student successfully added");

                    break;
                }

                case 2:{
                    System.out.println("please enter the name of the student you want to remove");
                    String name = scanner.nextLine();

                    removeStudent(name);




                    break;
                }

                case 3:{
                    System.out.println("please enter the name of student to display grade");
                    String name = scanner.nextLine();

                    displayStudentGrade(name);

                    break;
                }

                case 4:{
                    System.out.println("exiting the program");

                    scanner.close();
                    return;
                }
                    
                    
            
                default:

                    System.out.println("Invalid entry, try again");
                    break;
            }
        }
    }


    public static void addStudent(String name, Integer grade){
        map.put(name, grade);
    }

    public static void removeStudent(String name){
        if (map.containsKey(name)) {
            map.remove(name);
            System.out.println("Student with name " + name + " is successfully removed");
        } else {
            System.out.println("No student found with the name " + name);
        }
    }

    public static void displayStudentGrade(String name){
        if(map.containsKey(name)){
            System.out.println("the grade of "+ name + " is " + map.get(name));
        }else{
            System.out.println("the name of student you entered is wrong, please try again");
        }
    }
    
}



