import java.io.*;
// Abstraction-
// Interface defining a vehicle
interface Vehicle {
    void start();
    void stop();
}
// Class representing a Car
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
    public void stop() {
        System.out.println("Car stops");
    }
}
// Class representing a Bike
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }
    public void stop() {
        System.out.println("Bike stops");
    }
}

//Inheritance-
// class student inherited from person class
class Student extends Person {
    private int rollNo;
      public int getRollNo() {
        return rollNo;
    }
               public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println(rollNo);
    }
}

//Polymorphism
// Abstract class representing a Shape 
abstract class Shape {
    public abstract void draw();
}
// class repsenting shape like circle
class Circle extends Shape {
    public void draw() {
        System.out.println("Draws circle");
    }
}
// class representing shape like rectangle
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Draws rectangle");
    }
}

//Encapsulation-
class Person {
    private String name;
    private int age;
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public void displayInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Main1 {
    public static void main(String[] args) {
        // Encapsulation 
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.displayInfo();

        System.out.println();

        // Inheritance 
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.setRollNo(12345);
        student.displayInfo();

        System.out.println();

        // Polymorphism 
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println();

        // Abstraction
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}