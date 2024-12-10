import org.example.Main;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    void testAge(){
        Main m1 = new Main();
        assertTrue(m1.age(18));
        assertFalse(m1.age(16));

        assertEquals(19,m1.add(9,10));

        assertFalse(m1.phoneNumberChecker("1234560"));

        assertEquals(1,m1.addItem(2).size());

        //i want to see if i add an element to a list really did added in the list?

    }





}
