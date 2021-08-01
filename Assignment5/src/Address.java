import java.io.Serializable;

public class Address implements Serializable {


    String city;
    String State;
    int pinCode;
    String country;

    public Address(String city, String State, int pinCode, String country) {
        this.city = city;
        this.State = State;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getState() {
        return State;
    }

    public String getCountry() {
        return country;
    }

    public String print() {
        return "From " + getCity() + "," + getState() + "," + getCountry() + " PIN: " + getPinCode();
    }


}