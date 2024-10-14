package generalization;

public class Person {


    private String name;
    private double age;
    private String city;
    private String email;

    public Person() {

    }

    public Person(String name, double age, String city, String email) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    public void displayPersonalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Email: " + email);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}