// Implement Pet Class
public class Pet {
    // define class attributes
    private String name;
    private int age;
    private String location;
    private String type;

    //Class Methods...
    // Empty Constructor - supplies default information for each attribute
    public Pet() {
        this.name = "Rover";
        this.age = 2;
        this.location = "West Kennel 3";
        this.type = "Dog";
    }

    //  Constructor that takes in ALL attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override the default toString Method
    @Override
    public String toString() {
        return "Pet{ name: " + name  +
             "\n      age: " + age +
             "\n location: " + location +
             "\n     type: " + type +
             "}";
    }
}

