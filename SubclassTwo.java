// Subclass two inheriting from AbstractClassExample
public class SubclassTwo extends AbstractClassExample {

    // Constructor for SubclassTwo
    public SubclassTwo(String name) {
        super(name);
    }

    // Implementation of the getDescription method
    @Override
    public String getDescription() {
        return "This is SubclassTwo.";
    }
}
