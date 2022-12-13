import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	Customer a,b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Customer ("Kate", 22);
		b = new Customer ("Kate", 25);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void test() {
		assertFalse(a.equals(b));
	}

}
