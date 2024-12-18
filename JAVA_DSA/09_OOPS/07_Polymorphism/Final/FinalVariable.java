package Final;

class Dog {
    final String name = "Buddy";  // The name variable is declared final, so it cannot be changed once it's assigned
}

public class FinalVariable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog = new Dog();  // This would be an error, as dog is a final reference
        System.out.println(dog.name);  // Outputs: Buddy
    }
}