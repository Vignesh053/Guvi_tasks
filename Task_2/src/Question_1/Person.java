package Question_1;

public class Person {
    int age = 18;
    String name;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Person(String name){
        this.name = name;
    }


    void displayName(){
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
    }
}
