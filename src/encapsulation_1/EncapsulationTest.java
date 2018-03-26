package encapsulation_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.framework.TestCase;

public class EncapsulationTest extends TestCase {
	
	@Test
	public void testEncapsulation() {
		// items
		EncapsulateTheData a = new EncapsulateTheData();
		a.setItems(452);
		assertEquals(452, a.getItems());
		a.setItems(-4);
		assertEquals(0, a.getItems());
	}
}
