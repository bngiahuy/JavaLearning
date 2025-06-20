// Normal Java class with OOP concepts
class AnimalNormal {
    private String name;

    public AnimalNormal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Demonstration of inheritance and method overriding
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        super.animalSound(); // Call the parent class method
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

// Demonstration of interface implementation
interface AnimalInterface {
    public void animalSound(); // Method to be implemented by classes that implement this interface
}

class Cat implements AnimalInterface {
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

public class OopExample {

    public static void main(String[] a) {
        AnimalNormal dog = new AnimalNormal("Dog");
        System.out.println("Animal name: " + dog.getName());

        dog.setName("Cat");
        System.out.println("Updated animal name: " + dog.getName());

        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        AnimalInterface myCat = new Cat();  // Create a Cat object using the interface
        myCat.animalSound();  // Call the animalSound method on the Cat object
    }
}
