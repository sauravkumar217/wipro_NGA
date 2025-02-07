import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MathAddTest {

    @Test
    public void testAdd() {
        MathAdd mathAdd = new MathAdd();
        int result = mathAdd.add(5, 3);
        
        // Check if the result is correct
        assertEquals("5 + 3 should be 8", 8, result);
        
        // Check if the result is NOT a wrong value
        assertNotEquals("5 + 3 should not be 10", 10, result);
    }
}
