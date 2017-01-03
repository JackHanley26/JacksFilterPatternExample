import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackhanley on 03/01/2017.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {

        List<Animal> maleAnimal = new ArrayList<Animal>();

        for (Animal animal : animals) {
            if(animal.getGender().equalsIgnoreCase("MALE")){
                maleAnimal.add(animal);
            }
        }
        return maleAnimal;

    }
}
