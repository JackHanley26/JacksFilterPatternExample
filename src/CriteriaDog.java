import java.util.ArrayList;
import java.util.List;

public class CriteriaDog implements Criteria{

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        List<Animal> dogs = new ArrayList<Animal>();

        for (Animal animal : animals) {
            if(animal.getType().equalsIgnoreCase("dog")){
                dogs.add(animal);
            }
        }
        return dogs;
    }
}
