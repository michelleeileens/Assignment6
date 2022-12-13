import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {

	BevShop a;
	@BeforeEach
	void setUp() throws Exception {
		a = new BevShop();
	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
	}
	

	@Test
	void test() {
		assertTrue(a.isValidAge(40));
	}

}
