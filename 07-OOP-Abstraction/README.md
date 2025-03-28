# OOP - Abstract Classes & Interfaces - Day 7
## Topics Covered:
- Abstract Classes (`abstract` keyword)
- Implementing Interfaces (`implements` keyword)
- Difference Between Abstract Classes & Interfaces
- Multiple Interface Implementation

## Challenges:
- (None)
## Takeaways:
**What is Abstraction?** Abstraction means hiding implementation details and showing only the essential features of an object.
It helps in reducing complexity and improving reusability.

There are two ways to achieve abstraction in Java:
- Abstract Classes
- Interfaces




**Abstract Classes & Methods** 

An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without a body).

*Key Points:*
- The `abstract` keyword is used to define an abstract class.
- Abstract methods must be implemented in subclasses.
- A subclass must override all abstract methods or be declared `abstract` itself.

**Implementing Interfaces (`implements` keyword)** 

An interface is a blueprint for a class that contains only abstract methods (before Java 8) and default/static methods (from Java 8 onwards).
Unlike abstract classes, a class can implement multiple interfaces (Java does not support multiple inheritance with classes).

*Key Points:*
- Interfaces are declared using the `interface` keyword.
- A class must implement all methods of an interface or be declared `abstract`.
- A class can implement multiple interfaces.

*Why Use Interfaces?*
- Supports Multiple Inheritance (A class can implement multiple interfaces).
- Encourages Loose Coupling (Separate what an object does from how it does it).
- Enhances Testability (Easier to mock interfaces in unit testing).


**Difference Between Abstract Classes & Interfaces**

| Feature       | Abstract Class                          | Interface                              |
|---------------|-----------------------------------------|----------------------------------------|
| Inheritance   | Can extend only one class              | Can implement multiple interfaces      |
| Methods       | Can have both abstract & concrete methods | Only abstract methods (before Java 8) |
| Fields        | Can have instance variables            | Only static & final variables          |
| Constructor   | Can have a constructor                 | Cannot have a constructor              |
