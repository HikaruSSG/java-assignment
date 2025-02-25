// Class demonstrating encapsulation
public class EncapsulationExample {

    private int id; // ID of the object
    private String name; // Name of the object

    // Constructor for EncapsulationExample
    public EncapsulationExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for the ID
    public int getId() {
        return id;
    }

    // Setter for the ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }
}
