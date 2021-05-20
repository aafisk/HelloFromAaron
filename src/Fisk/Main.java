package Fisk;

public class Main {

    public static void main (String[] args) {
        System.out.println("Hello, my name is Aaron");

        Person alex = new Person("Alex");
        System.out.println(alex.sayHello());

        Person nicole = new Person("Nicole");
        System.out.println(nicole.sayHello());
    }
}
