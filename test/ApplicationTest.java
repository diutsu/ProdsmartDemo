import models.Product;
import models.Worker;

import org.junit.Test;

import play.test.Fixtures;
import play.test.FunctionalTest;

public class ApplicationTest extends FunctionalTest {

	@Test
	public void fullTest() {
		Fixtures.deleteDatabase();
		Fixtures.loadModels("data.yml");

		// Count things
		assertEquals(2, Worker.count());
		assertEquals("3455", ((Product) Product.findById((long) 1)).code);
		assertEquals(Integer.valueOf(1), Integer.valueOf(((Worker) Worker.findById((long) 1)).number));
	}
}