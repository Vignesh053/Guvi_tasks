package Question_1;

public class Student {
    int rollno;
    String name;
    int age;
    String course;


    public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException  {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;

        //check if the name only contains alphabets and spaces
        if(!name.matches("[a-zA-Z ]*")){
            
            throw new NameNotValidException("Your name is not valid");
            

        }

        //check if age is between 15 to 21
        if(age< 15 || age > 21){
            
        throw new AgeNotWithinRangeException("Your age is not valid");


            
        }

    }


    
}
