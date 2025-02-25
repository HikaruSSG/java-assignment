// Abstract class example
public abstract class AbstractClassExample {

    private String name; // Name of the object

    // Constructor for the abstract class
    public AbstractClassExample(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Abstract method to get the description
    public abstract String getDescription();
}
