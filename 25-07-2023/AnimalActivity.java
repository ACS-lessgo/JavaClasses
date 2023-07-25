//											Animals
//											   |
//					 ------------------------------------------------------------------
//					 |																  |
//					WildAnimals													ZooAnimals
//						|															|
//					------------------------------							------------------------------
//					|				|			|							|              |			 |
//				Carnivores		Herbivores		Omnivores				Mammals			  Birds      Reptiles
//





public class AnimalActivity {
    public static void main(String[] args) {
        System.out.println("<------- Animal Activities ------->");

        //Mammals
        Mammal cheetah = new Mammal("Leo", "cheetah", 5);
        cheetah.displayInfo();
        cheetah.feed();
        cheetah.makeSound();
        cheetah.sleep();
        System.out.println("Age: " + cheetah.getAge() + " years");
        System.out.println();

        Mammal elephant = new Mammal("Rolex", "Elephant", 10);
        elephant.displayInfo();
        elephant.feed();
        elephant.makeSound();
        elephant.sleep();
        System.out.println("Age: " + elephant.getAge() + " years");
        System.out.println();

        //Birds
        Bird parrot = new Bird("Surya", "Parrot", 3);
        parrot.displayInfo();
        parrot.feed();
        parrot.makeSound();
        parrot.sleep();
        System.out.println("Age: " + parrot.getAge() + " years");
        System.out.println();

        Bird penguin = new Bird("Grumpy", "Penguin", 2);
        penguin.displayInfo();
        penguin.feed();
        penguin.makeSound();
        penguin.sleep();
        System.out.println("Age: " + penguin.getAge() + " years");
        System.out.println();

        
        //Reptiles
        Reptiles crocodile = new Reptiles("Harry","reptiles", 20);
        crocodile.displayInfo();
        crocodile.feed();
        crocodile.makeSound();
        crocodile.layEggs();
        System.out.println("Age: "+crocodile.getAge() + " years");
        System.out.println();
        
        //Wild Animal Tiger Carnivore
        
        Carnivores Tiger = new Carnivores("Raja","Bengal Tiger");
        Tiger.displayInfo();
        Tiger.feed();
        Tiger.makeSound();
        Tiger.hunt();
        System.out.println();
        
        
        //Wild Animal Chimpanzee Omnivore
        
        Omnivores chimp = new Omnivores("Mark", "chimpanzee");
        chimp.displayInfo();
        chimp.feed();
        chimp.makeSound();
        chimp.hunt();
        System.out.println();
        
        //Wild Animal Deer Herbivore
        
        Herbivores deer = new Herbivores("Zoro", "MountainDeer");
        deer.displayInfo();
        deer.feed();
        deer.makeSound();
        deer.hunt();
        System.out.println("<---------------------------------->");
    }
}

interface Animal {
    void feed();
    void makeSound();
    void sleep();
}

abstract class WildAnimal implements Animal {
    protected String name;
    protected String species;

    public WildAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public abstract void hunt();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }
}

class Carnivores extends WildAnimal {
    public Carnivores(String name, String species) {
        super(name, species);
    }

    public void feed() {
        System.out.println("I'm a carnivour i eat only meat.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is roaring.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is sleeping.");
    }

    public void hunt() {
        System.out.println(name + " the " + species + " is hunting.");
    }
}

class Omnivores extends WildAnimal {
    public Omnivores(String name, String species) {
        super(name, species);
    }

    public void feed() {
        System.out.println("I'm a Omnivour animal i eat both meat and grass.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is making some sound.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is sleeping.");
    }

    public void hunt() {
        System.out.println(name + " the " + species + " is hunting.");
    }
}

class Herbivores extends WildAnimal {
    public Herbivores(String name, String species) {
        super(name, species);
    }

    public void feed() {
        System.out.println("I'm a Herbivour animal i eat grass.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is making some sound.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is sleeping.");
    }

    public void hunt() {
        System.out.println(name + " the " + species + " cannot hunt only eats grass.");
    }
}

abstract class ZooAnimal implements Animal {
    protected String name;
    protected String species;

    public ZooAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public abstract int getAge();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }
}

class Mammal extends ZooAnimal {
    private int age;

    public Mammal(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void feed() {
        System.out.println(name + " the " + species + " is being fed.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is making a sound.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is sleeping.");
    }
}

class Bird extends ZooAnimal {
    private int age;

    public Bird(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void feed() {
        System.out.println(name + " the " + species + " is being fed.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is chirping.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is perching and sleeping.");
    }
}
class Reptiles extends ZooAnimal {
    private int age;

    public Reptiles(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void feed() {
        System.out.println(name + " the " + species + " is being fed.");
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " is hissing.");
    }

    public void sleep() {
        System.out.println(name + " the " + species + " is sleeping.");
    }
    public void layEggs() {
    	System.out.println(name + " the " + species + " is laying eggs.");
    }
}
