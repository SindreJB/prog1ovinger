public class Person {
    
    private final int birthYear;
    private final String lastName;
    private final String firstName;

    public Person(int birthYear, String lastName, String firstName){

        this.birthYear = birthYear;
        this.lastName = lastName;
        this.firstName = firstName;

    }

    public int getBirthYear(){
        
        return birthYear;
    }

    public String getLastName(){

        return lastName;
    }

    public String getFirstName(){

        return firstName;
    }

}
