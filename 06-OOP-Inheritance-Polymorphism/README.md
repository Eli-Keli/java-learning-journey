# OOP - Inheritance & Polymorphism - Day 6
## Topics Covered:
- Understanding Inheritance (Parent & Child Classes)
- Extending a Class (`extends` keyword)
- Using `super` keyword
- Method Overriding
- Method Overloading
- Polymorphism

## Challenges:
- (None)
## Takeaways:
**What is Inheritance?** Inheritance is a mechanism where a child class (subclass) derives properties and behaviors from a parent class (superclass).

*Benefits:*
- Code Reusability
- Improves Maintainability
- Establishes a Hierarchy

**Using `super` keyword** - The `super` keyword refers to the parent class and is used to:
- Call a parent class method
- Access a parent class variable
- Call a parent class constructor

**What is Polymorphism?** Polymorphism means "many forms" and allows a method to behave differently based on the object that calls it.

*Two Types of Polymorphism*
- Method Overloading (Compile-time Polymorphism)
- Method Overriding (Runtime Polymorphism)

**Method overriding** allows a child class to provide a specific implementation of a method from the parent class.

*Rules for Method Overriding:*
- The method name must be the same in both classes.
- The method signature must be the same in both classes.
- The return type must be the same or a subtype of the parent class.

**Method Overloading** allows a class to have more than one method with the same name but different parameters.

*Rules for Method Overloading:*
- The method name must be the same.
- The method signature must be different (number of parameters, type of parameters, or order of parameters).
