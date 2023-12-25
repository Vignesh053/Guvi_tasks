package Question_1;


import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // create a list of strings
        List<String> list = List.of("aBc","d","ef","gh","iJk");


        // use map in streams api to make every string into uppercase and collect them in a list
        List<String> upperCaseList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(upperCaseList);
        
    }

   

}
