import org.junit.*;
import play.test.*;
import models.*;
import play.test.Fixtures;

public class ApplicationTest extends FunctionalTest {
    
    @Test
    public void fullTest() {
    	Fixtures.loadModels("data.yml");
    	
     
        // Count things
        assertEquals(2, Worker.count());
    }
}