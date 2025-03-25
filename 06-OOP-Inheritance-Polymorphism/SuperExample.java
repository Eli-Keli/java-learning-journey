
class Animal {

    String name = "Animal";

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    String name = "Cat";

    void makeSound() {
        super.makeSound();  // Calls parent class method
        System.out.println(name + " meows!");
    }
}

public class SuperExample {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}

/*
Output:
    Animal makes a sound
    Cat meows!

Explanation:
    - In this example, we have a parent class Animal and a child class Cat that extends Animal.
    - The Animal class has a field name and a method makeSound that prints a generic animal sound.
    - The Cat class overrides the makeSound method to print a specific sound for a cat (meow) and also calls the parent class method using super.
    - In the main method, we create an instance of the Cat class.
    - When we call the makeSound method on the Cat instance, it first prints "Animal makes a sound" (from the parent class) and then "Cat meows!".
    - This demonstrates the use of the super keyword to call a method from the parent class within an overridden method in the child class.
*/
