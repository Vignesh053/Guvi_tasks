package Question_3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {

        //store 10 students name in a list
        List<String> students = List.of("Joe Pesci", "Ana de armas", "Robert de niro", "Amanda", "leornado",
                                     "Anne", "Bradley", "Jake Gyllenhaal", "Al Pacino","Brad Pitt");

        // collect the student's name starts with A                             
        List<String> studentsToRecieveGift = students.stream().filter(s-> s.startsWith("A")).collect(Collectors.toList());

        System.out.println(students);
        System.out.println(studentsToRecieveGift);
    }
}
 