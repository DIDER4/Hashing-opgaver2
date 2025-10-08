import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
class BilTest {

    @Test
    void test_Bil(){

        //Arrange
        HashSet<Bil> biler= new HashSet<>();
        Bil bil = new Bil("HW34248", "Trabant", "S01","Rød");
        Bil bil2 = new Bil("SH23422", "Volvo", "S02","Blå");
        Bil bil3 = new Bil("MN76575", "Trabant", "S03","Rød");
        Bil bil4 = new Bil("KW86575", "VW", "S04","Gul");
        Bil bil5 = new Bil("HC32543", "Tesla", "S05","Sort");

        //Act - add to set
        biler.add(bil);
        biler.add(bil2);
        biler.add(bil3);
        biler.add(bil4);
        biler.add(bil5);

        //Assert - all five are present
        assertEquals(5, biler.size());
        assertTrue(biler.contains(bil));
        assertTrue(biler.contains(bil2));

        //Create a duplicate according to equals/hashCode (same registreringsnummer and mærke)
        Bil duplicate = new Bil("HW34248", "Trabant", "S99","Lilla");
        // hashCode should match
        assertEquals(bil.hashCode(), duplicate.hashCode());
        // equals should be true (based on current equals implementation)
        assertTrue(bil.equals(duplicate));
        assertTrue(duplicate.equals(bil));

        //Adding the duplicate should not increase the set size
        biler.add(duplicate);
        assertEquals(5, biler.size());

        //Test getters
        assertEquals("Rød", bil.getFarve());
        assertEquals("Trabant", bil.getMærke());
        assertEquals("S01", bil.getModel());
        assertEquals("HW34248", bil.getRegistreringsnummer());

        //Test setters
        bil5.setFarve("Hvid");
        assertEquals("Hvid", bil5.getFarve());

    }
  
}