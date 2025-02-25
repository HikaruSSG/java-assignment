// Subclass one inheriting from AbstractClassExample
public class SubclassOne extends AbstractClassExample {

    // Constructor for SubclassOne
    public SubclassOne(String name) {
        super(name);
    }

    // Implementation of the getDescription method
    @Override
    public String getDescription() {
        return "This is SubclassOne.";
    }
}
