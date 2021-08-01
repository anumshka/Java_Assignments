public class Student
{
    String firstName;
    String dateOfBirth;

    Student(String firstName,String dateOfBirth)
    {
        this.firstName = firstName;
        this.dateOfBirth=dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
}


