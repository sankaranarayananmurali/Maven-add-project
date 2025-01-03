package jar;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
   
    public void testAdd() {
        App app = new App(); // Create an instance of the App class
        int result = app.add(2, 3); // Call the add method
        assertEquals(5, result, "Addition result should be 5"); // Test that the result equals 5
    }
}
