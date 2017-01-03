import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("Molly", "Female", "Dog"));
        animals.add(new Animal("Copper", "Female", "Dog"));
        animals.add(new Animal("Bob", "Male", "Cat"));
        animals.add(new Animal("Denis", "Male", "Snake"));
        animals.add(new Animal("Felix", "Male", "Cat"));



        Criteria male = new CriteriaMale();

        Criteria dog = new CriteriaDog();

        Criteria cat = new CriteriaCat();

        Criteria maleDog = new AndCriteria(male, dog);

        OrCriteria dogOrCat = new OrCriteria(dog, cat);


        System.out.println("Males: ");
        printAnimals(male.meetCriteria(animals));

        System.out.println("\nDogs: ");
        printAnimals(dog.meetCriteria(animals));

        System.out.println("\nCats: ");
        printAnimals(cat.meetCriteria(animals));

        System.out.println("\nMale Dogs: ");
        printAnimals(maleDog.meetCriteria(animals));

        System.out.println("\nDog Or Cat: ");
        printAnimals(dogOrCat.meetCriteria(animals));

    }


    public static void printAnimals(List<Animal> animals){

        for (Animal animal : animals) {
            System.out.println("Animal : [ Name : " + animal.getName() + ", Gender : " + animal.getGender() + ", Type : " + animal.getType() + " ]");
        }
    }

}
