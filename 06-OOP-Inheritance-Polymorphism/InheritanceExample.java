
// Parent Class (Superclass)
class Animal {

    String name;

    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Child Class (Subclass)
class Dog extends Animal {

    void makeSound() {
        System.out.println(name + " barks!");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.makeSound();  // Calls overridden method in Dog class
    }
}

/*
Output:
    Buddy barks!

Explanation:
    - In this example, we have a parent class Animal and a child class Dog that extends Animal.
    - The Animal class has a field name and a method makeSound that prints a generic animal sound.
    - The Dog class overrides the makeSound method to print a specific sound for a dog (bark).
    - In the main method, we create an instance of the Dog class and set the name field to "Buddy".
    - When we call the makeSound method on the Dog instance, it prints "Buddy barks!" instead of the generic animal sound.
    - This demonstrates polymorphism, where the same method name behaves differently based on the type of object it is called on.
*/
