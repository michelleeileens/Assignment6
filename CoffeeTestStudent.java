import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	Coffee a,b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Coffee("Latte", Size.LARGE, true, true);
		b = new Coffee("Flat White", Size.SMALL, true, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void test() {
		assertFalse(a.equals(b));
		assertEquals(2.5, b.calcPrice(), .01);
	}

}
