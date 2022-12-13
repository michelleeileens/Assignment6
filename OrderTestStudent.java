import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order a,b;
	@BeforeEach
	void setUp() throws Exception {
		a = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		b = new Order(12, Day.SATURDAY, new Customer("Mary", 45));
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void test() {
		Coffee cf = new Coffee("Espresso", Size.SMALL, false, false);
		Alcohol al = new Alcohol("Old Fashion", Size.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", Size.MEDIUM, 1, false);
		
		assertTrue(a.getTotalItems() == 0);
		a.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertTrue(a.getBeverage(0).getType().equals(Type.COFFEE));
	}

}
