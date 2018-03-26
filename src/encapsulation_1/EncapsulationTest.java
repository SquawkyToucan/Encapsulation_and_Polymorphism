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
		// degrees
		a.setDegrees(334.2791);
		assertEquals(334.2791, a.getDegrees());
		a.setDegrees(-65138);
		// nomenclature
		a.setNomen("niriri es una buena canción");
		assertEquals("niriri es una buena canción", a.getNomen());
		a.setNomen("");
		assertEquals(" ", a.getNomen());
		// object
		a.setMemberObject("ñîrîrî");
		if(a.getMemberObject() instanceof String) {
			System.err.println("It is still a string");
		}
	}
}
