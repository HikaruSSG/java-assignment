// Class to test the system
public class TestClass {

    public static void main(String[] args) {
        // Create instances of the subclasses
        AbstractClassExample subclassOne = new SubclassOne("Subclass One");
        AbstractClassExample subclassTwo = new SubclassTwo("Subclass Two");

        // Print the name and description of each subclass
        System.out.println(subclassOne.getName() + ": " + subclassOne.getDescription());
        System.out.println(subclassTwo.getName() + ": " + subclassTwo.getDescription());

        // Create an instance of the EncapsulationExample class
        EncapsulationExample encapsulationExample = new EncapsulationExample(1, "Example Name");
        // Print the ID and name of the EncapsulationExample object
        System.out.println("Encapsulation Example ID: " + encapsulationExample.getId());
        System.out.println("Encapsulation Example Name: " + encapsulationExample.getName());

        // Update the ID and name of the EncapsulationExample object
        encapsulationExample.setId(2);
        encapsulationExample.setName("New Example Name");

        // Print the updated ID and name of the EncapsulationExample object
        System.out.println("Updated Encapsulation Example ID: " + encapsulationExample.getId());
        System.out.println("Updated Encapsulation Example Name: " + encapsulationExample.getName());
    }
}
