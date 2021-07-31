public class Employee {

    String Name;
    String Email;
    int Age;
    String DOB;

    //getter and setter methods
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
