
class Animal {

    void speak() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal myAnimal; // Parent class reference

        myAnimal = new Dog();
        myAnimal.speak();  // Calls Dog's version of speak()

        myAnimal = new Cat();
        myAnimal.speak();  // Calls Cat's version of speak()
    }
}

/*
Output:
    Dog barks.
    Cat meows.

Explanation:
    - In this example, we have a parent class Animal and two child classes Dog and Cat that extend Animal.
    - The Animal class has a method speak that prints a generic animal sound.
    - The Dog class overrides the speak method to print a specific sound for a dog (bark).
    - The Cat class overrides the speak method to print a specific sound for a cat (meow).
    - In the main method, we create a reference of type Animal.
    - We assign a Dog object to the reference, and when we call the speak method, it prints "Dog barks." (from the Dog class).
    - We then assign a Cat object to the reference, and when we call the speak method again, it prints "Cat meows." (from the Cat class).
    - This demonstrates polymorphism, where the same method name behaves differently based on the type of object it is called on.
*/
