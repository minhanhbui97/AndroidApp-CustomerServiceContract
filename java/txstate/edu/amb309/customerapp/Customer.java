package txstate.edu.amb309.customerapp;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String type;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, int age, String type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //@androidx.annotation.NonNull
    @Override
    public String toString() {
        //return super.toString();

        return "ID " + id + " - " + lastName ;
    }
}
