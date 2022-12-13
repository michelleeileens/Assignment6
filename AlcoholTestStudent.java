import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	
	Alcohol a, b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Alcohol("Jameson", Size.MEDIUM, false);
		b = new Alcohol("Bintang", Size.LARGE, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void test() {
		assertFalse(a.equals(b));
		assertEquals(4.6, b.calcPrice(), .01);
	}

}
