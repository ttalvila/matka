package fi.agileo.matkaan.keskus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatkustajaTest {
	Matkustaja matkustaja;
	@Before
	public void setUp() throws Exception {
		matkustaja = new Matkustaja("Ville Virtanen");
	}

	@After
	public void tearDown() throws Exception {
		matkustaja = null;
	}

	@Test
	public void test() {
		assertNotNull(matkustaja);
		assertEquals("Ville Virtanen", matkustaja.getNimi());
		assertNotEquals("Kalle Virtanen", matkustaja.getNimi());
	}

}
