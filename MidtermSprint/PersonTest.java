package MidtermSprint;

public class PersonTest {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person(101, "John Doe", 45, "709-123-4567");

        // Display Person Information
        System.out.println("Testing Person Class:");
        person.displayInfo();

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Phone Number: " + person.getPhoneNumber());

        // Test Setters
        System.out.println("\nTesting Setters:");
        person.setName("Jane Doe");
        person.setAge(30);
        person.setPhoneNumber("709-987-6543");

        // Display updated information
        System.out.println("Updated Information:");
        person.displayInfo();
    }
}
