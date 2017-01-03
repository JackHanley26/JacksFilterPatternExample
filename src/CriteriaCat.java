import java.util.ArrayList;
import java.util.List;

public class CriteriaCat implements Criteria{

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        List<Animal> cats = new ArrayList<Animal>();

        for (Animal animal : animals) {
            if(animal.getType().equalsIgnoreCase("cat")){
                cats.add(animal);
            }
        }
        return cats;
    }
}
