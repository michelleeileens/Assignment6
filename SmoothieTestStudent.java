import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	Smoothie a,b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Smoothie("Power Shake", Size.LARGE, 4, true);
		b = new Smoothie("Acai Energy", Size.MEDIUM, 6, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void test() {
		assertFalse(a.equals(b));
		assertEquals(6.0, b.calcPrice(), .01);
	}

}
