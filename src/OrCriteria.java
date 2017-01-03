import java.util.List;

public class OrCriteria implements Criteria {


    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {

        List<Animal> firstCriteriaItems = criteria.meetCriteria(animals);
        List<Animal> otherCriteriaItems = otherCriteria.meetCriteria(animals);

        for (Animal animal : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(animal)) {
                firstCriteriaItems.add(animal);
            }
        }
        return firstCriteriaItems;


    }
}
