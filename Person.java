 1.1 Person.java
public class Person {
    private String name;
    private int age;

    
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 25);

        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
    }
}
