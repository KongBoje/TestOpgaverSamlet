/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import myarraylistwithbugs.MyArrayListWithBugs;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Micha
 */
public class MyArrayListWithBugsTest {
    
    private MyArrayListWithBugs bugs;
    
    // Setting up arrayList and checking size
    @Before
    public void setUp() {
        bugs = new MyArrayListWithBugs();
        assertEquals(0, this.bugs.size());
    }
    
    // Testing the add method to an empty list.
    // TC001
    @Test
    public void addToEmptyList() {
        String Obj = "Object";
        bugs.add(Obj);
        assertEquals(1, this.bugs.size());
        assertEquals(Obj, bugs.get(0));
    }
    
    // Testing the IndexOutOfBoundsException for get.
    // TC002
    @Test(expected = IndexOutOfBoundsException.class)
    public void getItemFromEmptyList() {
        bugs.get(0);
    }
    
    // Testing the IndexOutOfBoundsException for add.
    // TC003
    @Test(expected = IndexOutOfBoundsException.class)
    public void addObjToEmptyList() {
        String Obj = "Object";
        bugs.add(0, Obj);
    }
    
    // Testing the add method to a not empty list
    // TC004
    @Test
    public void addObjToIndexedList() {
        addToEmptyList();
        String Obj = "Object";
        bugs.add(Obj);
        assertEquals(2, this.bugs.size());
        assertEquals(Obj, bugs.get(1));
    }
    
    // Testing the removal of an Index out of bounds.
    // TC005
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeFromEmptyList() {
        String Obj = (String) bugs.remove(0);
        String Obj2 = "Object";
        assertEquals(Obj, Obj2);
        assertEquals(0, this.bugs.size());
    }
    
    // Testing the removal of an index from the list
    // TC006
    @Test
    public void removeFromList() {
        addToEmptyList();
        String Obj = (String) bugs.remove(0);
        String Obj2 = "Object";
        assertEquals(Obj, Obj2);
        assertEquals(0, this.bugs.size());
    }
}
