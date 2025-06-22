// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Class to demonstrate method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class poly {
    public static void main(String[] args) {
        // Method Overriding Example (Run-time Polymorphism)
        Animal a;
        
        a = new Dog();  // Animal reference but Dog object
        a.sound();      // Outputs: Dog barks
        
        a = new Cat();  // Animal reference but Cat object
        a.sound();      // Outputs: Cat meows

        // Method Overloading Example (Compile-time Polymorphism)
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(4.5, 5.5));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
    }
}
