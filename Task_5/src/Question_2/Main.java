package Question_2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {

        
        List<String> list = List.of("abc", "", "bd", "dak","wdad", "","wdrf");

        //use filter to filter out the blank spaces and collect the strings in a new list
        List<String> nonEmptyList = list.stream().filter(s -> !s.isBlank()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(nonEmptyList);
    }
}
