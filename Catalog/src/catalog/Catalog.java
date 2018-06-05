package catalog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Catalog {
    private List<Person> people = new ArrayList<>();
    
    public void addPerson(Person person) {
        if(Calendar.getInstance().get(Calendar.YEAR) - person.getYearOfBirth() < 18) {
            throw new IllegalArgumentException("Only adult admitted.");
        }
        people.add(person);
    }
    
    public int getNrOfPeople() {
        return people.size();
    }
}
