package testing;

import catalog.Catalog;
import catalog.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCatalog {
    
    private final Catalog underTest = new Catalog();
    
    @Test(expected = IllegalArgumentException.class)
    public void addingAMinorShouldThrowException() {
        assertEquals(0, underTest.getNrOfPeople());
        Person p = new Person(2015);
        underTest.addPerson(p);
    }
    
    @Test
    public void addingAnAdultShouldSucceed() {
        assertEquals(0, underTest.getNrOfPeople());
        Person p = new Person(1985);
        underTest.addPerson(p);
        assertEquals(1, underTest.getNrOfPeople());
    }
}
