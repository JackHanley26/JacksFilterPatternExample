import java.util.List;

public class AndCriteria  implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {


        List<Animal> firstCriteriaPersons = criteria.meetCriteria(animals);
        return otherCriteria.meetCriteria(firstCriteriaPersons);

    }
}
