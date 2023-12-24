package Question_2;

public class Voter {
    private int voterId;
    private String name;
    private int age;
    
    

    public Voter(int voterId, String name, int age) throws InvalidAgeException{
        this.voterId = voterId;
        this.name = name;
        this.age = age;


        //check if the age is greater than 18, if not, throws exception
        if(age < 18){
            throw new InvalidAgeException("Invalid Age For Voter");
        }

    }


}
