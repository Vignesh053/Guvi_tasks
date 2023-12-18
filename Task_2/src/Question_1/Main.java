package Question_1;

public class Main {
    public static void main(String[] args)  {
        Person person1 = new Person("david");
        Person person2 = new Person("jack", 26);
        Person person3 = new Person("robert", 68);

        person1.displayName();
        person2.displayName();
        person3.displayName();
    }
}
